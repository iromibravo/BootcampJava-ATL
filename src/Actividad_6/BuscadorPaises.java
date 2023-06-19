package Actividad_6;
import java.util.Scanner;

public class BuscadorPaises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un país por favor: ");
        String pais = scanner.nextLine();

        String url = "https://www.google.com/maps/search/" + pais;
        System.out.println("Ubicación de"+ " " +pais+ " "+ "en Google Maps: " + url);
    }
}
