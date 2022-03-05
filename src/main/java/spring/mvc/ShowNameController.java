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
	
	//3rd Method: processes the information and also he call the view
	@RequestMapping("/formProcessor2")
	public String proFormProcessor(HttpServletRequest request, Model model) {
	
		/*
		 * Lee la informacion que viene del cuadro de texto, por eso pedimos el
		 * .getParameter("") que captura la información del cuadro de texto
		 * visitorsName == Nombre del cuadro de texto que queremos capturar
		 * */
		String name = request.getParameter("visitorsName");
		
		/*INFORMACION que INYECTAMOS AL MODELO*/
		name+=". I'm very grateful";
		
		/*Esto es para adornar y concatenarlo con la variable name, para que el metodo "haga algo mas"*/
		String finalMessage = "Thank you for visiting my project " + name;
		
		/*METODO PARA AGREGAR INFORMACION AL MODELO:
		 * Metodo addAttribute(): el string identificatorio y el objeto en cuestion.
		 * */
		model.addAttribute("message", finalMessage);
		/*message: Lo que haya almacenado en finalMessage SPRING lo va a identificar como message*/
				
				
		//Devuelve la vista		
		return "processedForm";
		
		
	}
}
