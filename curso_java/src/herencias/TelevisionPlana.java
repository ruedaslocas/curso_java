package herencias;

public class TelevisionPlana extends Televisor {

	private String tipo;

	public TelevisionPlana(double pul, String tipo, double precio, String nombre) {

		super(pul, nombre, precio);
		setTipo(tipo);

	}

	// getter y setter

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// toString
	@Override
	public String toString() {
		return "\n------------" + super.toString() + "\ntipo: " + tipo + "\n" + "\n------------------";
	}

}
