package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/product_renew")
public class ProductRenew {
	@Autowired
	private ProductService productService;
	
	@RequestMapping
	public Product get(@RequestParam("id") int id){
		
		return productService.get(id);
	}
}
