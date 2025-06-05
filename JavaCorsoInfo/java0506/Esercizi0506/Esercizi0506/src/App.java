import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // ESERCIZIO 1
        // ArrayList<Animale> animali = new ArrayList<>();
        // animali.add(new Gatto("Micio", 3, "Siamese"));
        // animali.add(new Cane("Fido", 5, "Labrador"));
        // animali.add(new Gatto("Whiskers", 2, "Persiano"));
        // animali.add(new Cane("Rex", 4, "Pastor Tedesco"));
        // animali.add(new Gatto("Tom", 1, "Europeo"));

        // for (Animale animale : animali) {
        // System.out.println(animale);
        // animale.verso();
        // }

        // Scanner scanner = new Scanner(System.in);
        // Zoo mioZoo = new Zoo();

        // System.out.println("Benvenuto nel gestore dello zoo!");
        // System.out.println("Scegli un'opzione:");
        // System.out.println("1. Aggiungi animali");
        // System.out.println("2. Visualizza animali");
        // System.out.println("3. affida animale ad un veterinario");
        // System.out.println("5. Mostra i zooKeeper");
        // System.out.println("4. Esci");

        // int option = scanner.nextInt();
        // scanner.nextLine(); // Consuma il newline rimasto dopo nextInt()

        // switch (option) {
        // case 1:
        // System.out.println("Quanti animali vuoi aggiungere?");
        // int numAnimali = scanner.nextInt();
        // scanner.nextLine();

        // for (int i = 0; i < numAnimali; i++) {
        // System.out.println("Inserisci il tipo di animale (cane/gatto/altro):");
        // String tipo = scanner.nextLine();
        // System.out.println("Inserisci il nome:");
        // String nome = scanner.nextLine();
        // System.out.println("Inserisci la razza :");
        // String razza = scanner.nextLine();
        // System.out.println("Inserisci l'età:");
        // int eta = scanner.nextInt();
        // scanner.nextLine();

        // Animale nuovoAnimale;
        // if (tipo.equalsIgnoreCase("cane")) {
        // nuovoAnimale = new Cane(nome, eta, razza);
        // } else if (tipo.equalsIgnoreCase("gatto")) {
        // nuovoAnimale = new Gatto(nome, eta, razza);
        // } else {
        // nuovoAnimale = new Animale(nome, eta);
        // }

        // mioZoo.aggiungiAnimale(nuovoAnimale);
        // }

        // mioZoo.mostraZoo();
        // scanner.close();
        // break;

        // case 2:

        // System.out.println("Animali presenti nello zoo:");
        // mioZoo.mostraZoo();

        // break;

        // case 3:
        // System.out.println("Affida un animale ad un veterinario.");
        // System.out.println("Inserisci il nome dell'animale da affidare:");
        // String nomeAnimale = scanner.nextLine();

        // for (Animale animale : animali) {
        // if (animale.getNome().equalsIgnoreCase(nomeAnimale)) {

        // System.out.println("Affidando " + animale.getNome() + " ad un veterinario.");
        // // Affidamento ad un veterinario
        // System.out.println("Inserisci i dettagli del veterinario:");
        // System.out.println("Nome:");
        // String nomeVeterinario = scanner.nextLine();
        // System.out.println("Cognome:");
        // String cognomeVeterinario = scanner.nextLine();
        // System.out.println("Età:");
        // int etaVeterinario = scanner.nextInt();
        // scanner.nextLine(); // Consuma il newline rimasto dopo nextInt()
        // System.out.println("Specializzazione:");
        // String specializzazioneVeterinario = scanner.nextLine();
        // System.out.println("Procedura di visita in corso...");
        // Veterinario veterinario = new Veterinario(nomeVeterinario,
        // cognomeVeterinario, etaVeterinario,
        // "Veterinario", specializzazioneVeterinario);
        // veterinario.visitaAnimale(animale);
        // System.out.println("Visita completata per " + animale.getNome() + " da parte
        // del veterinario "
        // + veterinario.getNome() + ".");
        // }
        // }

        // break;

        // case 4:
        // System.out.println("Uscita dal gestore dello zoo. Arrivederci!");
        // scanner.close();
        // return;

        // case 5:
        // ArrayList<Zookeeper> zooKeepers = new ArrayList<>();

        // zooKeepers.add(new Zookeeper("Marco", "Rossi", 30, "ZooKeeper", mioZoo));
        // zooKeepers.add(new Zookeeper("Luca", "Bianchi", 28, "ZooKeeper", mioZoo));

        // System.out.println("Mostra i zooKeeper:");
        // for (Zookeeper zookeeper : zooKeepers) {
        // System.out.println(zookeeper);
        // zookeeper.gestisciZoo();
        // }
        // break;

        // default:
        // System.out.println("Opzione non valida. Riprova.");
        // scanner.close();
        // break;
        // }
        // FINE ESERCIZIO 1

        // ESERCIZIO 2

        Hotel hotel = new Hotel("Hotel Paradiso");
        boolean conPrezzo = true; // Imposta a true per mostrare il prezzo, false per non mostrarlo

        Camera camera1 = new Camera("Camera 101", 101, 100.0f);
        Camera camera2 = new Camera("Camera 102", 102, 150.0f);
        // Aggiunta di due camere standard e due suite
        Suite suite1 = new Suite("Suite 201", 201, 300.0f, "Vista mare");
        Suite suite2 = new Suite("Suite 202", 202, 350.0f, "Vista montagna");
        // Aggiunta di due suite con servizi extra

        // Aggiunta delle camere all'hotel
        hotel.aggiungiCamera(camera1);
        hotel.aggiungiCamera(camera2);
        hotel.aggiungiCamera(suite1);
        hotel.aggiungiCamera(suite2);
        System.out.println("Camere dell'hotel " + hotel.getNome() + ":");
        for (Camera camera : hotel.getCamere()) {
            if (conPrezzo) {
                camera.mostraDettagli(true);
            } else {
                camera.mostraDettagli();
            }

        }
        Hotel.contaSuite(hotel.getCamere());
        Hotel.contaCamera(hotel.getCamere());
        // FINE ESERCIZIO 2

    }
}
