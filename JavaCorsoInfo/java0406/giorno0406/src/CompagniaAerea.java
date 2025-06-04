import java.util.ArrayList;

public class CompagniaAerea {

    private String nome;
    private ArrayList<Aereo> flotta;
    private ArrayList<Pilota> piloti;

    public CompagniaAerea(String nome) {
        this.nome = nome;
        this.flotta = new ArrayList<>();
        this.piloti = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Aereo> getFlotta() {
        return flotta;
    }

    public void setFlotta(ArrayList<Aereo> flotta) {
        this.flotta = flotta;
    }

    public ArrayList<Pilota> getPiloti() {
        return piloti;
    }

    public void setPiloti(ArrayList<Pilota> piloti) {
        this.piloti = piloti;
    }

    public void aggiungiAereo(Aereo aereo) {
        flotta.add(aereo);
        System.out.println("Aereo aggiunto: " + aereo);
    }

    public void rimuoviAereo(Aereo aereo) {
        if (flotta.remove(aereo)) {
            System.out.println("Aereo rimosso: " + aereo);
        } else {
            System.out.println("Aereo non trovato nella flotta.");
        }
    }

    public void aggiungiPilota(Pilota pilota) {

        piloti.add(pilota);
        System.out.println("Pilota aggiunto: " + pilota.getNome());
    }

    public void rimuoviPilota(Pilota pilota) {
        if (piloti.remove(pilota)) {
            System.out.println("Pilota rimosso: " + pilota.getNome());
        } else {
            System.out.println("Pilota non trovato nella lista.");
        }
    }

    public void stampaFlotta() {
        System.out.println("Flotta della compagnia " + nome + ":");
        for (Aereo aereo : flotta) {
            System.out.println(" - " + aereo.getModello() + " (ID: " + aereo.getCodiceIdentificativo() + ", Capacità: "
                    + aereo.getCapacitaPasseggeri() + ")");
        }
        System.out.println("Piloti della compagnia " + nome + ":");
        for (Pilota pilota : piloti) {
            System.out.println(" - " + pilota.getNome() + " (Brevetto: " + pilota.getNumeroBrevetto()
                    + ", Ore di volo: " + pilota.getOreVolo() + ")");
        }
    }

    public Aereo cercaAereoPerID(String id) {
        for (Aereo aereo : flotta) {
            if (aereo.getCodiceIdentificativo().equals(id)) {
                return aereo;
            }
        }
        return null; // Aereo non trovato
    }

    public Pilota cercaPilotaPerNome(String nome) {
        for (Pilota pilota : piloti) {
            if (pilota.getNome().equalsIgnoreCase(nome)) {
                return pilota;
            }
        }
        return null; // Pilota non trovato
    }

}
