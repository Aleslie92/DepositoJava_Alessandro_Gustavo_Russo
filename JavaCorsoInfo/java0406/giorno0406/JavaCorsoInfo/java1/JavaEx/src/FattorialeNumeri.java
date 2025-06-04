public class FattorialeNumeri {

    public static void main(String[] args) {
        int numero = 5; // Cambia questo valore per calcolare il fattoriale di un altro numero
        int fattoriale = calcolaFattoriale(numero);
        System.out.println("Il fattoriale di " + numero + " è: " + fattoriale);


        
    }

    public static int calcolaFattoriale(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Il numero deve essere maggiore o uguale a zero.");
        }
        int risultato = 1;
        for (int i = 2; i <= n; i++) {
            risultato *= i;
        }
        return risultato;
    }

    public static void calcolaFattoriale(String s) {
        System.out.println("Inserisci un numero valido");
    }
}
