package oop;

public class punto {
	//1. variables de instancia (almacenamiento de datos)
	private double x , y ;

	
	//2. constructor de la clase con todas las variables de instancia
	//inicializacion rapuda de un objeto
	public punto(double x, double y) {
		setX(x); setY(y);
	}
	
	
	
	//6. metodos de instancia
	//suma de instancia
	
	public punto suma(punto p) {
		
		return new punto(x + p.getX(),y + p.getY());
		
		// o tmbn
		//return suma(this, p);
		
	}
	
	//7. metodos estaticos 
	
	public static punto suma(punto p1, punto p2) {
		
		return new punto(p1.getX() + p2.getY(),p1.getX() + p2.getY() );
	}
	
	
	
	
	
	
	

	//3.getter y setter (acceso de datos
	public double getX() {
		return x;
	}


	public void setX(double x) {
		this.x = x;
	}


	public double getY() {
		return y;
	}


	public void setY(double y) {
		this.y = y;
	}
	
	//4. conversor  a texto del objeto
	@Override
	public String toString() {
		return "punto [x=" + x + ", y=" + y + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		punto other = (punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	
	
	

}
