package com.qbo.service;


import java.util.List;


public interface BaseService<E> {
	
    public List<E> findAll();
    public E save(E entity);
    
}
