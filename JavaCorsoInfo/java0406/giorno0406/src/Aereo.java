public class Aereo {

    private String modello;
    private int capacitaPasseggeri;
    private String codiceIdentificativo;

    public Aereo(String modello, int capacitaPasseggeri, String codiceIdentificativo) {
        this.modello = modello;
        this.capacitaPasseggeri = capacitaPasseggeri;
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getCapacitaPasseggeri() {
        return capacitaPasseggeri;
    }

    public void setCapacitaPasseggeri(int capacitaPasseggeri) {
        if (capacitaPasseggeri < 0) {
            throw new IllegalArgumentException("La capacità dei passeggeri non può essere negativa.");

        }
        this.capacitaPasseggeri = capacitaPasseggeri;
    }

    public String getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public void setCodiceIdentificativo(String codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

}
