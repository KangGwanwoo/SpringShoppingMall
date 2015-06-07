package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.model.ShoppingBasket;
import kr.ac.jeju.kang.service.ShoppingBasketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/addShoppingBasket")
public class AddShoppingBasketController {
	@Autowired
	private ShoppingBasketService shoppingBasketService;
	
	
	@RequestMapping
	public String addShoppingBasket(ShoppingBasket shoppingBasket){
		shoppingBasketService.addList(shoppingBasket);
		return "redirect:index";
	}
}
