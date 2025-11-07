package com.yedam.board.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yedam.board.service.ReplyVO;

@Mapper
public interface ReplyMapper {

	// 댓글목록 조회
	List<ReplyVO> getReplyList(Long bno);
	
	// 등록
	int insert(ReplyVO reply);
	
	// 삭제
	int delete(Long rno);
}	
