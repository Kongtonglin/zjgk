/*

 *
 *
 */
package com.zjgk.service;

import java.io.Serializable;
import java.util.List;

import com.zjgk.entity.BaseEntity;

public interface BaseService<T extends BaseEntity, ID extends Serializable> {

	T find(Long id);

	List<T> findAll();

	List<T> findList(Long... ids);

	long count();
 
	boolean exists(Long id); 

	T save(T entity);

	T update(T entity);

	T update(T entity, String... ignoreProperties);

	void delete(ID id);

	void delete(Long... ids);

	void delete(T entity);

}