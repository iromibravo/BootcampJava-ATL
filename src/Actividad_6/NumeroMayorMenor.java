package Actividad_6;

import java.util.Scanner;

public class NumeroMayorMenor {
    public static void main(String[] args) {
        Scanner numerosporteclado = new Scanner(System.in);

        System.out.println("Ingrese tres números");
        int a = numerosporteclado.nextInt();
        int b = numerosporteclado.nextInt();
        int c = numerosporteclado.nextInt();


        int mayor = Math.max(a, Math.max(b, c));
        int menor = Math.min(a, Math.min(b, c));

        System.out.println("El número mayor es: " + mayor);
        System.out.println("El número menor es: " + menor);
    }
}
