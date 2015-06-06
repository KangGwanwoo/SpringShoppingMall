package kr.ac.jeju.kang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.ProductService;
import kr.ac.jeju.kang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping
public class UserLogin {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("login")
	    public String login() {
	        return "login";
	}
	
	
	@RequestMapping("/userlogin")
	public ModelAndView login(User user, HttpSession session, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:index_login.jeju");
		
		User loginUser = userService.login(user);
		
		if(loginUser!=null){
			session.setAttribute("userLoginInfo", loginUser);
		}
		return mav;
	}
}
