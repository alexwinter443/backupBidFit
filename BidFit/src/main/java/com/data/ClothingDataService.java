package com.data;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.models.ClothingMapper;
import com.models.ClothingModel;

import data.entity.ClothingEntity;

//DIRTY DAN WAS HERE
@Service
public class ClothingDataService implements DataAccessInterface<ClothingEntity> {

	@Autowired
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public int create(ClothingEntity clothing) {
		String sql = "INSERT INTO clothing_item(ID, NAME, SIZE, MATERIAL, CONDITION, QUANTITY, SEX, IMAGE, DATE, users_ID) VALUES(?,?,?,?,?,?,?,?,?,?)";

		try {
			int rows = jdbcTemplateObject.update(sql, clothing.getName(), clothing.getSize(), clothing.getMaterial(),
					clothing.getCondition(), clothing.getQuantity(), clothing.getSex(), clothing.getImage(),
					clothing.getDate(), clothing.getUsers_id());

			System.out.println(rows);

			return rows > 0 ? rows : 0;
		} catch (Exception e) {
//			System.out.println("Error:" + e);
			e.printStackTrace();
			return -1;
		}
	}

	// get all products
	@Override
	public List<ClothingEntity> findAll() {
		// query for all properties of all products
		List<ClothingEntity> products = jdbcTemplateObject.query("SELECT * FROM clothing_item", new ClothingMapper());
		System.out.println(products + "list of all products");
		return products;
	}

	@Override
	public int removeById(int t) {
		// TODO Auto-generated method stub
		return 0;
	}


	@Override
	public ClothingEntity findById() {

		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}

}
