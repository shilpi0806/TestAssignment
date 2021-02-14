/**
 * 
 */
package com.example.springmvc.springmvcDemo.Repository;

import java.util.List;

import com.example.springmvc.springmvcDemo.Model.Ingredients;

/**
 * @author hp
 *
 */
public interface IngridientsRepo  {

	Iterable<Ingredients> findAll();
	List<Ingredients> findByType(String type);
	Ingredients findOne(String id);
	
	
}



