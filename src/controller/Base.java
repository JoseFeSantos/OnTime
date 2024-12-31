package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.ConexaoJDBC;

public abstract class Base {
    protected Connection connection;

    public Base () {
        this.connection = ConexaoJDBC.getConnection();
    }

    public void insert(String tableName, String[] columns, Object[] values) {
        StringBuilder sql = new StringBuilder("INSERT INTO " + tableName + " (");
        for (String column : columns) {
            sql.append(column).append(",");
        }
        sql.deleteCharAt(sql.length() - 1).append(") VALUES (");
        for (int i = 0; i < values.length; i++) {
            sql.append("?,");
        }
        sql.deleteCharAt(sql.length() - 1).append(")");

        try (PreparedStatement stmt = connection.prepareStatement(sql.toString())) {
            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]);
            }
            stmt.executeUpdate();
            System.out.println("Inserção realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao inserir dados: " + e.getMessage());
        }
    }

    public void delete(String tableName, String idColumn, Object idValue) {
        String sql = "DELETE FROM " + tableName + " WHERE " + idColumn + " = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setObject(1, idValue);
            stmt.executeUpdate();
            System.out.println("Exclusão realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao excluir dados: " + e.getMessage());
        }
    }

    public void update(String tableName, String idColumn, Object idValue, String[] columns, Object[] values) {
        StringBuilder sql = new StringBuilder("UPDATE " + tableName + " SET ");
        for (String column : columns) {
            sql.append(column).append(" = ?,");
        }
        sql.deleteCharAt(sql.length() - 1).append(" WHERE " + idColumn + " = ?");

        try (PreparedStatement stmt = connection.prepareStatement(sql.toString())) {
            for (int i = 0; i < values.length; i++) {
                stmt.setObject(i + 1, values[i]);
            }
            stmt.setObject(values.length + 1, idValue);
            stmt.executeUpdate();
            System.out.println("Atualização realizada com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao atualizar dados: " + e.getMessage());
        }
    }
}
