import java.util.*;

public class PiattoSpeciale {
    private String tipoPane; // Ingrediente privato
    private static final double PREZZO_BASE = 1.0;
    private static final Map<String, Double> INGREDIENTI_PUBBLICI = new LinkedHashMap<>();
    private static final Map<String, Double> TIPI_PANE = new LinkedHashMap<>();

    private List<String> ingredientiScelti = new ArrayList<>();
    private double prezzoTotale = PREZZO_BASE;

    static {
        // Ingredienti pubblici
        INGREDIENTI_PUBBLICI.put("lattuga", 0.5);
        INGREDIENTI_PUBBLICI.put("pomodoro", 0.7);
        INGREDIENTI_PUBBLICI.put("cipolla", 0.6);
        INGREDIENTI_PUBBLICI.put("formaggio", 1.0);

        // Ingredienti privati (tipi di pane)
        TIPI_PANE.put("normale", 1.0);
        TIPI_PANE.put("sesamo", 1.2);
    }

    public boolean setTipoPane(String tipo) {
        if (TIPI_PANE.containsKey(tipo)) {
            this.tipoPane = tipo;
            this.prezzoTotale += TIPI_PANE.get(tipo);
            return true;
        }
        return false;
    }

    public boolean addIngredientePubblico(String ingrediente) {
        if (INGREDIENTI_PUBBLICI.containsKey(ingrediente)) {
            ingredientiScelti.add(ingrediente);
            prezzoTotale += INGREDIENTI_PUBBLICI.get(ingrediente);
            return true;
        }
        return false;
    }

    public double getPrezzoTotale() {
        return prezzoTotale;
    }

    public static void stampaIngredientiPubblici() {
        System.out.println("Ingredienti pubblici disponibili:");
        INGREDIENTI_PUBBLICI.forEach((k, v) -> System.out.println("- " + k + " (€" + v + ")"));
    }

    public static void stampaTipiPane() {
        System.out.println("Tipi di pane disponibili:");
        TIPI_PANE.forEach((k, v) -> System.out.println("- " + k + " (€" + v + ")"));
    }

    public void stampaPiatto() {
        System.out.println("Hai scelto pane: " + tipoPane);
        System.out.println("Ingredienti aggiunti: " + ingredientiScelti);
        System.out.println("Prezzo totale: €" + prezzoTotale);
    }
}
