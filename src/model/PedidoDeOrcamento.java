package model;

public class PedidoDeOrcamento {
    private int id;
    private String descricao;
    private Anexo anexo;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Anexo getAnexo() {
		return anexo;
	}
	public void setAnexo(Anexo anexo) {
		this.anexo = anexo;
	}

    // Getters e Setters
}
