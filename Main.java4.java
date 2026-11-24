import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un entero: ");

        int n = sc.nextInt();

        int divisor = 0;

        if (n > 1) {

            for (int i = 2; i <= n / 2; i++) {

                if (n % i == 0) {

                    divisor = i;

                    break;

                }

            }

        }

        if (n > 1 && divisor == 0) System.out.println(n + " es primo.");

        else {

            System.out.println(n + " no es primo.");

            if (divisor != 0) System.out.println("Primer divisor encontrado: " + divisor);

            else System.out.println("No tiene divisor válido porque el número es menor que 2.");

        }

        sc.close();

    }

}