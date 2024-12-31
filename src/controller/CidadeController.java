package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Cidade;

public class CidadeController extends Base {
    public void inserirCidade(Cidade cidade) {
        if (!cidadeExiste(cidade.getId())) {
            String[] columns = {"IDCIDADE", "NOMECIDADE", "IDESTADO"};
            Object[] values = {cidade.getId(), cidade.getNome(), cidade.getEstado().getId()};

            insert("TBCIDADE", columns, values);
        }
    }

    public void inserirTodasCapitais(Cidade[] cidades) {
        for (Cidade cidade : cidades) {
            inserirCidade(cidade);
        }
    }

    private boolean cidadeExiste(int idCidade) {
        String sql = "SELECT COUNT(*) FROM TBCIDADE WHERE IDCIDADE = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCidade);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar cidade: " + e.getMessage());
        }
        return false;
    }
}
