import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // Officina officina = new Officina();

        // Auto auto1 = new Auto("Fiat", "Panda", 2020);
        // Auto auto2 = new Auto("Toyota", "Yaris", 2019);
        // Auto auto3 = new Auto("Ford", "Fiesta", 2021);

        // officina.addAuto(auto1);
        // officina.addAuto(auto2);
        // officina.addAuto(auto3);

        // officina.printAutoList();

        // officina.removeAuto(auto2);

        // officina.printAutoList();

        // Person person = new Person();
        // person.setName("Alessandro");
        // person.setAge(18);

        // person.stampaMaggiorenne(person.getAge());
        // System.out.println("Nome della persona: " + person.getName());

        // // Gestione studenti
        // Studente s1 = new Studente("Mario Rossi", 8);

        // System.out.println("Nome: " + s1.getNome());
        // System.out.println("Voto: " + s1.getVoto());

        // s1.setVoto(9); // valido
        // System.out.println("Nuovo voto: " + s1.getVoto());

        // s1.setVoto(15); // non valido

        // ArrayList<Studente> studenti = new ArrayList<>();
        // studenti.add(s1);
        // studenti.add(new Studente("Luisa Bianchi", 7));

        // System.out.println("Lista studenti:");
        // for (Studente studente : studenti) {
        // System.out.println(
        // " Nome: " + studente.getNome() + ", Voto: " + studente.getVoto());
        // }

        // // cerca un studente per nome

        // Professore prof = new Professore("Prof. Bianchi");
        // prof.aggiungiStudente(s1);
        // prof.aggiungiStudente(new Studente("Luisa Verdi", 9));
        // prof.aggiungiStudente(new Studente("Giovanni Neri", 6));

        // // Stampa tutti gli studenti
        // prof.stampaStudenti();

        // // Cerca studente per nome
        // Studente trovato = prof.cercaStudentePerNome("Luisa Verdi");
        // if (trovato != null) {
        // System.out.println("Studente trovato: " + trovato.getNome() + " con voto " +
        // trovato.getVoto());
        // } else {
        // System.out.println("Studente non trovato.");
        // }

        // Voli

        // Scanner scanner = new Scanner(System.in);
        // ArrayList<CompagniaAerea> compagnie = new ArrayList<>();
        // // Creazione di alcune compagnie aeree
        // CompagniaAerea compagnia1 = new CompagniaAerea("Alitalia");
        // CompagniaAerea compagnia2 = new CompagniaAerea("Ryanair");
        // CompagniaAerea compagnia3 = new CompagniaAerea("EasyJet");
        // compagnie.add(compagnia1);
        // compagnie.add(compagnia2);
        // compagnie.add(compagnia3);
        // System.out.println("Benvenuto nel sistema di gestione della compagnia
        // aerea!");
        // boolean running = true;

        // while (running) {
        // System.out.println("\n--- MENU ---");
        // System.out.println("1. Aggiungi aereo");
        // System.out.println("2. Aggiungi pilota");
        // System.out.println("3. Cerca aereo per ID");
        // System.out.println("4. Cerca pilota per nome");
        // System.out.println("5. Rimuovi aereo per ID");
        // System.out.println("6. Rimuovi pilota per nome");
        // System.out.println("7. Stampa flotta");
        // System.out.println("0. Esci");
        // System.out.print("Scegli un'opzione: ");
        // int scelta = scanner.nextInt();
        // scanner.nextLine(); // Consuma newline

        // switch (scelta) {
        // case 1: // Aggiungi aereo
        // System.out.print("Nome modello aereo: ");
        // String nomeAereo = scanner.nextLine();
        // System.out.print("Capienza: ");
        // int capienzaAereo = scanner.nextInt();
        // scanner.nextLine();
        // System.out.print("Codice identificativo: ");
        // String codiceAereo = scanner.nextLine();
        // System.out.println("Seleziona la compagnia aerea:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagnia = scanner.nextInt();
        // scanner.nextLine(); // Consuma newline
        // if (sceltaCompagnia < 1 || sceltaCompagnia > compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // continue;
        // }
        // CompagniaAerea compagnia = compagnie.get(sceltaCompagnia);
        // compagnia.aggiungiAereo(new Aereo(nomeAereo, capienzaAereo, codiceAereo));
        // System.out.println("Aereo aggiunto!");
        // break;

        // case 2: // Aggiungi pilota
        // System.out.print("Nome pilota: ");
        // String nomePilota = scanner.nextLine();
        // System.out.print("Numero brevetto: ");
        // int numeroBrevetto = scanner.nextInt();
        // System.out.print("Ore di volo: ");
        // int oreVolo = scanner.nextInt();
        // scanner.nextLine();
        // System.out.println("Seleziona la compagnia aerea:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaPilota = scanner.nextInt();
        // scanner.nextLine(); // Consuma newline
        // if (sceltaCompagniaPilota < 1 || sceltaCompagniaPilota > compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // continue;
        // }
        // CompagniaAerea compagniaPilota = compagnie.get(sceltaCompagniaPilota);
        // compagniaPilota.aggiungiPilota(new Pilota(nomePilota, numeroBrevetto,
        // oreVolo));
        // System.out.println("Pilota aggiunto!");
        // break;

        // case 3: // Cerca aereo per ID
        // System.out.println("Seleziona la compagnia aerea per la ricerca:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaRicerca = scanner.nextInt();
        // scanner.nextLine();
        // if (sceltaCompagniaRicerca < 1 || sceltaCompagniaRicerca > compagnie.size())
        // {
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // CompagniaAerea compagniaRicerca = compagnie.get(sceltaCompagniaRicerca);
        // System.out.print("ID aereo da cercare: ");
        // String idAereo = scanner.nextLine();
        // Aereo aereoTrovato = compagniaRicerca.cercaAereoPerID(idAereo);
        // if (aereoTrovato != null) {
        // System.out.println("Aereo trovato: " + aereoTrovato.getModello() + " (ID: "
        // + aereoTrovato.getCodiceIdentificativo() + ")");
        // } else {
        // System.out.println("Aereo non trovato.");
        // }
        // break;

        // case 4: // Cerca pilota per nome
        // System.out.println("Seleziona la compagnia aerea per la ricerca:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaPilotaRicerca = scanner.nextInt();
        // scanner.nextLine();
        // if (sceltaCompagniaPilotaRicerca < 1 || sceltaCompagniaPilotaRicerca >
        // compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // CompagniaAerea compagniaPilotaRicerca =
        // compagnie.get(sceltaCompagniaPilotaRicerca);
        // System.out.print("Nome pilota da cercare: ");
        // String nomePilotaCercato = scanner.nextLine();
        // Pilota pilotaTrovato =
        // compagniaPilotaRicerca.cercaPilotaPerNome(nomePilotaCercato);
        // if (pilotaTrovato != null) {
        // System.out.println("Pilota trovato: " + pilotaTrovato.getNome() + "
        // (Brevetto: "
        // + pilotaTrovato.getNumeroBrevetto() + ", Ore di volo: " +
        // pilotaTrovato.getOreVolo()
        // + ")");
        // } else {
        // System.out.println("Pilota non trovato.");
        // }
        // break;

        // case 5: // Rimuovi aereo per ID
        // System.out.println("Seleziona la compagnia aerea:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaRimozione = scanner.nextInt();
        // scanner.nextLine();
        // if (sceltaCompagniaRimozione < 1 || sceltaCompagniaRimozione >
        // compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // CompagniaAerea compagniaRimozione = compagnie.get(sceltaCompagniaRimozione);
        // System.out.print("ID aereo da rimuovere: ");
        // String idAereoDaRimuovere = scanner.nextLine();
        // Aereo aereoDaRimuovere =
        // compagniaRimozione.cercaAereoPerID(idAereoDaRimuovere);
        // if (aereoDaRimuovere != null) {
        // compagniaRimozione.rimuoviAereo(aereoDaRimuovere);
        // System.out.println("Aereo rimosso.");
        // } else {
        // System.out.println("Aereo non trovato.");
        // }
        // break;

        // case 6: // Rimuovi pilota per nome
        // System.out.println("Seleziona la compagnia aerea:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaPilotaRimozione = scanner.nextInt();
        // scanner.nextLine();
        // if (sceltaCompagniaPilotaRimozione < 1 || sceltaCompagniaPilotaRimozione >
        // compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // CompagniaAerea compagniaPilotaRimozione =
        // compagnie.get(sceltaCompagniaPilotaRimozione);
        // System.out.print("Nome pilota da rimuovere: ");
        // String nomePilotaDaRimuovere = scanner.nextLine();
        // Pilota pilotaDaRimuovere =
        // compagniaPilotaRimozione.cercaPilotaPerNome(nomePilotaDaRimuovere);
        // if (pilotaDaRimuovere != null) {
        // compagniaPilotaRimozione.rimuoviPilota(pilotaDaRimuovere);
        // System.out.println("Pilota rimosso.");
        // } else {
        // System.out.println("Pilota non trovato.");
        // }
        // break;

        // case 7: // Stampa flotta
        // System.out.println("Seleziona la compagnia aerea:");
        // for (int i = 0; i < compagnie.size(); i++) {
        // System.out.println((i + 1) + ". " + compagnie.get(i).getNome());
        // }
        // int sceltaCompagniaStampa = scanner.nextInt();
        // scanner.nextLine();
        // if (sceltaCompagniaStampa < 1 || sceltaCompagniaStampa > compagnie.size()) {
        // System.out.println("Scelta non valida.");
        // break;
        // }
        // CompagniaAerea compagniaStampa = compagnie.get(sceltaCompagniaStampa);
        // compagniaStampa.stampaFlotta();
        // break;

        // case 0:
        // running = false;
        // System.out.println("Arrivederci!");
        // break;

        // default:
        // System.out.println("Scelta non valida.");
        // }
        // }
        // scanner.close();
        // }
        Scanner scanner = new Scanner(System.in);
        Ristoranti ristorante = new Ristoranti();

        System.out.println("Benvenuto! Inserisci il tuo nome:");
        String nome = scanner.nextLine();
        System.out.println("Inserisci la tua email:");
        String email = scanner.nextLine();

        System.out.println("Scegli il tuo ruolo: 1 per Chef, 2 per Critico");
        int scelta = scanner.nextInt();
        scanner.nextLine(); // Consuma il newline

        Utente utente;
        if (scelta == 1) {
            utente = new Chef(nome, email);
            System.out.println("Hai scelto di diventare un Chef!");
            System.out.println(utente.getUsername() + " ha " + String.format("%.2f", utente.getSoldi())
                    + "€ nel suo portafoglio.");
        } else {
            utente = new Critico(nome, email);
            System.out.println("Hai scelto di diventare un Critico!");
            System.out.println(utente.getUsername() + " ha " + String.format("%.2f", utente.getSoldi())
                    + "€ nel suo portafoglio.");
        }

        boolean continua = true;
        while (continua) {
            System.out.println("\nMenu:");
            System.out.println("1. Aggiungi un piatto (Chef)");
            System.out.println("2. Lascia una recensione (Critico)");
            System.out.println("3. Visualizza menu del ristorante");
            System.out.println("4. Visualizza recensioni");
            System.out.println("5. Esci");
            System.out.print("Scegli un'opzione: ");

            int opzione = scanner.nextInt();
            scanner.nextLine();

            switch (opzione) {
                case 1:
                    if (utente instanceof Chef) {
                        System.out.println("Inserisci il nome del piatto:");
                        String piatto = scanner.nextLine();
                        ((Chef) utente).creaPiatto(ristorante, piatto);
                    } else {
                        System.out.println("Solo i Chef possono aggiungere piatti!");
                    }
                    break;
                case 2:
                    if (utente instanceof Critico) {
                        System.out.println("Inserisci la tua recensione:");
                        String recensione = scanner.nextLine();
                        ((Critico) utente).lasciaRecensione(ristorante, recensione);
                    } else {
                        System.out.println("Solo i Critici possono lasciare recensioni!");
                    }
                    break;
                case 3:
                    ristorante.stampaMenu();
                    break;
                case 4:
                    ristorante.stampaValutazioni();
                    break;
                case 5:
                    continua = false;
                    System.out.println("Grazie per aver usato il sistema!");
                    break;
                default:
                    System.out.println("Opzione non valida. Riprova.");
            }
        }

        scanner.close();
    }

}
