package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoJDBC;
import model.Endereco;

public class EnderecoController {
    public void inserirEndereco(Endereco endereco) {
        String sql = "INSERT INTO TBENDERECO (IDENDERECO, LOGRADOURO, NUMERO, COMPLEMENTO, BAIRRO, CEP, IDENDECIDADE) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConexaoJDBC.getConnection();
             PreparedStatement end = connection.prepareStatement(sql)) {

        	end.setInt(1, endereco.getId());
        	end.setString(2, endereco.getLogradouro());
        	end.setInt(3, endereco.getNumero());
        	end.setString(4, endereco.getComplemento());
        	end.setString(5, endereco.getBairro());
        	end.setInt(6, endereco.getCep());
        	end.setInt(7, endereco.getCidade().getId());

            int affectedRows = end.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Endereco inserida com sucesso!");
            } else {
                System.out.println("Falha ao inserir o Endereco.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}