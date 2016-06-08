package com.algaworks.cobranca.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.algaworks.cobranca.enums.StatusTituloEnum;
import com.algaworks.cobranca.model.Titulo;
import com.algaworks.cobranca.repository.TituloRepository;

@Controller
@RequestMapping("/titulos")
public class TituloController {
	
	private static final String PAGINA = "CadastroTitulo";
	
	@Autowired
	private TituloRepository tituloRepository;

	@RequestMapping(value="/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView(PAGINA);
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(Titulo titulo) {
		ModelAndView mv = new ModelAndView(PAGINA);
		try {
			tituloRepository.save(titulo);			
			mv.addObject("mensagem", "Título cadastrado com sucesso.");
		} catch (Exception e) {
			mv.addObject("mensagem", "Não foi possível cadastrar o título informado.");
			e.printStackTrace();
		}
		return mv;
	}
	
	@ModelAttribute(value="statusTituloList")
	public List<StatusTituloEnum> statusTituloList() {
		return Arrays.asList(StatusTituloEnum.values());
	}
}
