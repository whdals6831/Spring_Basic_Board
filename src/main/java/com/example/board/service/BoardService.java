package com.example.board.service;

import java.util.List;
import com.example.board.domain.BoardDTO;
import com.example.board.paging.Criteria;
import org.springframework.web.multipart.MultipartFile;

public interface BoardService {

    public boolean registerBoard(BoardDTO params);

    public boolean registerBoard(BoardDTO params, MultipartFile[] files);

    public BoardDTO getBoardDetail(Long idx);

    public boolean deleteBoard(Long idx);

    public List<BoardDTO> getBoardList(BoardDTO params);

}