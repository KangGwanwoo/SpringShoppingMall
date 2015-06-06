package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/productModify")
public class ProductModify {
	@Autowired
	private ProductService productService;

	@RequestMapping
	public String productModify(@ModelAttribute Product product) {
		productService.productModify(product);
		return "redirect:index_nonelogin.jeju";
	}
}
