package com.algaworks.cobranca.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.algaworks.cobranca.model.Titulo;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	private static final String CADASTRO_TITULO = "CadastroTitulo";

	@RequestMapping(value="/novo")
	public String novo() {
		return CADASTRO_TITULO;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String salvar(Titulo titulo) {
		System.out.println(titulo.getDescricao());
		return CADASTRO_TITULO;
	}
}
