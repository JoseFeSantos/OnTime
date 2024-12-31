package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoJDBC;
import model.Cliente;

public class ClienteController {
    public void inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO TBCLIENTE (IDCLIENTE, NOMECLIENTE, CPF, SEXO, CLIDESCSTATUS) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = ConexaoJDBC.getConnection();
             PreparedStatement cli = connection.prepareStatement(sql)) {

        	cli.setInt(1, cliente.getId());
            cli.setString(2, cliente.getNomeCompleto());
            cli.setString(3, cliente.getCpf());
//            cli.setString(, fotoPerfil());
            cli.setString(4, cliente.getSexo());
//            cli.setString(5, cliente.Endereco());
//            cli.setString(5, cliente.getEndereco().getEnderecoCompleto());
            cli.setString(5, cliente.getStatus());

            int affectedRows = cli.executeUpdate();
            if (affectedRows > 0) {
                System.out.println("Cliente inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir o Cliente.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }
}
