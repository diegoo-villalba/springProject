package spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlador {
	
	//Metodo encargado de especificar que vista queremos nos proporcione el proyecto
	@RequestMapping
	public String showView() {
		return "homePage";
	}

}
