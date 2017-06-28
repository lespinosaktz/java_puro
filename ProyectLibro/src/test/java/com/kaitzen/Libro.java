package com.kaitzen;

public class Libro {
	private String name;
	private String editorial;
	private Ubicacion ubicacion;
	private String alumno_resp;
	
	public Libro() {
		this.name = "Nuevo";
		this.editorial = "Editorial";
		this.alumno_resp = null;
		this.ubicacion= Ubicacion.BIBLIOTECA;
	}
	
	public Libro(String name, String editorial){
		this.name = name;
		this.editorial = editorial;
		this.alumno_resp = null;
		this.ubicacion = Ubicacion.BIBLIOTECA;
	}
	
	public void prestamo(String alumno){
		this.ubicacion = Ubicacion.ALUMNO;
		this.alumno_resp = alumno;
	}
	
	public void devolucion(){
		this.ubicacion = Ubicacion.BIBLIOTECA;		
	}
	
	public String toString(){
		if (this.ubicacion == Ubicacion.BIBLIOTECA){
			if (this.alumno_resp != null){
				return String.format("El libro  %1$s actualmente está en la: %2$s y el último en retirarlo fue: %3$s", this.name, this.ubicacion, this.alumno_resp); 
			} else {
				return String.format("El libro %1$s actualmente está en la: %2$s todavía no fue prestado", this.name, this.ubicacion) ;
			}
		} else {
			return String.format("El libro %1$s actualmente está con: %2$s quien lo retiró es: %3$s", this.name, this.ubicacion, this.alumno_resp);
		}
	}
	
	public String getAlumno_resp() {
		return alumno_resp;
	}
	public String getEditorial() {
		return editorial;
	}
	public String getName() {
		return name;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public void setName(String name) {
		this.name = name;
	}
		
}
