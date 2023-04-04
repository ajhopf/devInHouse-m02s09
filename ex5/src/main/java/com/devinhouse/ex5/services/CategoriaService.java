package com.devinhouse.ex5.services;

import com.devinhouse.ex5.models.Categoria;
import com.devinhouse.ex5.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaService {
    @Autowired private CategoriaRepository repository;

    public void criarCategoria(Categoria categoria) {
        repository.save(categoria);
    }

    public List<Categoria> buscarTodas() {
        return (List<Categoria>) repository.findAll();
    }

    public void excluir(Categoria categoria) {
        repository.delete(categoria);
    }

    public void excluirPeloId(int id) {
        repository.deleteById(id);
    }
}
