public class PrimeVariabili {
    public static void main(String[] args) {

        // inizializzazione di variabili con tipi primitivi
        int provaNumero = 12;
        String provaTesto = "Ciao Universo";
        boolean provaBooleano = true;
        // rappresentazione di una costante
        final int provaCostante = 1000; 

        // provaCostante = 2000; // errore di compilazione, non posso cambiare il valore di una costante
   

        // esempio Stringhe 
        provaTesto = "Ciao Mondo";
        System.out.println("Saluto"+provaTesto);

        // Creo un saluto tramite concatenazioni di stringhe
        String firstPart= "Ciao";
        String secondPart= "Mondo";
        String saluto = firstPart + " " + secondPart;
        System.out.println("Saluto: " + saluto);

        // inizializzazione interi con addizione tra variabili
        int x = 5;
        int y = 6;
        System.out.println(x+y);

        int a = 3,b=4,c=5;
        System.out.println(a+b+c);

        int g,h,f;

        g=h=f=50;
        System.out.println(g+h+f);
        }
    
}
