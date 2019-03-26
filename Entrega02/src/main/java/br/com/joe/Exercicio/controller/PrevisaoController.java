package br.com.joe.Exercicio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.joe.Exercicio.model.Previsao;
import br.com.joe.Exercicio.service.PrevisaoService;

@Controller
public class PrevisaoController {

	@Autowired
	private PrevisaoService prevService;
	
	@GetMapping("/Previsoes")
	public ModelAndView ListarPrevisoes() {
		ModelAndView mv = new ModelAndView("listar_previsoes");
		mv.addObject(new Previsao());
		
		List<Previsao> loucura = prevService.listarTodos();
		mv.addObject("previsao", loucura);
		
		return mv;
	}
	
	@PostMapping
	public String Salvar(Previsao previsao) {
		prevService.salvar(previsao);
		return "redirect:/Previsoes";
	}
	
}
