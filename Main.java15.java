import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int validos = 0;

        while (true) {

            System.out.print("Nombre del producto: ");

            String producto = sc.nextLine();

            System.out.print("Stock: ");

            int stock = Integer.parseInt(sc.nextLine());

            if (stock < 0) {

                System.out.println("Producto con error: " + producto);

                break;

            }

            validos++;

        }

        System.out.println("Registros válidos: " + validos);

        sc.close();

    }

}