import public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int secreto = r.nextInt(100) + 1;

        int intentos = 0, numero;

        while (true) {

            System.out.print("Adivine (1 a 100): ");

            numero = sc.nextInt();

            intentos++;

            if (numero == secreto) {

                System.out.println("¡Felicitaciones! Adivinó.");

                break;

            } else if (numero < secreto) System.out.println("El número es mayor.");

            else System.out.println("El número es menor.");

        }

        System.out.println("Intentos usados: " + intentos);

        sc.close();

    }

}