package kr.ac.jeju.kang.service;

import java.util.List;

import kr.ac.jeju.kang.model.Product;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductServiceTest {
	@Autowired
	private ProductService productService;
	@Test
	public void list() {
		Product product = new Product();
		product.setId(1);
		product.setTitle("hello");
		product.setProvider("jeju");
		product.setDescription("new description");
		
		List<Product> goodsList = productService.productModify(product);
		Assert.assertTrue(goodsList.size() > 0);
		for(Product goods : goodsList) {
			if(goods.getId() == 1) {
				Assert.assertEquals("description", goods.getDescription());
				
			}
		}
	}
}
