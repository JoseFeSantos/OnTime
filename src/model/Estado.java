package model;

public class Estado {
    private int id;
    private String nome;
    private String sigla;
    
    public Estado(int id, String nome, String sigla) {
    	this.id = id;
    	this.nome = nome;
    	this.sigla = sigla;
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
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	@Override
	public String toString() {
		return "Estado [id=" + id + ", nome=" + nome + ", sigla=" + sigla + "]";
	}
    
}