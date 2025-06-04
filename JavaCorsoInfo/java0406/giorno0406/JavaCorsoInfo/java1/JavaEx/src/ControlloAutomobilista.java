import java.util.Scanner;

public class ControlloAutomobilista {
    
    
    
    public static void main(String[] args) {
        
        Scanner controllo1 = new Scanner(System.in);
        Scanner controllo2 = new Scanner(System.in);

        System.out.println("Quanti anni hai?:");
        int eta = controllo1.nextInt();
        
        System.out.println("Hai la patente? (si/no):");
        String patente = controllo2.nextLine();
        
        System.out.println("Hai Bevuto? (si/no):");
        String bevuto = controllo2.nextLine();
        
        // if (eta <18) {
        //     System.out.println("Non puoi guidare, sei minorenne");
        // }else if (patente.equals("no")) {
        //     System.out.println("Non puoi guidare, non hai la patente");
        // } else if (bevuto.equals("si")) {
        //     System.out.println("Non puoi guidare, hai bevuto");
        // } else {
        //     System.out.println("Puoi guidare");
        // }
        
        System.out.println(controlloPatente(eta, patente, bevuto));
        controllo1.close();
        controllo2.close();
    }
    
    public static String controlloPatente(int eta, String patente, String bevuto) {
        if (eta < 18) {
            return "Non puoi guidare, sei minorenne";
        } else if (patente.toLowerCase().equals("no") ) {
            return "Non puoi guidare, non hai la patente";
        } else if (bevuto.toLowerCase().equals("si")) {
            return "Non puoi guidare, hai bevuto";
        }else {
            return "Puoi guidare";
        }
    }


}
