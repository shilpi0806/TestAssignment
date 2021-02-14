/**
 * 
 */
package com.example.springmvc.springmvcDemo.Controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.springmvc.springmvcDemo.Model.IceCreams;
import com.example.springmvc.springmvcDemo.Model.Ingredients;
import com.example.springmvc.springmvcDemo.Repository.IngridientsRepo;


/**
 * @author hp
 *
 */

@RequestMapping("/design")
@Controller
public class DesignIceCreamController {

	
	private IngridientsRepo ingredientRepo;
	
	public DesignIceCreamController(IngridientsRepo ingredientRepo) {
		this.ingredientRepo = ingredientRepo;
	}

	@GetMapping
	public String getDesignPage(Model model) {
		
		List<Ingredients> ingredients = (List<Ingredients>) ingredientRepo.findAll();
		model.addAttribute("flavours", ingredients.stream().filter(p -> p.getIngredient_type().equals("Flavour")).collect(Collectors.toList()));
		model.addAttribute("syrup", ingredientRepo.findByType("Syrup"));
		model.addAttribute("cone", ingredientRepo.findByType("Cone"));
		model.addAttribute("iceCreams",new IceCreams());
		return "DesignIceCream";

	}

	@PostMapping
	public String getOrderDetails(IceCreams iceCreams) {
		System.out.println(" shilpi " +iceCreams.getIngredients().size());
		return "redirect:/homeconfig";
		//return "Home";
		
	
	}
}
