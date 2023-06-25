package Actividad_10;

import java.time.LocalDate;

public class Cuenta {
    private Persona titular;
    private double saldo;
    private double cantidad;

    public Cuenta() {
        this.titular = new Persona();
    }

    public Cuenta(Persona titular, double saldoI) {
        this.titular = titular;
        this.saldo= saldoI;
    }
    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getCantidad() {
        return cantidad;
    }
    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Titular:" + '\n'+
                titular + '\n' +
                "Saldo:" + " "+ saldo;
    }

    //mostrar(): Muestra los datos de la cuenta.
    public void mostrar() {
        System.out.println(this);
    }

    //ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es negativa, no se hará nada.
    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Consignación:" + " " + cantidad + " "+ "$");
        } else {
            System.out.println("Operación rechazada por ser cantidad negativa");
        }
    }
    //retirar(cantidad): La cuenta puede estar en números rojos.
    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("ALERTA: Fondos Insuficientes");
        }
        saldo -= cantidad;
        System.out.println("Retiro: " + cantidad + " $");
    }
    public void mostrarSaldo() {
        if (saldo < 0) {
            System.out.println("Saldo: " + saldo + " $ (Números rojos)");
        } else {
            System.out.println("Saldo: " + saldo + " $");
        }
    }
}
