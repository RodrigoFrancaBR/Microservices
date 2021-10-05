package br.com.alura.microservice.loja.dto;

public class VendaDTO {

	private Long id;
	private Integer tempoDePreparo;
	private String endereco;

	public VendaDTO(Long id, Integer tempoDePreparo, String endereco) {
		this.id = id;
		this.tempoDePreparo = tempoDePreparo;
		this.endereco = endereco;
	}
	
	public VendaDTO() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTempoDePreparo() {
		return tempoDePreparo;
	}

	public void setTempoDePreparo(Integer tempoDePreparo) {
		this.tempoDePreparo = tempoDePreparo;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	

}
