package Actividad_6;

import java.util.Scanner;

public class LlamadaWhatsapp {
    public static void main(String[] args) {
        Scanner llamada = new Scanner(System.in);

        System.out.println("Ingrese por favor un número telefónico");
        String telefono = llamada.nextLine();

        String api = "https://api.whatsapp.com/send?phone="+ telefono;
        System.out.println("Dale clic al enlace para comunicarse"+" "+ api);
    }
}
