package com.example.board.service;

import com.example.board.domain.BoardDTO;
import com.example.board.mapper.BoardMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.CollectionUtils;

import javax.transaction.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class BoardServiceTests {

    @Autowired
    private BoardServiceImpl boardService;

    BoardDTO params = new BoardDTO();

    @Test
    void registerBoardTest() {
        BoardDTO params = new BoardDTO();
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("테스터");
        System.out.println(params.getIdx());

        assertThat(boardService.registerBoard(params));
    }

    @Test
    void updateBoardTest() {
        BoardDTO params = new BoardDTO();
        params.setIdx((long) 1);
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("테스터");
        System.out.println(params.getIdx());

        assertThat(boardService.registerBoard(params));
    }

    @Test
    void getBoardDetailTest() {
        BoardDTO params = new BoardDTO();
        params.setIdx((long) 1);
        params.setTitle("1번 게시글 제목");
        params.setContent("1번 게시글 내용");
        params.setWriter("테스터");
        BoardDTO board = boardService.getBoardDetail((long) 1);
        try {
            String boardJson = new ObjectMapper().registerModule(new JavaTimeModule()).writeValueAsString(board);
            System.out.println(boardJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

    }

    @Test
    void deleteBoardTest() {
        BoardDTO params = boardService.getBoardDetail((long) 2);
        assertEquals("N", params.getDeleteYn());
        assertThat(boardService.deleteBoard((long) 2));
    }

    @Test
    void getBoardListTest() {
        List<BoardDTO> boardList = boardService.getBoardList(params);
        if (CollectionUtils.isEmpty(boardList) == false) {
            for (BoardDTO board : boardList) {
                System.out.println("=========================");
                System.out.println(board.getTitle());
                System.out.println(board.getContent());
                System.out.println(board.getWriter());
                System.out.println("=========================");

            }
        }
    }
}