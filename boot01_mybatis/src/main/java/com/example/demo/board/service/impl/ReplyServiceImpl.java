package com.example.demo.board.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.board.mapper.ReplyMapper;
import com.example.demo.board.service.ReplyService;
import com.example.demo.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReplyServiceImpl implements ReplyService{
	
	private final ReplyMapper replyMapper;
	
	@Override
	public List<ReplyVO> getReplyList(Long bno) {
		return replyMapper.getReplyList(bno);
	}
	
	// 등록
	@Override
	public int insert(ReplyVO reply) {
		return replyMapper.insert(reply);
	}
	
	// 삭제
	@Override
	public int delete(Long rno) {
		return replyMapper.delete(rno);
	}

	

}
