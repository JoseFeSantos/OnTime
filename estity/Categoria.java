package entity;

import java.util.Objects;
 
//@Entity
//@Table(name="TB_CATEGORIA")

public class CategoriaEntity {
    private int id;
    private String nome;
    private String status;
    private String UrlImg;

    public CategoriaEntity() {
    }

    public CategoriaEntity(int id, String nome, String status, String UrlImg) {
        this.id = id;
        this.nome = nome;
        this.status = status;
        this.UrlImg = UrlImg;
    }

    public int getId(){
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String nome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getStatus() {
        return status;
    }

    public void SetStatus(String status) {
        this.status = status;
    }

    public String getUrlImg() {
        return UrlImg;
    }

    public void UrlUmg(String urlString) {
        this.UrlImg = UrlImg;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass()!= obj.getClass())
            return false;
        CategoriaEntity other = (CategoriaEntity) obj;
        return Objects.equals(id, other.id);
    }
}