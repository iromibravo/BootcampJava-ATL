package Actividad_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] personas = {"Iromi Bravo", "Angel Bravo", "Calimiro Bravo"};
        /*
        String [] personas = new String[10];
        personas [0]= "Iromi  Bravo";
        personas [1]= "Angel  Bravo";
        personas [2]= "Calimiro  Bravo";
        personas [3]= "David  Bravo";*/

        System.out.println("Ingrese su búsqueda");
        Scanner teclado = new Scanner(System.in);
        String busqueda = teclado.nextLine();

        for (String nombrePersona : personas) {
            if (nombrePersona.contains(busqueda)) {
                System.out.println("La persona es " + nombrePersona);
            }
        }
    }
}
