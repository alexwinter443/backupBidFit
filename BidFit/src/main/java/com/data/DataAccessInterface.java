package com.data;

import java.util.List;

public interface DataAccessInterface<T> {
	public int create(T t);
	
	public int removeById(int t);
	
	public List<T> findAll();
	public T findById();
	
	public int update();
	
}
