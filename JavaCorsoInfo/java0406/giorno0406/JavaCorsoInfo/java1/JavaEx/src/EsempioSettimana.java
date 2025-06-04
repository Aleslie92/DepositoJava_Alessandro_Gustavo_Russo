import java.util.Scanner;

public class EsempioSettimana {
    
    
    public static void main(String[] args) {
        
        Scanner mioscanner = new Scanner(System.in);
        // Scanner intScanner = new Scanner(System.in);
        
        System.out.println("Inserisci il tuo nome:");
        String nome = mioscanner.nextLine();

        System.out.println("Inserisci l'anno di nascita:");
        int annoNascita = mioscanner.nextInt();
       
        System.out.println("Quale giorno della settimana e'?? :");
        int giorniMancanti = mioscanner.nextInt();

      
        
        
        
        System.out.println("Ciao " + nome);
        controlloEta(annoNascita);
        controlloGiorniAlSabato(giorniMancanti);


       
    }

     public static void controlloEta(int annoDiNascita) {
            int eta = 2025 - annoDiNascita;
            if (eta < 0) {
                System.out.println("Sei nato nel futuro!");
            } else if (eta == 0) {
                System.out.println("Sei appena nato!");
            } else {
                System.out.println("Hai " + eta + " anni.");
            }
        }

        public static void controlloGiorniAlSabato(int giorniMancanti) {
            int giorniAlSabato = 6 - giorniMancanti;
            if (giorniAlSabato < 0) {
                System.out.println("Il fine settimana è già passato!");
            } else if (giorniAlSabato == 0) {
                System.out.println("Oggi è sabato!");
            } else {
                System.out.println("Mancano " + giorniAlSabato + " giorni al sabato.");
            }
        }
}