import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String claveCorrecta = "JAVA2026";

        boolean acceso = false;

        int intento;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Intento " + i + ": ");

            String clave = sc.nextLine();

            if (clave.equals(claveCorrecta)) {

                acceso = true;

                intento = i;

                System.out.println("Acceso concedido en el intento " + intento);

                break;

            }

            System.out.println("Contraseña incorrecta.");

        }

        if (!acceso) System.out.println("Acceso denegado. Agotó los 5 intentos.");

        sc.close();

    }

}