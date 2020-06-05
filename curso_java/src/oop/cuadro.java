package oop;

public class cuadro {
//variables
	private String titulo;
	private String autor;
	private int altura;
	private int anchura;
	private int año;
	private boolean restaurado;
	private double precio;

	/*public cuadro() {
		
		setAltura(altura);
		setAnchura(anchura);
		setAutor(autor);
		setAño(año);
		setPrecio(precio);
		setRestaurado(restaurado);
		setTitulo(titulo);

	}*/
	
	

	public cuadro(String titulo, String autor, int altura, int anchura, int año, boolean restaurado, double precio) {
		this.titulo = titulo;
		this.autor = autor;
		this.altura = altura;
		this.anchura = anchura;
		this.año = año;
		this.restaurado = restaurado;
		this.precio = precio;
	}





	@Override
	public String toString() {
		return "\n<-------------------------------------------->\ntitulo: " + titulo + "\nAutor: " + autor + "\naltura: " + altura + "\nanchura: " + anchura
				+ "\naño: " + año + "\nrestaurado: " + restaurado + "\nprecio: " + precio + "\n<-------------------------------------------->";
	}

	// geter y setter
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getAnchura() {
		return anchura;
	}

	public void setAnchura(int anchura) {
		this.anchura = anchura;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public boolean isRestaurado() {
		return restaurado;
	}

	public void setRestaurado(boolean restaurado) {
		this.restaurado = restaurado;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

}
