package cuentas;

/**
 * Clase que contiene el punto de entrada principal del programa.
 
 * @author: Iker Mesa Pérez

 * @version: 07/06/2023
 
 * La clase CCuenta representa una cuenta bancaria con nombre, número de cuenta,
 * saldo y tipo de interés.
 */
public class Main {

    /**
     * Realiza las operaciones en una cuenta específica.
     *
     * @param cuenta La cuenta en la que se realizarán las operaciones.
     */
    public static void operativa_cuenta(CCuenta cuenta) {
        double saldoActual;

        saldoActual = cuenta.estado();
        System.out.println("El saldo actual es " + saldoActual);

        try {
            cuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }

        try {
            cuenta.ingresar(500);
            System.out.println("Ingreso en cuenta");
            cuenta.retirar(230);
            System.out.println("Retirada de cuenta");
        } catch (Exception e) {
            System.out.println("Fallo al operar con la cuenta: " + e.getMessage());
        }
    }

    /**
     * Punto de entrada principal del programa.
     *
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        CCuenta cuenta1;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);

        operativa_cuenta(cuenta1);
    }
}
