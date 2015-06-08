package kr.ac.jeju.kang.repository;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import kr.ac.jeju.kang.model.ShoppingBasket;
@Repository
public interface ShoppingBasketRepository {

	public void insert(ShoppingBasket shoppingBasket);

	public List<ShoppingBasket> findById(String userId);

	public void delete(@Param("userId") String userId, @Param("productId") int productId);

}
