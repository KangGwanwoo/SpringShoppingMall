package kr.ac.jeju.kang.controller;

import java.util.List;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index_login")
public class ProductList {
	
	@Autowired
	private ProductService productService;
	@RequestMapping
	public List<Product> list(){
		return productService.list();
	}
	
}
