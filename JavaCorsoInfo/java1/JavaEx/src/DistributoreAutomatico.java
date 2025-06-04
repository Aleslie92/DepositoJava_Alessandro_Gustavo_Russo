import java.util.Scanner;

public class DistributoreAutomatico {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto al Distributore Automatico!");
        System.out.println("INSERISCI CREDITO: ");
        double credito = scanner.nextDouble();

        System.out.println("Hai inserito: " + credito + " euro.");
        boolean uscita = false;
        while (credito > 0 && !uscita) {
            System.out.println("Scegli un'opzione:");
            System.out.println("1. Caffè - 1.50€\n" +
                    "2. Cappuccino - 2.00€\n" +
                    "3. Tè - 1.00€\n" +
                    "4. Acqua - 0.50€\n" +
                    "5. Uscire");

            int scelta = scanner.nextInt();

            double prezzo = 0.0;
            String bevanda = "";

            // Gestione della scelta dell'utente

            switch (scelta) {

                case 1:
                    prezzo = 1.50;
                    bevanda = "Caffè";
                    break;

                case 2:
                    prezzo = 2.00;
                    bevanda = "Cappuccino";
                    break;

                case 3:
                    prezzo = 1.00;
                    bevanda = "Tè";
                    break;

                case 4:
                    prezzo = 0.50;
                    bevanda = "Acqua";
                    break;

                case 5:
                    System.out.println("Uscita in corso...");
                    uscita = true;
                    break;

                default:
                    System.out.println("Scelta non valida. Riprova.");
                    break;

            }

            if (scelta >= 1 && scelta <= 4) {
                if (credito >= prezzo) {
                    credito -= prezzo;
                    System.out.println("Hai acquistato: " + bevanda);
                    System.out.println("Credito rimanente: " + credito + " euro.");
                } else {
                    System.out.println("Credito insufficiente per acquistare " + bevanda + ". Riprova.");
                }

            }
        }
        if (credito <= 0) {
            System.out.println("Credito esaurito! Grazie per aver usato il distributore.");
        } else {
            System.out.println("Grazie per aver utilizzato il distributore automatico!");
        }

        scanner.close();

    }
}
