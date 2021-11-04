/**
 * @author Delanie Johnson - dmjohnson33
 * CIS175 - Fall 2021
 * Nov 1, 2021
 */
package contoller;
import org.springframework.stereotype.Controller; 
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import beans.favoriteThings;

import org.springframework.context.annotation.Bean; 
import org.springframework.context.annotation.Configuration;

/**
 * @author delan
 *
 */
@Controller
public class controller {
	
	@GetMapping("/makealist")
	
	public String makeList(@RequestParam(name="choices",required=false) String foodChoice, String musicChoice, String colorChoice, Model model) {
		if(colorChoice.equals(null) || foodChoice.equals(null) || musicChoice.equals(null)){
			return "index";
		}
		
		favoriteThings theList = new favoriteThings(colorChoice, foodChoice, musicChoice);
		
		model.addAttribute("favorite things", theList);
		
		return "results";
	}
	
	@Bean
	public favoriteThings favoriteThings() {
		favoriteThings bean = new favoriteThings(null, null, null);
		bean.setColor("yellow");
		bean.setFood("pizza");
		bean.setMusic("rock n roll");
		return bean;
	}

	

}

