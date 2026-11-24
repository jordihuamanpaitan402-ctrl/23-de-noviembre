import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int lecturas = 0;

        while (true) {

            System.out.print("Temperatura: ");

            double t = sc.nextDouble();

            lecturas++;

            if (t > 95) {

                System.out.println("Temperatura crítica: " + t + " °C");

                break;

            }

        }

        System.out.println("Número de lecturas realizadas: " + lecturas);

        sc.close();

    }

}