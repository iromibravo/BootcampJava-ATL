package Actividad_6;

import java.util.Scanner;

public class NumeroParImpar {
    public static void main(String[] args) {
        Scanner numeroteclado = new Scanner(System.in);

        System.out.println("Ingrese el número");
        int numero = numeroteclado.nextInt();

        int resto = numero % 2;
        if (resto == 0) {
            System.out.println("El" + " "+ numero + " "+ "es Par");
        } else {
            System.out.println("El" + " "+  numero + " "+ "es Impar");
        }
    }
}