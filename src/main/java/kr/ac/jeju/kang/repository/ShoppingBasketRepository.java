package kr.ac.jeju.kang.repository;

import org.springframework.stereotype.Repository;

import kr.ac.jeju.kang.model.ShoppingBasket;
@Repository
public interface ShoppingBasketRepository {

	public void insert(ShoppingBasket shoppingBasket);

}
