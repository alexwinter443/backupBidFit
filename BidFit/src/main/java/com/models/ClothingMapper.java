package com.models;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import data.entity.ClothingEntity;

public class ClothingMapper implements RowMapper<ClothingEntity>{

	// match product mapping with product model for easier database manipulation
		@Override
		public ClothingEntity mapRow(ResultSet resultSet, int i) throws SQLException {
			ClothingEntity product = new ClothingEntity(
					resultSet.getInt("ID"),
					resultSet.getString("NAME"),
					resultSet.getInt("SIZE"),
					resultSet.getString("MATERIAL"),
					resultSet.getString("CONDITION"),
					resultSet.getInt("QUANTITY"),
					resultSet.getString("SEX"),
					resultSet.getString("IMAGE"),
					resultSet.getDate("DATE"),
					resultSet.getInt("USERS_ID")
					);
			// System.out.println("in product mapper id = " + product.getId() + " image = " + product.getImage());
			
			return product;
		}
}
