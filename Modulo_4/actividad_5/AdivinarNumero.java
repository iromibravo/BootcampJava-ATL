package Clase_5;

import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int numeroAleatorio = (int) (Math.random() * 100 + 1);

        System.out.println("Adivine un número del 1 al 100");
        int numeroIngresado = scanner.nextInt();

        if (numeroAleatorio == numeroIngresado) {
            System.out.println("¡Número Correcto!");
        } else {
            System.out.println("¡Número Incorrecto!");
        }
//        System.out.println("El número era: "+" "+numeroAleatorio);
    }
}