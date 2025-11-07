package com.yedam.board;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;
import com.yedam.config.DataSourceConfig;
import com.yedam.config.MybatisConfig;
import com.yedam.config.RootConfig;

@SpringJUnitConfig(classes = { DataSourceConfig.class,
		                       MybatisConfig.class,
		                       RootConfig.class })
public class ReplyServiceTest {

	@Autowired
	ReplyService replyService;

	@Test
	public void getReplyList() {
		ReplyVO replyVO = new ReplyVO();

		List<ReplyVO> result = replyService.getReplyList(1l);
		for(ReplyVO reply : result) {
			System.out.println(reply);			
		}
	}
	
	
	@Disabled
	@Test
	public void insertReply() {
		ReplyVO replyVO = new ReplyVO();

		replyVO.setBno(12l);
		replyVO.setReply("댓글등록테스트");
		replyVO.setReplyer("홍길동");
		int result = replyService.insert(replyVO);
		assertEquals(result, 1);
	}
	
	
}
