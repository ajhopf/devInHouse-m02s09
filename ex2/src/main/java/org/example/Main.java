package org.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) {
        //try with resources -> irá fechar a conexão após sair do try/catch
        try (Connection connection = CriaConexao.getConexao()) {
            System.out.println(connection.getSchema());
            Statement stm = connection.createStatement();

            //stm execute -> retorna true se for select/false se nao for
            //se for true guardará o resultado na variável stmn
            boolean isSelect = stm.execute("SELECT ID, NOME, DESCRICAO, PRECO FROM PRODUTOS");

            if (isSelect) {
                ResultSet result = stm.getResultSet();

                while(result.next()) {
                    int id = result.getInt("ID");
                    int preco = result.getInt("PRECO");
                    String nome = result.getString("NOME");
                    String descricao = result.getString("DESCRICAO");
                    System.out.printf("ID: %d, Nome: %s, Descrição: %s, Preco: %d.%n", id, nome, descricao, preco);
                }

            }

        } catch (SQLException e) {
            System.out.println("Problema ao conectar com o banco de dados" + e.getMessage());
            throw new RuntimeException(e);
        }
    }
}