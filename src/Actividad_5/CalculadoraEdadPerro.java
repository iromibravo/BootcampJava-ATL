package Actividad_5;
import java.util.Scanner;

public class CalculadoraEdadPerro {

    public static void main(String[] args) {
        Scanner edadcanina = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro: ");
        int edadPerro = edadcanina.nextInt();

        if (edadPerro <= 0) {
            System.out.println("La edad debe ser un número positivo.");
        } else {
            int edadHumana = edadPerro * 7;
            System.out.println("La edad de su perro es: " + edadHumana+" "+"años edad humana");
        }
    }
}
