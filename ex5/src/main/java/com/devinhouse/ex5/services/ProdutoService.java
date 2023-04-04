package com.devinhouse.ex5.services;

import com.devinhouse.ex5.models.Produto;
import com.devinhouse.ex5.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired private ProdutoRepository repository;

    public void salvar(Produto produto) {
        repository.save(produto);
    }

    public List<Produto> buscarTodos() {
        return (List<Produto>) repository.findAll();
    }

    public void excluir(Produto produto) {
        repository.delete(produto);
    }

    public void excluirPeloId(int id) {
        repository.deleteById(id);
    }
}
