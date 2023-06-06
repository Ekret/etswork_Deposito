/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Iker Mesa Pérez
 */

public class Main {

    public static void main(String[] args) {
        CCuenta MiCuenta;
        double saldoActual;

        MiCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = MiCuenta.estado();
        System.out.println("El saldo actual es: " + saldoActual);

        try {
            MiCuenta.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            MiCuenta.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
