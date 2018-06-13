package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//   import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AnnotGreeting2Controller {
	/**
	 * https://spring.io/guides/gs/serving-web-content/
	 * 
	 * @param name
	 * @param model
	 * @return
	 READONLY for issue #4 example*/
	@GetMapping("/greeting22")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name,
			Model model) {
		model.addAttribute("name", name);
		Logger logger = LogManager.getLogger(AnnotGreeting2Controller.class);
		logger.error("in greeting22 2");

		//return "greeting";
		return "greeting22";
	}

}