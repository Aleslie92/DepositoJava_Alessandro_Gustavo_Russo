
import java.util.Scanner;

public class CercaVocali {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Benvenuto al programma di ricerca vocali!");
        System.out.print("Inserisci una parola: ");
        String parola = scanner.nextLine().toLowerCase();

        boolean contieneVocali = true;

        for (int i = 0; i < parola.length(); i++) {

            char vocali = parola.charAt(i);
            switch (vocali) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    System.out.println("Trovata vocale: " + vocali + " alla posizione " + i);
                    contieneVocali = true;
                    break;
                default:
                    contieneVocali = false;
                    break;

            }
        }

        if (!contieneVocali) {
            System.out.println("La parola inserita non contiene vocali.");
        } else {
            System.out.println("Ricerca completata!");

        }

    }
}
