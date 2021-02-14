/**
 * 
 */
package com.example.springmvc.springmvcDemo.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Repository;

import com.example.springmvc.springmvcDemo.Model.Ingredients;

/**
 * @author hp
 *
 */
@Repository
public class IngridientRepoImplJDBC implements IngridientsRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	/*
	 * public IngridientRepoImplJDBC(JdbcTemplate jdbcTemplate) { this.jdbcTemplate
	 * = jdbcTemplate; }
	 */

	@Override
	public Iterable<Ingredients> findAll() {
		List<Ingredients> ingredients = null;
		try {
			ingredients = jdbcTemplate.query("SELECT ID,NAME,TYPE FROM INGREDIENTS", this::mapRowToIngredient);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ingredients;
	}

	@Override
	@Nullable
	public List<Ingredients> findByType(String type) {
		List<Ingredients> ingredients = null;
		try {
			ingredients = jdbcTemplate.query("SELECT ID,NAME,TYPE FROM INGREDIENTS WHERE TYPE = ?",  this::mapRowToIngredient,type);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ingredients;
		
	}

	@Override
	public Ingredients findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	private Ingredients mapRowToIngredient(ResultSet rs, int rowNum) throws SQLException {
		return new Ingredients(rs.getInt("id"), rs.getString("name"), rs.getString("type"));
	}
}
