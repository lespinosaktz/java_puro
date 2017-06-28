package com.kaitzen;

import java.util.*;

public class Cuenta {
	private float amount;
	private String name;
	private Integer id;
	private Random RDID = new Random();
	private static int MIN_SEED = 1;
	private static int MAX_SEED = 1000;
	
	public Cuenta() {
		this.id = getRdId();
		this.name = "New account";
		this.amount = 0;		
	}
	
	public Cuenta(float amount, String name){
		this.id = getRdId();
		this.name = name;
		this.amount = amount;
	}
	
	public Cuenta(Cuenta cuenta){
		this.id = getRdId();
		this.name = cuenta.getName();
		this.amount = cuenta.getAmount();
	}
	
	public Integer getId() {
		return id;
	}
	 
	public float getAmount() {
		return amount;
	}
	
	public void setAmount(float amount) {
		this.amount = amount;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if (name != null){
			this.name = name;
		}
	}
	

	public void reintegro(float amount){
		this.ingreso(amount);
	}
	
	public void ingreso(float amount){
		this.amount += amount;
	}
	
	public void transferencia(float amount){
		this.amount -= amount;
	}
	
	public int getRdId(){
		int dif;
		int minseed = RDID.nextInt(MIN_SEED);
		int maxseed = RDID.nextInt(MAX_SEED);
		if (maxseed > minseed){
			 dif = maxseed - minseed;	
		} else {
			dif =  minseed - maxseed;
		}
		return RDID.nextInt(dif);
	}
	
	public String toString(){
		return "Cuenta " + id + ", perteneciente a " + name + ", tiene un saldo de $" + amount;  
	}
}
