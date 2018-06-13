package hello;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//   import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AnnotGreeting4Controller {
	/** case 1 case 3
	 * https://spring.io/guides/gs/serving-web-content/
	 https://stackoverflow.com/questions/18683847/no-mapping-found-for-http-request-with-uri-in-dispatcherservlet-with-name*/
	  @RequestMapping("/hello")
    public ModelAndView helloWorld() {

        String modelobjectMessage = "Hello World, Spring 3.0!";
        return new ModelAndView("viewname", "modelobjectMessage", modelobjectMessage); 
    }
}