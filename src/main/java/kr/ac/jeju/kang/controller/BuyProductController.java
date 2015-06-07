package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.SoldProduct;
import kr.ac.jeju.kang.service.BuyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/buyProduct")
public class BuyProductController {
	@Autowired
	private BuyService buyService;
	
	
	@RequestMapping
	public String buyProdcut(SoldProduct soldProduct){
		buyService.addList(soldProduct);
		return "redirect:index";
	}
	
}
