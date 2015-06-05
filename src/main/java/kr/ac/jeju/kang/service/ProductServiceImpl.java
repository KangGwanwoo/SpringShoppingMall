package kr.ac.jeju.kang.service;

import java.util.List;


import kr.ac.jeju.kang.model.Product;



import kr.ac.jeju.kang.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;

	@Override
	public List<Product> list() {
		return productRepository.findAll();
	}

	@Override
	public void save(Product product) {
		// TODO Auto-generated method stub
		productRepository.insert(product);
	}

	
	
	
		
}
