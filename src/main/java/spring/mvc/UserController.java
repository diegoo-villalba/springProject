package spring.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	/*
	 * This method trims the strings entered in the validated "Strinzxsa" fields prior to being sent to the controller.
	 */
	@InitBinder
	public void myBinder(WebDataBinder binder) {
		
		//Property editor
		StringTrimmerEditor trimmer = new StringTrimmerEditor(true);
		//True: para que si tenemos un String vacío (espacio en blanco) se transforme en null
		
		
		binder.registerCustomEditor(String.class, trimmer);
	}

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
	public String processedForm(@Valid @ModelAttribute("newUser") User user, BindingResult validationResult) {
		
		if (validationResult.hasErrors()) {
			return "registerForm";
		} else {
		
		//Nombre del formulario de confirmación
		return "successfulRegistration";
		}
	}

}
