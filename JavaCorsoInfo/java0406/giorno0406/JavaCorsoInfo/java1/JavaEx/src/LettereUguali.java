import java.util.HashMap;
import java.util.Scanner;

public class LettereUguali {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci una parola: ");
        String parola = scanner.nextLine().toLowerCase();

        HashMap<Character, Integer> letterCount = new HashMap<>();

        for (int i = 0; i < parola.length(); i++) {
            char lettera = parola.charAt(i);
            if (letterCount.containsKey(lettera)) {
                letterCount.put(lettera, letterCount.get(lettera) + 1);
            } else {
                letterCount.put(lettera, 1);
            }

        }
        System.out.println("Frequenza dei caratteri: " + letterCount);

    }
}
