import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AgendaTelefono {

    public static void main(String[] args) {

        ArrayList<String> contatti = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Benvenuto nell'Agenda Telefonica!");

        boolean continua = true;

        while (continua) {
            System.out.print("Inserisci il Nome del Contatto : ");
            String nome = scanner.nextLine();
            contatti.add(nome);

            System.out.println("*********CONTATTO AGGIUNTO**********");

            System.out.println("---------------------------------------");

            System.out.print("Vuoi aggiungere un altro contatto? (si/no): ");
            String risposta = scanner.nextLine().toLowerCase();
            if (!risposta.equalsIgnoreCase("si")) {
                continua = false;
            }

        }

        Collections.sort(contatti);
        System.out.println("contatti inseriti(in ordine alfabetico): " + contatti.size());
        System.out.println("---------------------------------------");
        for (String contatto : contatti) {
            System.out.println(contatto);
        }

        System.out.println("---------------------------------------");
        System.out.print("Vuoi eliminare un contatto? (si/no): ");
        String risposta = scanner.nextLine().toLowerCase();

        if (risposta.equalsIgnoreCase("si")) {
            System.out.print("Inserisci il nome del contatto da eliminare: ");
            String contattoDaEliminare = scanner.nextLine();
            if (contatti.remove(contattoDaEliminare)) {
                System.out.println("*********CONTATTO ELIMINATO**********");
            } else {
                System.out.println("Contatto non trovato.");
            }
        } else {
            System.out.println("Nessun contatto eliminato.");
        }
        System.out.println("contatti inseriti(in ordine alfabetico): " + contatti.size());
        for (String contatto : contatti) {
            System.out.println(contatto);
        }

    }
}
