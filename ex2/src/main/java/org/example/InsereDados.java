package org.example;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsereDados {
    public static void main(String[] args) {
        try (Connection connection = CriaConexao.getConexao()) {
            Statement stm = connection.createStatement();
            stm.execute("INSERT INTO PRODUTOS(nome, descricao, preco)" +
                            "VALUES('desodorante','desodorante excelente', 300)");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
