package Actividad_6;
import java.util.Scanner;

public class PiedraPapelTijera {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] opciones = {"piedra", "papel", "tijera"};

        System.out.println("Bienvenido al juego Piedra, Papel y Tijera!");

        while (true) {
            System.out.print("\nElije tu jugada (1 - Piedra, 2 - Papel, 3 - Tijera): ");
            int jugadaUsuario = scanner.nextInt();

            if (jugadaUsuario < 1 || jugadaUsuario > 3) {
                System.out.println("Jugada inválida. Por favor, elige un número entre 1 y 3.");
                continue;
            }

            int jugadaComputadora = (int) (Math.random() * 3) + 1;
            System.out.println("Computadora juega: " + opciones[jugadaComputadora - 1]);

            if (jugadaUsuario == jugadaComputadora) {
                System.out.println("Empate!");
            } else if ((jugadaUsuario == 1 && jugadaComputadora == 3) ||
                    (jugadaUsuario == 2 && jugadaComputadora == 1) ||
                    (jugadaUsuario == 3 && jugadaComputadora == 2)) {
                System.out.println("¡Ganaste!");
            } else {
                System.out.println("Perdiste. ¡Gana la computadora!");
            }
        }
    }
}
