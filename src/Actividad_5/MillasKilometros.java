package Actividad_5;
import java.util.Scanner;

public class MillasKilometros {
    public static void main(String[] args) {
        Scanner millas = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas");
        double distanciaMillas = millas.nextDouble();

        System.out.println("La distancia es "+(distanciaMillas*1.60934)+" "+ "Kilómetros");
    }
}
