package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Estado;

public class EstadoController extends Base {
    public void inserirEstado(Estado estado) {
        if (!estadoExiste(estado.getId())) {
            String[] columns = {"IDESTADO", "NOMEESTADO", "UF"};
            Object[] values = {estado.getId(), estado.getNome(), estado.getSigla()};

            insert("TBESTADO", columns, values);
        }
    }

    public void inserirTodosEstados(Estado[] estados) {
        for (Estado estado : estados) {
            inserirEstado(estado);
        }
    }

    private boolean estadoExiste(int idEstado) {
        String sql = "SELECT COUNT(*) FROM TBESTADO WHERE IDESTADO = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idEstado);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar estado: " + e.getMessage());
        }
        return false;
    }
}
