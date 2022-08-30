package DTO;

public class implementsDTO {
	
	private String comentario;
	private String nomeProf;
	
	public implementsDTO() {}
	
	public implementsDTO(String comentario, String nomeProf) {
		this.comentario = comentario;
		this.nomeProf = nomeProf;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getNomeProf() {
		return nomeProf;
	}
	public void setNomeProf(String nomeProf) {
		this.nomeProf = nomeProf;
	}
	
	
	
}
