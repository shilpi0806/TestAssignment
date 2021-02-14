/**
 * 
 */
package com.example.springmvc.springmvcDemo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author hp
 *
 */
@Data
@AllArgsConstructor
public class Ingredients {

private int ingredient_id;
private String ingredient_name;
private String ingredient_type;
}
