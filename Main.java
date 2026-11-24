import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int cantidad = 0;

        double suma = 0, nota, mayor = -1, menor = 21;

        while (true) {

            System.out.print("Ingrese una nota (20 para terminar): ");

            nota = sc.nextDouble();

            if (nota == 20) break;

            if (nota < 0 || nota > 20) {

                System.out.println("Nota fuera del rango. No se registra.");

                continue;

            }

            cantidad++;

            suma += nota;

            if (nota > mayor) mayor = nota;

            if (nota < menor) menor = nota;

        }

        if (cantidad > 0) {

            System.out.println("Notas registradas: " + cantidad);

            System.out.println("Promedio: " + (suma / cantidad));

            System.out.println("Nota máxima: " + mayor);

            System.out.println("Nota mínima: " + menor);

        } else System.out.println("No se registraron notas.");

        sc.close();

    }
}