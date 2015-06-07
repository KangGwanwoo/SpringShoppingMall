package kr.ac.jeju.kang.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProductList {
	
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping("/index")
	public ModelAndView confirmLogin(User user, HttpSession session, HttpServletRequest request){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:index_nonelogin.jeju");

		if(session.getAttribute("userLoginInfo")!=null){
			mav.setViewName("redirect:index_login.jeju");
		}else{

		}
		return mav;
	}
	
	@RequestMapping("/index_nonelogin")
	public List<Product> list(){
		return productService.list();
	}
	@RequestMapping("/index_login")
	public List<Product> list2(){
		return productService.list();
	}
	
}
