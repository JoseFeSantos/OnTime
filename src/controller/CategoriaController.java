package controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Categoria;

public class CategoriaController extends Base {
    public void inserirCategoria(Categoria categoria) {
        if (!categoraExiste(categoria.getId())) {
        String[] columns = {"ID", "NOME", "STATUS", "URLIMG"};
        Object[] values = {categoria.getId(), categoria.getNome(), categoria.getStatus(), categoria.getImgUrl()};

        insert("TBCATEGORIA", columns, values);
        }
    }
    
    public void atualizarCategoria(Categoria categoria) {
        if (categoraExiste(categoria.getId())) {
            String[] columns = {"NOME", "STATUS", "URLIMG"};
            Object[] values = {categoria.getNome(), categoria.getStatus(), categoria.getImgUrl()};
            
            update("TBCATEGORIA", "ID", categoria.getId(), columns, values);
        }
    }

    public void deletarCategoria(int idCategoria) {
        if (categoraExiste(idCategoria)) {
            delete("TBCATEGORIA", "ID", idCategoria);
        }
    }
    
    public void inserirTodasCategorias(Categoria[] categorias) {
        for (Categoria categoria: categorias) {
            inserirCategoria(categoria);
        }
    }

    private boolean categoraExiste(int idCategoria) {
        String sql = "SELECT COUNT(*) FROM TBCATEGORIA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, idCategoria);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1) > 0;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar categoria: " + e.getMessage());
        }
        return false;
    }
}