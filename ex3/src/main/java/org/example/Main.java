package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.example.models.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Use a cabeça - JAVA");
        produto.setDescricao("Entenda Java!");
        produto.setPreco(49.99);
        produto.setQtdEstoque(234);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("banco_dados");
        EntityManager em = factory.createEntityManager();

        em.getTransaction().begin();//cria conexão com o banco
        em.persist(produto);
        em.getTransaction().commit();//commit
        em.close();
    }
}