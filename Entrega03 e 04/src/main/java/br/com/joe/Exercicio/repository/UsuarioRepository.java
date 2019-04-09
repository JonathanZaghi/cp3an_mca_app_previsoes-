package br.com.joe.Exercicio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joe.Exercicio.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
	public Usuario findOneByLoginAndSenha (String login, String senha);
	

}
