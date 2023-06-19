package Actividad_6;

import java.util.Scanner;

public class BuscadorTweets {
    public static void main(String[] args) {
        Scanner tweets = new Scanner(System.in);

        System.out.println("Ingrese por favor el nombre de la celebridad");

        String celebridad = tweets.nextLine();
        String url = "https://twitter.com/search?q=" + celebridad;

        System.out.println("Dale clic para ver tweets de"+ " "+ celebridad+ " "+url);

    }
}
