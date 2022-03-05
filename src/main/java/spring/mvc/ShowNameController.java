package spring.mvc;

import org.springframework.stereotype.Controller;
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
}
