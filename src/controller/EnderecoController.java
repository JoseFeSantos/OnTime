package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.ConexaoJDBC;
import model.Endereco;

public class EnderecoController extends Base {
    public void inserirEndereco(Endereco endereco) {
        if (!enderecoExiste(endereco.getId())) {
            String[] columns = {"IDENDERECO", "LOGRADOURO", "NUMERO", "COMPLEMENTO", "BAIRRO", "CEP", "IDENDECIDADE"};
            Object[] values = {endereco.getId(), endereco.getLogradouro(), endereco.getNumero(), endereco.getComplemento(), endereco.getBairro(), endereco.getCep(), endereco.getCidade().getId()};

            insert("TBENDERECO", columns, values);
        }
    }

    public void inserirTodosEnderecos(Endereco[] enderecos) {
        for (Endereco endereco : enderecos) {
            inserirEndereco(endereco);
        }
    }

    private boolean enderecoExiste(int idEndereco) {
        String sql = "SELECT COUNT(*) FROM TBENDERECO WHERE IDENDERECO = ?";
        try (Connection connection = ConexaoJDBC.getConnection();
             PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idEndereco);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar endereço: " + e.getMessage());
        }
        return false;
    }
}
