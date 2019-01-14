package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProdutosController {
	
	@RequestMapping("/produtos/form")
	private String form() {
		System.out.println("Into produtos");
		return "produtos/form";
	}
	
	@RequestMapping("/produtos")
	public String gravar(String titulo, String descricao, int paginas) {
		System.out.println(titulo);
		System.out.println(descricao);
		System.out.println(paginas);

		return "ok";
	}
}
