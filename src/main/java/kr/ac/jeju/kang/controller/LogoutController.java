package kr.ac.jeju.kang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.Product;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/logOut")
public class LogoutController {

	@RequestMapping
	public String logOut(HttpSession session){
		session.invalidate();
		return "redirect:index";
	}
}
