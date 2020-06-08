package herencias;

public class Televisor extends Electrodomestico {

	//protected static final double pulgadasD=0.0;

	
	
	private double pulgadas;

	public Televisor(double pul, String nombre, double precio) {
		
		super(nombre, precio);
		setPulgadas(pul);
		
	}
	

	
	//getter y setter
	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}

	
	
	@Override
	public String toString() {
		return  super.toString()+"\npulgadas: " + pulgadas ;
	}

}
