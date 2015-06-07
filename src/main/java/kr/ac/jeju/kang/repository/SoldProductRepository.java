package kr.ac.jeju.kang.repository;

import org.springframework.stereotype.Repository;

import kr.ac.jeju.kang.model.SoldProduct;
@Repository
public interface SoldProductRepository {

	public void insert(SoldProduct soldProduct);

}
