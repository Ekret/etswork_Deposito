package cuentas;

public class CCuenta {
//primero cambiamos el nombre de la variable tipo a tipoInteres para que sea más claro a lo que nos estamos refiriendo
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;



    public CCuenta(String nombre, String cuenta, double saldo, double tipoInterés) {

    }

    public double estado() {
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }

    public void operativa_cuenta(double cantidad) {
        try {
            ingresar(cantidad);
            System.out.println("Ingreso en cuenta");
            retirar(230);
            System.out.println("Retirada de cuenta");
        } catch (Exception e) {
            System.out.println("Fallo al operar con la cuenta: " + e.getMessage());
        }
    }
}
