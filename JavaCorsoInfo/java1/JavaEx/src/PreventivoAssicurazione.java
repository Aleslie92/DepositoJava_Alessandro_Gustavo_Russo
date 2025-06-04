import java.util.Scanner;

public class PreventivoAssicurazione {
// Esercizio
// Scrivi un programma Java che calcoli il preventivo per un'assicurazione auto in base ai
// seguenti criteri:
// 1.Età del conducente:
// ⚬ Meno di 18 anni → "Non sei idoneo per l'assicurazione"
// ⚬ 18 - 25 anni → Applica una maggiorazione del 20% sul prezzo base
// ⚬ 26 - 50 anni → Nessuna maggiorazione
// ⚬ Più di 50 anni → Sconto del 10%
// 2.Anni di esperienza alla guida:
// ⚬ Meno di 2 anni → Applica una maggiorazione del 30% sul prezzo base
// ⚬ 2 o più anni → Nessuna maggiorazione
// 3.Numero di incidenti negli ultimi 5 anni:
// ⚬ 0 incidenti → Nessun aumento
// ⚬ 1 incidente → Aumento del 15%
// ⚬ 2 o più incidenti → Aumento del 30%
// ⚬ Più di 4 incidenti → "Non sei idoneo per l'assicurazione"
// 4.Scelta del pacchetto assicurativo:
// ⚬ Base: Prezzo standard
// ⚬ Intermedio: +20%
// ⚬ Premium: +50%
// Prezzo base dell'assicurazione: 500€

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final double prezzoBase = 500.0;

        double prezzoFinale = prezzoBase;
        
        // Età del conducente
        System.out.println("Inserisci la tua età:");
        int eta = scanner.nextInt();

        if (eta < 18) {
            System.out.println("Non sei idoneo per l'assicurazione"); 
            return; // Esci dal programma se non idoneo
        }else if (eta >= 18 && eta <= 25) {
            System.out.println("Applica una maggiorazione del 20% sul prezzo base");
            prezzoFinale += prezzoBase * 0.20;
        } else if (eta >= 26 && eta <= 50) {
            System.out.println("Nessuna maggiorazione");
        } else {
            System.out.println("Sconto del 10%");
            prezzoFinale -= prezzoBase * 0.10;  
        }


        // Anni di esperienza alla guida
        System.out.println("Inserisci gli anni di esperienza alla guida:");
        int esperienza = scanner.nextInt();
        if (esperienza < 2) {
            System.out.println("Applica una maggiorazione del 30% sul prezzo base");
            prezzoFinale += prezzoBase * 0.30;
        } else if(esperienza >= 2) {
            System.out.println("Nessuna maggiorazione");
        } 


        // Numero di incidenti negli ultimi 5 anni
        System.out.println("Inserisci il numero di incidenti negli ultimi 5 anni:");
        int incidenti = scanner.nextInt();

        switch (incidenti) {
            case 0:
                System.out.println("Nessun aumento");
                
                break;
            case 1:
                System.out.println("Aumento del 15%");
                prezzoFinale += prezzoBase * 0.15;
                break;

            case 2:
                
            case 3:
               
            case 4:
                System.out.println("Aumento del 30%");
                prezzoFinale += prezzoBase * 0.30;
                break;
            default:
                System.out.println("Non sei idoneo per l'assicurazione");
                return;
        }

        // Scelta del pacchetto assicurativo
        System.out.println("Scegli il pacchetto assicurativo (Base, Intermedio, Premium):");
        String pacchetto = scanner.next().toLowerCase();
        switch (pacchetto) {
           
            case "intermedio":
                System.out.println("Aumento del 20%");
                prezzoFinale += prezzoBase * 0.20;
                break;
            case "premium":
                System.out.println("Aumento del 50%");
                prezzoFinale += prezzoBase * 0.50;
                break;
            
        }

        // Stampa il prezzo finale
        System.out.println("Il prezzo finale dell'assicurazione è: " + prezzoFinale + "€");
        // Chiudo lo scanner
        scanner.close();
    }
}
