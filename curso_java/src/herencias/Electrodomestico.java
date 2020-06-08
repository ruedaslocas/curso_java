package herencias;

public class Electrodomestico {
	private String nombre;
	private double precio;

	public Electrodomestico(String nombre, double precio) {

		setNombre(nombre);
		setPrecio(precio);
	}

	// ToString
	@Override
	public String toString() {
		return "\nNombre: " + nombre + "\nprecio: " + precio;
	}

	// Getter y Setter

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio2) {
		this.precio = precio2;
	}


}
