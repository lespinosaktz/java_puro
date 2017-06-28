package com.kaitzen;

import java.util.Calendar;
import java.util.Date;

public class Fecha {
	private Date fecha;
	private boolean valid = true;
	
	public Fecha() {
		this.fecha = new Date(); 
	}
	
	public Fecha(int dia, int mes, int anio) {
		Calendar date  = Calendar.getInstance();
		date.setLenient(false);
		date.set(Calendar.DAY_OF_MONTH, dia);
		date.set(Calendar.MONTH, mes);
		date.set(Calendar.YEAR, anio);
		try {
			this.fecha = date.getTime();
		}
		catch(Exception e){
			this.valid = false;
		}
	}
	
	
	public void addDay(){
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(this.fecha);
		calendar.add(Calendar.DAY_OF_MONTH, 1);
	}
	
	public boolean isValid(){
		return this.valid;
	}
	
	public String toString(){
		Calendar calendar = Calendar.getInstance();
		if (this.isValid() == true) {
			calendar.setTime(this.fecha);
			return String.format("Hoy es %1$d del mes %2$d del año %3$d", calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.MONTH) +1, calendar.get(Calendar.YEAR));
		} else {
			return "Fecha inválida";
		}
	}
	
}
