package com.kaitzen;

public class App 
{
<<<<<<< d1eee42ad5460c968396afbbb3002a70fc6c5db2
    public static void main( String[] args )
    {
        
    }
=======
	 public static void main( String[] args )
	    {
	        System.out.println("---------------- Cuenta 1 ----------------");

	        Cuenta c1 = new Cuenta();
	        c1.ingreso(200);
	        c1.reintegro(100);
	        c1.transferencia(130);
	        System.out.println(c1.toString());

	        System.out.println("---------------- Cuenta 2 ----------------");

	        Cuenta c2 = new Cuenta(500, "Fede");
	        System.out.println(c2);

	        System.out.println("---------------- Cuenta 3 ----------------");

	        Cuenta c3 = new Cuenta(c1);
	        c3.setName("Nico");
	        c3.ingreso(3000);
	        c3.transferencia(0);

	        c3.setName(null);
	        System.out.println(c3);
	    }
>>>>>>> Ejercicios del 1 a 3
}
