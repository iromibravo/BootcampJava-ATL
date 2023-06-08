package Clase_5;
import java.util.Scanner;

public class CalculadoraDescuento {

    public static void main(String[] args) {
        Scanner descuento = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto");
        double precioOriginal = descuento.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");
        double porcentajeDescuento = descuento.nextDouble();

        double precioFinal = precioOriginal - (precioOriginal * porcentajeDescuento / 100);

        System.out.printf("El precio final del producto es:" + " " + precioFinal);
    }
}