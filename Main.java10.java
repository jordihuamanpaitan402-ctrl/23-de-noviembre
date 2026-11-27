import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int procesados = 0;

        while (true) {

            System.out.print("Monto de transferencia: S/ ");

            double monto = sc.nextDouble();

            procesados++;

            if (monto > 100000) {

                System.out.println("Transferencia detectada: S/ " + monto);

                break;

            }

        }

        System.out.println("Registros procesados: " + procesados);

        sc.close();

    }

}