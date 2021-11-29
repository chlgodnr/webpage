package com.hae.springEx01.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("view/*")//요청 url 매핑 > URL에 view라는 요청이 들어오면 무조건 ViewController.java으로 보내겠다.
public class ViewController {

	@RequestMapping("view/dashboard") 
	public ModelAndView dashboard() { // : URL에 view/dashboard라는 요청이 들어오면 dashboard() 라는 메소드로 보내겠다.
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}