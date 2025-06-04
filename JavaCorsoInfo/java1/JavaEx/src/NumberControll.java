import java.util.Scanner;

public class NumberControll {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci il primo numero:");
        int numero1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero:");
        int numero2 = scanner.nextInt();
        System.out.println("Inserisci il terzo numero:");
        int numero3 = scanner.nextInt();


        System.out.println(numeroMaggiore(numero1, numero2, numero3));
        scanner.close();
    }

    public static String numeroMaggiore(int numero1, int numero2, int numero3) {
        if (numero1==numero2 && numero1==numero3){
            return("I tre numeri sono uguali");
        }else if (numero1==numero2){
            return(numero1 + " e " + numero2 + " sono uguali (numero 1 e numero 2)");
        }else if (numero1==numero3){
            return(numero1 + " e " + numero3 + " sono uguali (numero 1 e numero 3)");
        }else if (numero2==numero3){
            return(numero2 + " e " + numero3 + " sono uguali (numero 2 e numero 3)");
        }else if (numero1>numero2 && numero1>numero3) {
            return(numero1 + " è il (primo inserito) numero piu' grande");  
        }else if (numero2>numero1 && numero2>numero3){
            return(numero2 + " è il (secondo inserito) numero piu' grande");
        }else if (numero3>numero1 && numero3>numero2){
            return(numero3 + " è il (terzo inserito) numero piu' grande");
        }else{
            return"Controlla bene c'e' un errore";
        }
    }
}
