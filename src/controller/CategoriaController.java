package controller;

import model.Categoria;

public class CategoriaController extends Base {
    public void inserirCategoria(Categoria categoria) {
        String[] columns = {"ID", "NOME", "STATUS", "URLIMG"};
        Object[] values = {categoria.getId(), categoria.getNome(), categoria.getStatus(), categoria.getImgUrl()};

        insert("TBCATEGORIA", columns, values);
    }
}
