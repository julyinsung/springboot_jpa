package mysample.boot.war.deploy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

	@RequestMapping("/")
	public String hello(@RequestParam(value="name", required=false, defaultValue="Worlds") String name
			,Model model){

		model.addAttribute("name", name); 
		return "hello/hello";
		
	}
}
