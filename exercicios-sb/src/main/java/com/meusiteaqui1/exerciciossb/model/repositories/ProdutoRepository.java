package com.meusiteaqui1.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import com.meusiteaqui1.exerciciossb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>
{
	

}
