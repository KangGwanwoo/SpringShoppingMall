package kr.ac.jeju.kang.controller;

import java.util.List;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/indexPage.jeju")
public class PageController {
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping
	public List<Product> board(@RequestParam("seq") int seq, Model model) {
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
		int pageNum = rownum/5+1;
		
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
		