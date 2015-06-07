package kr.ac.jeju.kang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jeju.kang.model.SoldProduct;
import kr.ac.jeju.kang.repository.ProductRepository;
import kr.ac.jeju.kang.repository.SoldProductRepository;
import kr.ac.jeju.kang.repository.UserRepository;

@Service
public class BuyServiceImple implements BuyService{
	@Autowired
	private SoldProductRepository soldProductRepository;
	
	
	@Override
	public void addList(SoldProduct soldProduct) {
		// TODO Auto-generated method stub
		soldProductRepository.insert(soldProduct);
		
	}
	
}
