import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestoreUtenti gestoreUtenti = new GestoreUtenti();

        // REGISTRAZIONE (una volta sola all'avvio)
        System.out.println("=== REGISTRAZIONE ===");
        System.out.print("Crea username: ");
        String nuovoUser = scanner.nextLine();
        System.out.print("Crea password: ");
        String nuovaPass = scanner.nextLine();
        if (gestoreUtenti.registraUtente(nuovoUser, nuovaPass)) {
            System.out.println("Registrazione completata!\n");
        } else {
            System.out.println("Utente già registrato.\n");
        }

        // LOGIN
        System.out.println("=== LOGIN ===");
        Utente utenteLoggato = null;
        while (utenteLoggato == null) {
            System.out.print("Username: ");
            String user = scanner.nextLine();
            System.out.print("Password: ");
            String pass = scanner.nextLine();
            utenteLoggato = gestoreUtenti.login(user, pass);
            if (utenteLoggato == null) {
                System.out.println("Credenziali errate. Riprova.");
            }
        }
        System.out.println("Login effettuato con successo! Benvenuto " + utenteLoggato.getUsername() + "\n");

        // MENU PRINCIPALE
        while (true) {
            PiattoSpeciale piatto = new PiattoSpeciale();

            // Scelta pane (privato)
            PiattoSpeciale.stampaTipiPane();
            System.out.print("Scegli il tipo di pane: ");
            String tipoPane = scanner.nextLine().trim().toLowerCase();
            while (!piatto.setTipoPane(tipoPane)) {
                System.out.print("Tipo non valido. Riprova: ");
                tipoPane = scanner.nextLine().trim().toLowerCase();
            }

            // Scelta ingredienti pubblici
            PiattoSpeciale.stampaIngredientiPubblici();
            System.out.println("Aggiungi ingredienti pubblici (scrivi 'fine' per terminare):");
            while (true) {
                System.out.print("Ingrediente: ");
                String ingr = scanner.nextLine().trim().toLowerCase();
                if (ingr.equals("fine"))
                    break;
                if (!piatto.addIngredientePubblico(ingr)) {
                    System.out.println("Ingrediente non valido. Riprova.");
                }
            }

            // Stampa finale
            piatto.stampaPiatto();

            System.out.print("Vuoi creare un altro piatto? (s/n): ");
            if (!scanner.nextLine().trim().equalsIgnoreCase("s"))
                break;
        }

        scanner.close();
    }
}
