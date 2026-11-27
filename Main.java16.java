import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int revisadas = 0;

        while (true) {

            System.out.print("Medida de la pieza: ");

            double medida = sc.nextDouble();

            revisadas++;

            if (medida < 9.5 || medida > 10.5) {

                System.out.println("Medida incorrecta: " + medida);

                break;

            }

        }

        System.out.println("Piezas revisadas: " + revisadas);

        sc.close();

    }

}