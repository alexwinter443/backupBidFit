package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.DataAccessInterface;
import com.data.UserDataService;
import com.models.UserModel;

import data.entity.UserEntity;

@Service
public class UserBusinessService implements BusinessInterface<UserModel>{
	
	@Autowired
	private UserDataService serviceUser;
	
	public void Login() {
		//login code here
	}

	@Override
	public int create(UserModel t) {
		UserEntity userEntity = new UserEntity(t.getFirstName(), t.getLastName(), t.getEmail(), t.getPhoneNumber(), t.getUsername(), t.getPassword());
		
		serviceUser.create(userEntity);
		return 0;
	}

	@Override
	public int removeById(int t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<UserModel> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserModel findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

}
