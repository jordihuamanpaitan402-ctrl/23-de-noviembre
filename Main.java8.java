import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] codigos = {"AX100", "BC200", "ABC123", "DD400", "EF500"};

        int revisados = 0, posicion = -1;

        for (int i = 0; i < codigos.length; i++) {

            revisados++;

            if (codigos[i].equals("ABC123")) {

                posicion = i + 1;

                break;

            }

        }

        if (posicion != -1) System.out.println("Código encontrado en posición: " + posicion);

        else System.out.println("Código no encontrado.");

        System.out.println("Códigos revisados: " + revisados);

        sc.close();

    }

}