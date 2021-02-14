/**
 * 
 */
package com.example.springmvc.springmvcDemo.Repository;

import java.sql.Types;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreatorFactory;

import com.example.springmvc.springmvcDemo.Model.IceCreams;

/**
 * @author hp
 *
 */
public class IceCreamRepoImplJDBC implements IceCreamRepo{

	
	private JdbcTemplate jdbcTemplate;
	
	//constructor dependency injection to create object of JdbcTemplate class
	public IceCreamRepoImplJDBC(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public IceCreams save(IceCreams iceCream) {

		PreparedStatementCreatorFactory factory=new PreparedStatementCreatorFactory("insert into IceCreams(name) values(?)", Types.VARCHAR);
		factory.setReturnGeneratedKeys(true);
		return null;
	}

}
