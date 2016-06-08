package com.algaworks.cobranca.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	private static final String PAGINA = "CadastroTitulo";
	
	@Autowired
	private TituloRepository tituloRepository;

	@RequestMapping(value="/novo")
	public String novo() {
		return PAGINA;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		tituloRepository.save(titulo);
		System.out.println(titulo.getDescricao());
		return PAGINA;
	}
}
