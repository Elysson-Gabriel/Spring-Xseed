package br.com.xseed.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.xseed.model.Textbox;;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({ "/textbox" })
public class Teste {
	
	private Textbox texto = new Textbox();
	
	@GetMapping(produces = "application/json")
	public Textbox gerar() {
		return texto;
	}
	
	@PostMapping
	public void copiar(@RequestBody Textbox mensagem) {
		texto.setCampo(mensagem.getCampo());
		System.out.println(mensagem.getCampo());
	}
	
}
