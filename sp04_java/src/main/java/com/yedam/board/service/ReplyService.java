package com.yedam.board.service;

import java.util.List;

public interface ReplyService {

	// 댓글목록 조회
		List<ReplyVO> getReplyList(Long bno);
		
		// 등록
		int insert(ReplyVO reply);
		
		// 삭제
		int delete(Long rno);
}
