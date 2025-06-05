public class Veterinario extends Dipendente {

    private String specializzazione;

    public Veterinario(String nome, String cognome, int eta, String ruolo, String specializzazione) {
        super(nome, cognome, eta, ruolo);
        this.specializzazione = specializzazione;
    }

    public String getSpecializzazione() {
        return specializzazione;
    }

    public void setSpecializzazione(String specializzazione) {
        this.specializzazione = specializzazione;
    }

    public void visitaAnimale(Animale animale) {
        System.out.println("Il veterinario " + getNome() + " sta visitando l'animale " + animale.getNome() + ".");
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", eta=" + getEta() +
                ", ruolo='" + getRuolo() + '\'' +
                ", specializzazione='" + specializzazione + '\'' +
                '}';
    }

}
