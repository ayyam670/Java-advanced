package com.yedam.common;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

	@GetMapping("/")   // forward 방식
	public String hello() {
		return "hello";
	}
}
