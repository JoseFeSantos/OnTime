package model;

public class Endereco {
    private int id;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private int cep;
    private Cidade cidade;
//    private int latitude;
//    private int longitude;
    
    public Endereco () {
    	}
    
	public Endereco(int id, String logradouro, int numero, String complemento, String bairro, int cep, Cidade cidade) {
	this.id = id;
	this.logradouro = logradouro;
	this.numero = numero;
	this.complemento = complemento;
	this.bairro = bairro;
	this.cep = cep;
	this.cidade = cidade;
}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getCep() {
		return cep;
	}
	public void setCep(int cep) {
		this.cep = cep;
	}
	public Cidade getCidade() {
		return cidade;
	}
	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
//	public int getLatitude() {
//		return latitude;
//	}
//	public void setLatitude(int latitude) {
//		this.latitude = latitude;
//	}
//	public int getLongitude() {
//		return longitude;
//	}
//	public void setLongitude(int longitude) {
//		this.longitude = longitude;
//	}



	@Override
	public String toString() {
		return "Endereco [id=" + id + ", logradouro=" + logradouro + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + "]";
	}
}