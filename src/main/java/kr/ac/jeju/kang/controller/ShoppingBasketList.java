package kr.ac.jeju.kang.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import kr.ac.jeju.kang.model.ShoppingBasket;
import kr.ac.jeju.kang.model.SoldProduct;
import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.service.BuyService;
import kr.ac.jeju.kang.service.ShoppingBasketService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/shoppingBasketList")
public class ShoppingBasketList {
	@Autowired
	private ShoppingBasketService shoppingBasketService;
	
	
	@RequestMapping
	public List<ShoppingBasket> list(HttpSession session){
		User loginUser=(User) session.getAttribute("userLoginInfo");
		String userId = loginUser.getUserId();
		
		return shoppingBasketService.list(userId);
	}

}