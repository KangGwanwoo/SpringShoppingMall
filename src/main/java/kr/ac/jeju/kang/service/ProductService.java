package kr.ac.jeju.kang.service;

import java.util.List;

import kr.ac.jeju.kang.model.Product;

public interface ProductService {

	List<Product> list();

	void save(Product product);

	List<Product> productModify(Product product);

	Product get(int id);

	void productDelete(int id);

	int getRow();

	List<Product> listByPage(int page);

}
