package kr.ac.jeju.kang.controller;

import kr.ac.jeju.kang.service.ShoppingBasketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/deleteShoppinglist")
public class DeleteShoppingList {
	@Autowired
	private ShoppingBasketService shoppingBasketService;

	@RequestMapping
	public String productModify(@RequestParam("userId") String userId,@RequestParam("productId") int productId) {
		shoppingBasketService.productDelete(userId,productId);
		return "redirect:index.jeju";
	}
}
