import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion, operaciones = 0;

        do {

            System.out.println("\n1. Consultar saldo");

            System.out.println("2. Retirar");

            System.out.println("3. Depositar");

            System.out.println("4. Salir");

            System.out.print("Elija: ");

            opcion = sc.nextInt();

            if (opcion == 4) break;

            if (opcion >= 1 && opcion <= 3) {

                operaciones++;

                System.out.println("Operación realizada (simulación).");

            } else System.out.println("Opción no válida.");

        } while (true);

        System.out.println("Operaciones realizadas: " + operaciones);

        System.out.println("Sesión cerrada. Gracias.");

        sc.close();

    }

}