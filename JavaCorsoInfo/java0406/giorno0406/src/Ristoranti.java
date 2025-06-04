import java.util.ArrayList;
import java.util.List;

public class Ristoranti {

    private List<String> piatti = new ArrayList<>();
    private List<String> valutazioni = new ArrayList<>();

    public void aggiungiPiatto(String piatto) {
        piatti.add(piatto);
    }

    public void aggiungiValutazione(String valutazione) {
        valutazioni.add(valutazione);
    }

    public void stampaMenu() {
        System.out.println("Piatti disponibili: " + piatti);
    }

    public void stampaValutazioni() {
        System.out.println("Recensioni piatti: " + valutazioni);
    }

}
