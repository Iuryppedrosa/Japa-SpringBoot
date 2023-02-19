package com.meusiteaqui1.exerciciossb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.meusiteaqui1.exerciciossb.model.entities.Produto;
import com.meusiteaqui1.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController 
{
	@Autowired
	private ProdutoRepository produtoRepository;
	@PostMapping
	public @ResponseBody Produto novoProduto(Produto produto)
			//@RequestParam String nome,
			//@RequestParam double preco,
			//@RequestParam double desconto)
	{
		//Produto produto = new Produto(nome, preco, desconto);
		produtoRepository.save(produto);
		
		return produto; 
	}
	
	@GetMapping
	public Iterable<Produto> obterProdutos()
	{
		return produtoRepository.findAll();
	}
}
