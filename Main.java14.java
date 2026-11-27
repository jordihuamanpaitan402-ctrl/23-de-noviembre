public class Main {

    public static void main(String[] args) {

        for (int n = 1; ; n++) {

            if (n % 17 == 0 && n % 23 == 0) {

                System.out.println("Número encontrado: " + n);

                break;

            }

        }

    }

}