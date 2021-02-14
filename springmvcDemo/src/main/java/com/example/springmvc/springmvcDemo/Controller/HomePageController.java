/**
 * 
 */
package com.example.springmvc.springmvcDemo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hp
 *
 */
@RequestMapping("/")
public class HomePageController {

	@GetMapping("home")
	public String getHomePage() {
		return "Home.html";
	}
}
