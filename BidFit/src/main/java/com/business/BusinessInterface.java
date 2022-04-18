package com.business;

import java.util.List;

public interface BusinessInterface<T> {
	public int create(T t);
	
	public int removeById(int t);
	
	public List<T> findAll();
	public T findById();
	
	public int update();
}
