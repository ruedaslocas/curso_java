package oop;

//clase:"molde", "plantilla";
public class persona {
	
	//variables de instancia
	
	private String nombre;
	private String apellido ;
	
	//constructor
	
	public persona(String nombre, String apellido) {
		
		//la mejor manera de generarlo es llamando a la funcion
		setNombre(nombre);
		setApellido(apellido);	
		
		//esto no seria una forma optima
		
		/*this.nombre=nombre;
		this.apellido=apellido;*/
		
	}
	
	public persona(String nombre) {
		this(nombre, null);
	}
	
	public persona() {
		this("anonimo", null);
	}
	
	//metodos de acceso getter y setter
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		
		
		//notificacion de error ( si nombre es null o si nombre tiene espacios y la longitud sin espacios es 0: muesta mensaje)
		if (nombre == null || nombre.trim().length() == 0) {
			throw new RuntimeException("el nombre esta vacio");	
		}
		
		//impedir que metan espacios
		this.nombre = nombre/*.trim()*/;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNombreCompleto() {
		
		return nombre+ " " +apellido;
	}
	
	

}
