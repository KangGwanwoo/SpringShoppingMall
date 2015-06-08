package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.SoldProduct;
import kr.ac.jeju.kang.service.BuyService;
import kr.ac.jeju.kang.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buyProduct")
public class BuyProductController {
	@Autowired
	private BuyService buyService;
	@Autowired
	private ProductService productService;
	
	
	@RequestMapping
	public String buyProduct(SoldProduct soldProduct){
		buyService.addList(soldProduct);
		productService.productDelete(soldProduct.getProductId());
		return "redirect:index.jeju";
	}
	
}
