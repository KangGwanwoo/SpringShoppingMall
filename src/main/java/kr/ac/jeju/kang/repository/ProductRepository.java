package kr.ac.jeju.kang.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import kr.ac.jeju.kang.model.Product;

@Repository
public interface ProductRepository {

	List<Product> findAll();

	void insert(Product product);

	void update(Product product);

	Product findById(int id);

}
