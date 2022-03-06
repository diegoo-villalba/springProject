package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

	/*
	 * This method shows a register form that includes: name, lastname, send button
	 */
	@RequestMapping("/showUserForm")
	public String showForm(Model model) {

		User user = new User();

		model.addAttribute("newUser", user);

		return "registerForm";

	}
	
	/*
	 * This method shows a view with the information provided by the model "newUser"
	 */
	@RequestMapping("/processedForm")
	public String processedForm(@ModelAttribute("newUser") User user) {
		
		//Nombre del formulario de confirmaci�n
		return "successfulRegistration";
		
	}

}