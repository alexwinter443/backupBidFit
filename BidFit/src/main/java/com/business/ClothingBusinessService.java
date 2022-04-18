package com.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.data.ClothingDataService;
import com.models.ClothingModel;

import data.entity.ClothingEntity;

// ALEX was HERE
@Service
public class ClothingBusinessService implements BusinessInterface<ClothingEntity>{

	@Autowired
	private ClothingDataService serviceClothing;
	
	public ClothingBusinessService(ClothingDataService service) {
		this.serviceClothing = service;
	}

	@Override
	public int create(ClothingEntity clothing) {
		ClothingEntity clothingEntity = new ClothingEntity(clothing.getId(), clothing.getName(), clothing.getSize(), clothing.getMaterial(), clothing.getCondition(), clothing.getQuantity(), clothing.getSex(), clothing.getImage(), clothing.getDate(), clothing.getUsers_id());
		
		serviceClothing.create(clothingEntity);
		return 0;
	}

	@Override
	public int removeById(int t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ClothingEntity> findAll() {
		
		return serviceClothing.findAll();
	}

	@Override
	public ClothingEntity findById() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update() {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
