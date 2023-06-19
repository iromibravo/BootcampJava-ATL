package Actividad_5;
import java.util.Scanner;

public class CalculadoraPropina {
    public static void main(String[] args) {

        Scanner propina = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta");
        double totalCuenta = propina.nextDouble();

        System.out.println("Ingrese el porcentaje de la propina");
        double porcentajePropina = propina.nextDouble();

        double totalPropina = totalCuenta *(porcentajePropina/100);
        System.out.println("Monto de la Propina:"+" "+totalPropina);

        double totalPagar = totalCuenta + totalPropina;
        System.out.println("Total a pagar:"+" "+totalPagar);
    }
}