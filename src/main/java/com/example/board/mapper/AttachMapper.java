package com.example.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.board.domain.AttachDTO;

@Mapper
public interface AttachMapper {

    public int insertAttach(List<AttachDTO> attachList);

    public AttachDTO selectAttachDetail(Long idx);

    public int deleteAttach(Long boardIdx);

    public List<AttachDTO> selectAttachList(Long boardIdx);

    public int selectAttachTotalCount(Long boardIdx);

}