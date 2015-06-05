package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/productModify")
public class ProductModify {
	
	private ProductService productService;
	
	@RequestMapping
	public String productModify(@ModelAttribute Product product){
		productService.productModify(product);
		return "redirect:index_login";
	}
}
