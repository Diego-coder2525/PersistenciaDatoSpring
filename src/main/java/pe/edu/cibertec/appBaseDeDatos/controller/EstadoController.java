package pe.edu.cibertec.appBaseDeDatos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.cibertec.appBaseDeDatos.service.EstadoService;

@Controller
@RequestMapping("/Estado")
public class EstadoController {
	
	private EstadoService EstadoService;
	
	@GetMapping("/frmMantEstado")
	public String frmMantEstado(Model model) {
		model.addAttribute("listaEstado", EstadoService.listarEstado());
		return "Estado/frmMantEstado";
	}
	
	

}
