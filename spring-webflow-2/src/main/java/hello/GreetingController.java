package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//   import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
	/**
	 * https://spring.io/guides/gs/serving-web-content/
	 * 
	 * @param name
	 * @param model
	 * @return
	 */
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		Logger logger = LogManager.getLogger(GreetingController.class);
		logger.error("in greeting");

		//return "greeting";
		return "greeting.html";
	}

}