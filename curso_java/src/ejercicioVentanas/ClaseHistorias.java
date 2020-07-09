package ejercicioVentanas;

public class ClaseHistorias {
	
	private String historia;
	private String descripcion;
	
	
	public ClaseHistorias() {
		this.historia = "";
		this.descripcion = "";
	}
	
	
	public ClaseHistorias(String historia, String descripcion) {
		this.historia = historia;
		this.descripcion = descripcion;
	}
	
	
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
