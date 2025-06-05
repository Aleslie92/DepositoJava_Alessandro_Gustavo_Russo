public class Zookeeper extends Dipendente {

    private Zoo zoo;

    public Zookeeper(String nome, String cognome, int eta, String ruolo, Zoo zoo) {
        super(nome, cognome, eta, ruolo);
        this.zoo = zoo;
    }

    public void gestisciZoo() {
        System.out.println("Il custode " + getNome() + " sta gestendo lo zoo.");
        zoo.mostraZoo();
    }

    @Override
    public String toString() {
        return "Zookeeper{" +
                "nome='" + getNome() + '\'' +
                ", cognome='" + getCognome() + '\'' +
                ", eta=" + getEta() +
                ", ruolo='" + getRuolo() + '\'' +
                ", zoo=" + zoo +
                '}';
    }

}
