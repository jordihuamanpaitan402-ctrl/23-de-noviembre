import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int respuesta, cantidad = 0, suma = 0;

        while (true) {

            System.out.print("Califique de 1 a 5 (0 para terminar): ");

            respuesta = sc.nextInt();

            if (respuesta == 0) break;

            if (respuesta < 1 || respuesta > 5) {

                System.out.println("Respuesta inválida.");

                continue;

            }

            suma += respuesta;

            cantidad++;

        }

        System.out.println("Total de respuestas: " + cantidad);

        if (cantidad > 0) System.out.println("Promedio: " + (double)suma / cantidad);

        else System.out.println("No hay respuestas para promediar.");

        sc.close();

    }

}