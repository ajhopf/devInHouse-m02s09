package com.devinhouse.ex5.services;

import com.devinhouse.ex5.models.Cliente;
import com.devinhouse.ex5.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository repository;

    public void salvar(Cliente cliente) {
        repository.save(cliente);
    }

    public List<Cliente> buscarTodos() {
        return (List<Cliente>) repository.findAll();
    }

    public void excluir(Cliente cliente) {
        repository.delete(cliente);
    }

    public void excluirPeloId(int id) {
        repository.deleteById(id);
    }
}
