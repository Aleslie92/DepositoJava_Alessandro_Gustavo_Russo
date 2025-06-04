import java.util.Scanner;

public class GiocoNumeri {

    public static void main(String[] args) {

        int numeroRandom = (int) (Math.random() * 100) + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imposta Tentativi (scegli quanto sei bravo): ");
        int tentativi = scanner.nextInt();

        System.out.println("-------------------------------------------------------------------");
        System.out.println("Il Computer ha scelto un numero tra 1 e 100. Prova a indovinarlo!");
        System.out.println("-------------------------------------------------------------------");

        while (tentativi > 0) {

            System.out.print("Indovina il numero (tra 1 e 100): ");
            int numeroUtente = scanner.nextInt();

            if (numeroUtente < 1 || numeroUtente > 100) {
                System.out.println("Per favore, inserisci un numero tra 1 e 100.");
                continue;
            }

            if (numeroUtente == numeroRandom) {
                System.out.println("**********************************************************");
                System.out.println("Congratulazioni! Hai indovinato il numero! Il numero era: " + numeroRandom);
                System.out.println("**********************************************************");
                break;
            } else if (numeroUtente < numeroRandom) {
                System.out.println("Il numero è più alto. Riprova!");
            } else {
                System.out.println("Il numero è più basso. Riprova!");
            }

            tentativi--;

            if (tentativi == 0) {
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
                System.out.println("Hai esaurito i tentativi! Il numero era: " + numeroRandom);
                System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
            } else {
                System.out.println("Tentativi rimasti: " + tentativi);
            }

        }

        scanner.close();

    }
}
