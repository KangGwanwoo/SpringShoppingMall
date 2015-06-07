package kr.ac.jeju.kang.service;

import java.util.List;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.model.SoldProduct;

public interface BuyService {

	void addList(SoldProduct soldProduct);


	List<SoldProduct> list(String userId);

}
