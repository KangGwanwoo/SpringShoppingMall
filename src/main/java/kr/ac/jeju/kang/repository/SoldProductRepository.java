package kr.ac.jeju.kang.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jeju.kang.model.Product;
import kr.ac.jeju.kang.model.SoldProduct;
@Repository
public interface SoldProductRepository {

	public void insert(SoldProduct soldProduct);

	public List<SoldProduct> findById(String userId);

}
