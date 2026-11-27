import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int procesados = 0;

        while (true) {

            System.out.print("Número de pedido: ");

            int numero = Integer.parseInt(sc.nextLine());

            System.out.print("¿Es urgente? (S/N): ");

            String urgente = sc.nextLine();

            procesados++;

            if (urgente.equalsIgnoreCase("S")) {

                System.out.println("Pedido urgente: " + numero);

                break;

            }

        }

        System.out.println("Pedidos procesados: " + procesados);

        sc.close();

    }

}