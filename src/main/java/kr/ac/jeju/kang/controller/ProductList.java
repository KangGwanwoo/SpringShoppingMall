package kr.ac.jeju.kang.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class ProductList {
	
	@Autowired
	private ProductService productService;
	

	
	@RequestMapping("/index.jeju")
	public ModelAndView confirmLogin(User user, HttpSession session, HttpServletRequest request,@RequestParam(value = "seq", defaultValue = "1") int seq){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:index_nonelogin.jeju?seq="+seq);

		if(session.getAttribute("userLoginInfo")!=null){
			mav.setViewName("redirect:index_login.jeju?seq="+seq);
		}else{

		}
		return mav;
	}

	@RequestMapping("/index_nonelogin")
	public List<Product> list(@RequestParam("seq") int seq, Model model) {
		model.addAttribute("pnum", seq);
		int startPage = 0;
		int endPage = 0;
		int page = 0;
		try{
			startPage = (seq-1)/5*5+1;
			endPage =startPage+5-1;
			if(seq!=1){
				int temp = (seq-1)*15;
				page = temp;
			}else if(seq==1){
				page = 0;
			}
		}catch(Exception e){
		}
		int rownum = productService.getRow();
		int pageNum = rownum/15+1;
		
		if(rownum%15 == 0){
			pageNum--;
		}
		
		if(endPage > pageNum){
			endPage=pageNum;
		}
		
		List<Product> productlist = productService.listByPage(page);
		
		model.addAttribute("list",productlist);
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("start",startPage);
		model.addAttribute("end",endPage);
		return productlist;
	}
		
	@RequestMapping("/index_login")
	public List<Product> list2(@RequestParam("seq") int seq, Model model) {
		model.addAttribute("pnum", seq);
		int startPage = 0;
		int endPage = 0;
		int page = 0;
		try{
			startPage = (seq-1)/5*5+1;
			endPage =startPage+5-1;
			if(seq!=1){
				int temp = (seq-1)*15;
				page = temp;
			}else if(seq==1){
				page = 0;
			}
		}catch(Exception e){
		}
		int rownum = productService.getRow();
		int pageNum = rownum/15+1;
		
		if(rownum%15 == 0){
			pageNum--;
		}
		
		if(endPage > pageNum){
			endPage=pageNum;
		}
		
		List<Product> productlist = productService.listByPage(page);
		
		model.addAttribute("list",productlist);
		model.addAttribute("pageNum",pageNum);
		model.addAttribute("start",startPage);
		model.addAttribute("end",endPage);
		return productlist;
		
	}
}
