import java.util.Scanner;

public class EsercizioScanner {
    public static void main(String[] args) throws Exception {
        
        //creazione di due scanner per leggere i dati
        Scanner numScanner = new Scanner(System.in);
        Scanner strScanner = new Scanner(System.in);
        
        
        System.out.println("Inserisci un numero Intero:");
        // prendo in input un numero intero
        int NumeroIntero = numScanner.nextInt();
        
        System.out.println("Inserisci un numero Double:");
        // prendo in input un numero double
        double NumeroDouble = numScanner.nextDouble();
        
        System.out.println("Inserisci un numero Booleano:");
        
        boolean Booleano = numScanner.nextBoolean();
        
        System.out.println("Inserisci una stringa:");
        // prendo in input una stringa
        String Stringa = strScanner.nextLine();
        
        // stampo i valori inseriti
        System.out.println("Hai inserito il numero Double: " + NumeroDouble);
        
        System.out.println("Hai inserito il numero Booleano:  "+ Booleano);
        
        System.out.println("Hai inserito la stringa : " +  Stringa);
        
        System.out.println("Hai inserito il numero Intero: " + NumeroIntero);
        
        numScanner.close();
        strScanner.close();
        
        
        
        
        
        
    }
}
