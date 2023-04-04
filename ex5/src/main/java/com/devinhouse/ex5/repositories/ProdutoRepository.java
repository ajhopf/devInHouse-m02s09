package com.devinhouse.ex5.repositories;

import com.devinhouse.ex5.models.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
}
