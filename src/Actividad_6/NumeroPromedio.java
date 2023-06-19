package Actividad_6;

import java.util.Scanner;

public class NumeroPromedio {
    public static void main(String[] args) {
        Scanner ingresoteclado = new Scanner(System.in);

        System.out.println("Ingrese el primer número");
        float numero1 = ingresoteclado.nextInt();

        System.out.println("Ingrese el segundo número");
        float numero2 = ingresoteclado.nextInt();

        System.out.println("Ingrese el tercer número");
        float numero3 = ingresoteclado.nextInt();

        float promedio= (numero1+numero2+numero3)/3;
        System.out.println("El promedio es: "+promedio);
    }
}
