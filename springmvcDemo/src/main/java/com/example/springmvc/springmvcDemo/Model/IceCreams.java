/**
 * 
 */
package com.example.springmvc.springmvcDemo.Model;

import java.util.List;

import lombok.Data;

/**
 * @author hp
 *
 */
@Data
public class IceCreams {
	
private int id;
private String cust_name;
private List<String> ingredients;

	
}
