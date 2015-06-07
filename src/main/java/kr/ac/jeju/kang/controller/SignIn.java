package kr.ac.jeju.kang.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/signIn")
public class SignIn {
	@Autowired
	private UserService userService;
	@RequestMapping
	public ModelAndView signIn(User user, HttpSession session, HttpServletRequest request){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:loginform.jeju");
		
		User loginUser = userService.findId(user);
		
		if(loginUser!=null){
			session.setAttribute("errMsg", "이미 존재하는 아이디네요!");
			mav.setViewName("redirect:sign_In_form.jeju");
		}else{
			userService.singIn(user);
		}
		
		return mav;
	}

}


	