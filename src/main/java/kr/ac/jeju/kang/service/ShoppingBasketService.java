package kr.ac.jeju.kang.service;

import java.util.List;

import kr.ac.jeju.kang.model.ShoppingBasket;

public interface ShoppingBasketService {

	void addList(ShoppingBasket shoppingBasket);

	List<ShoppingBasket> list(String userId);


	void productDelete(String userId, int productId);

}
