package model;

public class Cliente {
    private int id;
    private String nomeCompleto;
    private String cpf;
    private String sexo;
//    private String fotoPerfil;
    private Endereco endereco;
    private String status;
    
    public Cliente() {
    	}
    
		public Cliente(int id, String nomeCompleto, String cpf, String sexo, /* Endereco endereco, */String status) {
        this.id = id;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.sexo = sexo;
//        this.endereco = endereco;
        this.status = status;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeCompleto() {
		return nomeCompleto;
	}
	public void setNomeCompleto(String nomeCompleto) {
		this.nomeCompleto = nomeCompleto;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
//	public String getFotoPerfil() {
//		return fotoPerfil;
//	}
//	public void setFotoPerfil(String fotoPerfil) {
//		this.fotoPerfil = fotoPerfil;
//	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    
}