package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/productDelete")
public class ProductDelete {
	@Autowired
	private ProductService productService;

	@RequestMapping
	public String productModify(@RequestParam("id") int id) {
		productService.productDelete(id);
		return "redirect:index_nonelogin.jeju";
	}
}

// productDelete.jeju?id=${product.id}