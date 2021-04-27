package com.multi.newForkTest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

public class HelloController {
	@RequestMapping("/") // 포트번호까지만 친것과 동일함
	public ModelAndView hello() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("model", "hello boot~");
		mv.setViewName("NewFile");
		return mv;
	}
}
