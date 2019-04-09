package br.com.joe.Exercicio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joe.Exercicio.model.Previsao;
import br.com.joe.Exercicio.repository.PrevisaoRepository;

@Service
public class PrevisaoService {

	@Autowired
	private PrevisaoRepository previsaoRepo;
	
	public void salvar(Previsao previsao) {
		previsaoRepo.save(previsao);
	}
	
	public List<Previsao> listarTodos(){
		return previsaoRepo.findAll();
	}
}
