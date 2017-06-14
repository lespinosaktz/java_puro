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
				return "El libro " + this.name + " actualmente est� en la: " + this.ubicacion + " y el �ltimo en retirarlo fue: " +  this.alumno_resp;
			} else {
				return "El libro " + this.name + " actualmente est� en la: " + this.ubicacion + ", todav�a no fue prestado";
			}
		} else {
			return "El libro " + this.name + " actualmente est� con: " + this.ubicacion + ", quien lo retir� es: " + this.alumno_resp;
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
