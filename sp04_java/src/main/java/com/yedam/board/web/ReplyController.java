package com.yedam.board.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yedam.board.service.ReplyService;
import com.yedam.board.service.ReplyVO;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@RestController
public class ReplyController {

	private final ReplyService replyService;
	
	// 등록
	@PostMapping("/reply")      // localhost/reply
	public Map insert(@RequestBody ReplyVO vo) {
		int cnt = replyService.insert(vo);
		
		Map<String, Object> map = new HashMap<>();		// {"result": "success", "data": 1}
		map.put("result", "success");
		map.put("data", vo);
		return map;
		// {result : "success", data:""}
	}
	
	// 삭제
	@DeleteMapping("/reply/{rno}")       // localhost/rely/10
	public int delete(@PathVariable("rno") Long rno) {
		return replyService.delete(rno);
	}
						 // localhost/reply?bno=1
	// 전체조회            // localhost/board/1/reply
	@GetMapping("/board/{bno}/reply")
	public List<ReplyVO> select(@PathVariable("bno") Long bno) {
		return replyService.getReplyList(bno);
	}
}
