package com.example.demo.board.web;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;


@Controller    // @Component의 subclass 1. 컨테이너에 빈 등록 2. 컨트롤러화(상속대신) POJO(상속받지 않고 독자적)
public class BoardController {

	@Autowired
	BoardService boardService;
	
	
	
	
	// 전체조회       Model model 은 값을 담아서 이동해야할때 사용 == model에 값이 담김 교재 139p
	@GetMapping("/board")
	public String selectall(Model model) {
		model.addAttribute("list", boardService.getList());
		return "board/list";
	}
	
	// 단건조회
	@GetMapping("/board/info")
	public void info(@RequestParam("bno") Long bno,
			         Model model) {
		model.addAttribute("board", boardService.getBoard(bno));
		
	}
	
	
	// 등록페이지
	@GetMapping("/board/register")
	public String registerpage(Model model) {
		return "board/register";
	}
	
	// 등록처리
	@PostMapping("/board/register")
	public String register(BoardVO board) {
		boardService.insert(board);
		return "redirect:/board";
	}
	
	// 수정페이지로 이동
	@GetMapping("/board/update")   // board/update?bno=1      /board/update/1
	public String updatepage(Model model, @RequestParam("bno") Long bno) {
										   // BoardVO 타입이면 BoardVO로 받으면 됨
		BoardVO vo = boardService.getBoard(bno);
		
		model.addAttribute("board", vo);
		
		return "board/register";
	}
	
	// 수정처리
	@PostMapping("/board/update")
	public String update(BoardVO board) {
		boardService.update(board);
		//return "redirect:/board/update?bno=" + board.getBno();
		return "redirect:/board";
	}
	
	// 삭제처리
	@PostMapping("/board/delete")
    public String delete(@RequestParam Map<String, Object> board) {
		boardService.delete(board);
		
		return "redirect:/board";
	}

}
