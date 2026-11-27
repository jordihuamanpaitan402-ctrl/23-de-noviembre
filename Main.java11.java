import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int procesados = 0;

        while (true) {

            System.out.print("Tiempo de respuesta en ms: ");

            int tiempo = sc.nextInt();

            procesados++;

            if (tiempo > 5000) {

                System.out.println("Tiempo crítico: " + tiempo + " ms");

                break;

            }

        }

        System.out.println("Registros procesados: " + procesados);

        sc.close();

    }

}