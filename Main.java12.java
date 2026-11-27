import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0;

        while (true) {

            System.out.print("Nombre (FIN para terminar): ");

            String nombre = sc.nextLine();

            if (nombre.equalsIgnoreCase("FIN")) break;

            if (!nombre.trim().isEmpty()) total++;

        }

        System.out.println("Total de asistentes registrados: " + total);

        sc.close();

    }

}