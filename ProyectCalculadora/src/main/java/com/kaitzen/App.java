package com.kaitzen;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "------------ Suma------------" );
        Calculadora a = new Calculadora();
        a.sumar(3,2);
        a.sumar(2,3);
        a.sumar(4,12);
        
        
        System.out.println( "------------ Resta ------------" );
        Calculadora b = new Calculadora();
        a.restar(3,2);
        a.restar(2,3);
        a.restar(30,15);
        
        System.out.println( "------------ Multiplicar ------------" );
        Calculadora c = new Calculadora();
        c.multiplicar(3,1);
        c.multiplicar(2,3);
        c.multiplicar(0,15);
        
        System.out.println( "------------ Dividir ------------" );
        Calculadora d = new Calculadora();
        d.dividir(21, 7);
        c.dividir(6,3);
        c.dividir(6,4);        
        
    }
}
