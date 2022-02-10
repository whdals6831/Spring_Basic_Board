package com.example.board.service;

import java.util.List;

import com.example.board.domain.CommentDTO;

public interface CommentService {

    public boolean registerComment(CommentDTO params);

    public boolean deleteComment(Long idx);

    public List<CommentDTO> getCommentList(CommentDTO params);

}