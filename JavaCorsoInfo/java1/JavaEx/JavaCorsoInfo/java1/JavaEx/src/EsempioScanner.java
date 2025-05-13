import java.util.Scanner;

public class EsempioScanner {

    public static void main(String[] args) throws Exception {
    
        // Scanner è una classe che permette di leggere l'input da tastiera
        Scanner myObj= new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");   
        // Legge l'input dell'utente
        String userName = myObj.nextLine();
        // // Stampa l'input dell'utente
        // System.out.println("Username: " + userName );
        //chiude lo scanner perche' non serve piu'
        //se l'input non e' una stringa ,avvisa dell'errore
        if(userName == null ){
            System.out.println("Errore: non hai inserito un nome");
        }
        else{
            System.out.println("Hai inserito il nome: " + userName);
        }
        myObj.close();
     
    }
    
}
