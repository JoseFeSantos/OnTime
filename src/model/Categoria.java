package model;

public class Categoria {
    private int id;
    private String nome;
    private String status;
    private String imgUrl;
    
    public Categoria(int id, String nome, String status, String imgUrl) {
    	this.id = id;
    	this.nome = nome;
    	this.status = status;
    	this.imgUrl = imgUrl;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getImgUrl() {
		return imgUrl;
	}
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

    
}