import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Cane> cani;
    private List<Gatto> gatti;
    private List<Animale> altriAnimali;

    public Zoo() {
        cani = new ArrayList<>();
        gatti = new ArrayList<>();
        altriAnimali = new ArrayList<>();
    }

    public void aggiungiAnimale(Animale animale) {
        if (animale instanceof Cane) {
            cani.add((Cane) animale);
        } else if (animale instanceof Gatto) {
            gatti.add((Gatto) animale);
        } else {
            altriAnimali.add(animale);
        }
    }

    public void mostraZoo() {
        System.out.println("Cani nel zoo:");
        for (Cane c : cani) {
            System.out.println(c.getNome() + " - Età: " + c.getEta());
        }

        System.out.println("Gatti nel zoo:");
        for (Gatto g : gatti) {
            System.out.println(g.getNome() + " - Età: " + g.getEta());
        }

        System.out.println("Altri animali nel zoo:");
        for (Animale a : altriAnimali) {
            System.out.println(a.getNome() + " - Età: " + a.getEta());
        }
    }

}