package com.assegd.springbootapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Home {
	
	@RequestMapping("/")
	public ModelAndView home() {
			ModelAndView mView = new ModelAndView();
			mView.setViewName("index.jsp");
			
			return mView;
	}

}
