package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping("/signIn")
public class SignIn {
	@Autowired
	private UserService userService;
	@RequestMapping
	public String signIn(@ModelAttribute User user){
		userService.singIn(user);
		return "redirect:loginform.jeju";
	}

}


	