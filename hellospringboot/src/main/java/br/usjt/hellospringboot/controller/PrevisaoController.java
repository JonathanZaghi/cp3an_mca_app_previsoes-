package br.usjt.hellospringboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.hellospringboot.model.Previsao;
import br.usjt.hellospringboot.repository.PrevisaoRepository;

@Controller
public class PrevisaoController {
	@Autowired
	private PrevisaoRepository alunoRepo;
	
	@GetMapping("/Previsao")
	public ModelAndView listarAlunos() {
		ModelAndView mv = new ModelAndView ("lista_previsao");
		
		List <Previsao> previsoes = alunoRepo.findAll();
		
		mv.addObject("previsoes", previsoes);
		
		return mv;
				
	}

}
