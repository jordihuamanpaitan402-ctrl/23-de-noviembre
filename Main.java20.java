import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int validos = 0, numeroPaquete = 0;

        while (true) {

            System.out.print("¿El paquete está corrupto? (S/N): ");

            String estado = sc.nextLine();

            numeroPaquete++;

            if (estado.equalsIgnoreCase("S")) {

                System.out.println("Paquete corrupto número: " + numeroPaquete);

                break;

            }

            validos++;

        }

        System.out.println("Paquetes válidos procesados: " + validos);

        sc.close();

    }

}