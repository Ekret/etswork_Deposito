

package cuentas;

/**
 * /**

 * Esta clase define objetos que contienen tantos enteros aleatorios entre 0 y 1000 como se le definen al crear un objeto

 * @author: Iker Mesa Pérez

 * @version: 07/06/2023
 
 * La clase CCuenta representa una cuenta bancaria con nombre, número de cuenta,
 * saldo y tipo de interés.
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Crea una nueva instancia de CCuenta.
     *
     * @param nombre       El nombre del titular de la cuenta.
     * @param cuenta       El número de cuenta.
     * @param saldo        El saldo de la cuenta.
     * @param tipoInterés  El tipo de interés de la cuenta.
     */
    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.saldo = saldo;
        this.tipoInteres = tipoInterés;
    }

    /**
     * Devuelve el estado actual del saldo de la cuenta.
     *
     * @return El saldo de la cuenta.
     */
    public double estado() {
        return saldo;
    }

    /**
     * Realiza un ingreso en la cuenta.
     *
     * @param cantidad  La cantidad a ingresar.
     * @throws Exception Si la cantidad es negativa.
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo += cantidad;
    }

    /**
     * Realiza una retirada de dinero de la cuenta.
     *
     * @param cantidad  La cantidad a retirar.
     * @throws Exception Si la cantidad es negativa o si no hay suficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo -= cantidad;
    }
}
