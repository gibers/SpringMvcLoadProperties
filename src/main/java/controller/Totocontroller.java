package controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping({"/", "/centrale"})
public class Totocontroller {
	
	@Autowired
	MessageSource resources;
	
	@Autowired
	Environment env;
	
	@RequestMapping(method = RequestMethod.GET)
	public String test(Model model) {

	    System.out.println(env.getProperty("propriete1"));
	    System.out.println(env.getProperty("proprieteDuFichier2"));

	    String message = resources.getMessage("valeur1", null, "Default", null);
	    System.out.println(message);
		
		String chaine = "machaine";
		Map<String, String> mm = new HashMap<String, String>();
		mm.put("clefs1", message);
		
		model.addAttribute(mm);
		return "centrale";
		
	}
	
}

