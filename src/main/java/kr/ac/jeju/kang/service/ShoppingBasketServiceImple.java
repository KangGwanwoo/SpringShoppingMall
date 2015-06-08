package kr.ac.jeju.kang.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jeju.kang.model.ShoppingBasket;
import kr.ac.jeju.kang.model.SoldProduct;
import kr.ac.jeju.kang.repository.ShoppingBasketRepository;


@Service
public class ShoppingBasketServiceImple implements ShoppingBasketService{

	
	@Autowired
	private ShoppingBasketRepository shoppingBasketRepository;
	
	@Override
	public void addList(ShoppingBasket shoppingBasket) {
		// TODO Auto-generated method stub
		shoppingBasketRepository.insert(shoppingBasket);
	}

	@Override
	public List<ShoppingBasket> list(String userId) {
		// TODO Auto-generated method stub
		return shoppingBasketRepository.findById(userId);
	}

	@Override
	public void productDelete(String userId,int productId) {
		// TODO Auto-generated method stub
		shoppingBasketRepository.delete(userId,productId);
	}

}
