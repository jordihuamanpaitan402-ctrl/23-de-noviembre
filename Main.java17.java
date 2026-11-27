import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int operaciones = 0;

        while (true) {

            System.out.print("Monto del movimiento (0 para terminar): S/ ");

            double monto = sc.nextDouble();

            if (monto == 0) break;

            operaciones++;

            if (monto > 10000) {

                System.out.println("Monto sospechoso: S/ " + monto);

                break;

            }

        }

        System.out.println("Operaciones revisadas: " + operaciones);

        sc.close();

    }

}