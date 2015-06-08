package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/save")
public class ProductSave {
	@Autowired
	private ProductService productService;
	@RequestMapping
	public String save(@ModelAttribute Product product){
		productService.save(product);
		return "redirect:index.jeju";
	}
}
