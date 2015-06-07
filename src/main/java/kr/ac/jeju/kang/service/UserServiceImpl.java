package kr.ac.jeju.kang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.jeju.kang.model.User;
import kr.ac.jeju.kang.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository userRepository;

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return userRepository.findById(user);
	}

	@Override
	public void singIn(User user) {
		// TODO Auto-generated method stub
		userRepository.registUser(user);
	}

}
