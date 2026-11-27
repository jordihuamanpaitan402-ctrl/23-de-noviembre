import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int total = 0, ventas = 0;

        while (total < 500) {

            System.out.print("Entradas vendidas en esta venta: ");

            int cantidad = sc.nextInt();

            if (cantidad <= 0) {

                System.out.println("Ingrese una cantidad positiva.");

                continue;

            }

            total += cantidad;

            ventas++;

        }

        System.out.println("Total vendido: " + total);

        System.out.println("Número de ventas: " + ventas);

        sc.close();

    }

}