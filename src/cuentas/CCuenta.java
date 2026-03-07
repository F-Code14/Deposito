package cuentas;

/** 
 * Clase que representa una cuenta bancaria.
 * Permite ingresar dinero, retirar dinero y consultar saldo disponible.
 */

public class CCuenta {

	/**Nombre del titular de la cuenta*/
    private String nombre;
    /**Número de cuenta bancaria*/
    private String cuenta;
    /**Saldo actual de la cuenta*/
    private double saldo;
    /**Tipo de interés asociado a la cuenta*/
    private double tipoInterés;
    
    /**
     * Constructor sin parámetros
     */

    public CCuenta()
    {
    }

    
    /**
     * Constructor con parámetros
     * 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    
    /**
     * Devuelve el saldo actual de la cuenta
     * 
     * @return
     */

    public double estado()
    {
        return saldo;
    }
    
    /**
     * Ingresa una cantidad de dinero en la cuenta.
     * 
     * @param cantidad cantidad que se desea ingresar
     * @throws Exception se lanza si cantidad es negativa
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
    /**
     * Retira una cantidad de dinero de la cuenta
     * 
     * @param cantidad cantidad que se desa retirar
     * @throws Exception se lanza si la cantidad es negativa o no hay suficiente saldo
     */

    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}

