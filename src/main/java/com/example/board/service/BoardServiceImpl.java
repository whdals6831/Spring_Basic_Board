package com.example.board.service;

import com.example.board.domain.BoardDTO;
import com.example.board.mapper.BoardMapper;
import com.example.board.paging.Criteria;
import com.example.board.paging.PaginationInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class BoardServiceImpl implements BoardService {

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public boolean registerBoard(BoardDTO params) {
        int queryResult = 0; // 쿼리를 실행한 횟수

        if (params.getIdx() == null) {
            queryResult = boardMapper.insertBoard(params);
        }
        else {
            queryResult = boardMapper.updateBoard(params);
        }

//        BardDTO board = null; // Transaction 동작 확인용
//        System.out.println(board.getTitle());

        return (queryResult == 1) ? true : false;
    }

    @Override
    public BoardDTO getBoardDetail(Long idx) {
        return boardMapper.selectBoardDetail(idx);
    }

    @Override
    public boolean deleteBoard(Long idx) {
        int queryResult = 0;
        BoardDTO board = boardMapper.selectBoardDetail(idx);

        if (board != null && "N".equals(board.getDeleteYn())) {
            queryResult = boardMapper.deleteBoard(idx);
        }

        return (queryResult == 1) ? true : false;
    }

    @Override
    public List<BoardDTO> getBoardList(BoardDTO params) {
        List<BoardDTO> boardList = Collections.emptyList();
        int boardTotalCount = boardMapper.selectBoardTotalCount(params);

        PaginationInfo paginationInfo = new PaginationInfo(params);
        paginationInfo.setTotalRecordCount(boardTotalCount);

        params.setPaginationInfo(paginationInfo);

        if (boardTotalCount > 0) {
            boardList = boardMapper.selectBoardList(params);
        }

        return boardList;
    }
}
