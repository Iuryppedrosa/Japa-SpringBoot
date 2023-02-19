package com.meusiteaqui1.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.meusiteaqui1.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping(path = "/dados")
public class ClienteControllers 
{
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente()
	{
		return new Cliente(1, "Iury Pedrosa", "01248254600");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId(@PathVariable int id)
	{
		return new Cliente(id,"Maria", "123-345-656-8");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id") int id)
	{
		return new Cliente(id, "Jose", "123-456-999-89");
	}
}
  