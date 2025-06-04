import java.util.Scanner;

public class Tabellina {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Inserisci un numero: ");
        int numero = input.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
        input.close();
        System.out.println("Tabellina completata!");
    }
}
