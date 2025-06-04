
import java.util.ArrayList;

public class Officina {

    private ArrayList<Auto> autoList;

    public Officina() {
        this.autoList = new ArrayList<>();
    }

    public void addAuto(Auto auto) {
        autoList.add(auto);
        System.out.println("Auto aggiunta: " + auto);
    }

    public void removeAuto(Auto auto) {
        autoList.remove(auto);
        System.out.println("Auto rimossa: " + auto);
    }

    public void printAutoList() {
        System.out.println("Lista delle auto in officina:");
        if (autoList.isEmpty()) {
            System.out.println("Nessuna auto presente in officina.");
            return;
        }
        for (Auto auto : autoList) {
            System.out.println(auto);
        }
    }
}
