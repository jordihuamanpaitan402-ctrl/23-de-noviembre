import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String ganador = "";

        int puntajeFinal = 0;

        while (true) {

            System.out.print("Nombre del participante: ");

            String nombre = sc.nextLine();

            System.out.print("Puntaje: ");

            int puntaje = Integer.parseInt(sc.nextLine());

            if (puntaje >= 100) {

                ganador = nombre;

                puntajeFinal = puntaje;

                break;

            }

        }

        System.out.println("Ganador: " + ganador);

        System.out.println("Puntaje final: " + puntajeFinal);

        sc.close();

    }

}