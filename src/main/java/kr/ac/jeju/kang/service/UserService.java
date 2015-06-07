package kr.ac.jeju.kang.service;

import kr.ac.jeju.kang.model.User;

public interface UserService {

	User login(User user);

	void singIn(User user);

	User findId(User user);

}
