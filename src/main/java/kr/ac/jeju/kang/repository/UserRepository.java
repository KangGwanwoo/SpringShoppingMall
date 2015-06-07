package kr.ac.jeju.kang.repository;

import kr.ac.jeju.kang.model.User;

import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {


	public User findById(User user);


	public void registUser(User user);


	public User findId(User user);

}
