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
		
		favoriteThings theList = new favoriteThings();
		
		model.addAttribute("favorite things", theList);
		
		return "results";
	}

}

