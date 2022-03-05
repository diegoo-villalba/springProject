package spring.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ShowNameController {
	
	//2 Methods: 
	//1st method: request/provides a form.
	//2nd method: processes the information that the user filled in the form
	
	//1st Method
	@RequestMapping("/showForm") //Le indicamos a Spring que estamos peticionado una URL
	public String showForm() {
		return "form"; 
	}
	
	//2nd Method
	@RequestMapping("/formProcessor") //Especificamos la URL donde se muestre el formulario procesado (URL de la respuesta)
	public String formProcessor() {
		return "processedForm"; //Esta es la respuesta que nos da el servidor a la petición con el form
	}
	
	//3rd Method
	@RequestMapping("/formProcessor2")
	public String proFormProcessor(HttpServletRequest request, Model model) {
		
		String name = request.getParameter("visitorsName");
		
		name+=". I'm very grateful";
		
		String finalMessage = "Thank you for visiting my project " + name;
		
		model.addAttribute("message", finalMessage);
				
				
				
		return "processedForm";
		
		
	}
}
