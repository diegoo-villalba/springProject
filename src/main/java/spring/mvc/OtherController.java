package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/secondary")
public class OtherController {
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "form"; 
	}

	@RequestMapping("/formProcessor2")
	public String proFormProcessor(@RequestParam("visitorsName") String name, Model model) {

		name += ". You're not welcome";

		String finalMessage = "¿What are you doing here? " + name;

		model.addAttribute("message", finalMessage);

		return "processedForm";

	}

}
