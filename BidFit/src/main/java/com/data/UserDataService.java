package com.data;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.models.UserModel;

import data.entity.UserEntity;

@Service
public class UserDataService implements DataAccessInterface<UserEntity> {
	
	@SuppressWarnings("unused")
	@Autowired
	private DataSource dataSource;
	@Autowired
	private JdbcTemplate jdbcTemplateObject;


	@Override
	public int create(UserEntity user) {
		String sql = "INSERT INTO users(FIRSTNAME,LASTNAME, EMAIL, PHONENUMBER, USERNAME, PASSWORD) VALUES(?,?,?,?,?,?)";
		
		try {
			int rows = jdbcTemplateObject.update(sql,user.getFirstName(),user.getLastName(),user.getEmail(),user.getPhoneNumber(), user.getUsername(), user.getPassword());
			return rows == 1 ? 1 : 0;
		
		}
		catch (Exception e) {
			e.printStackTrace();
			return -1;
		}	
	}
	

	public boolean login(UserEntity user) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public int removeById(int t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public List<UserEntity> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public UserEntity findById() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

}
