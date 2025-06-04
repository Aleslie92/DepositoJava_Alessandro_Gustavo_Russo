
public class Pilota {

    private String nome;
    private int numeroBrevetto;
    private int oreVolo;

    public Pilota(String nome, int numeroBrevetto, int oreVolo) {
        this.nome = nome;
        this.numeroBrevetto = numeroBrevetto;
        this.oreVolo = oreVolo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroBrevetto() {
        return numeroBrevetto;
    }

    public void setNumeroBrevetto(int numeroBrevetto) {
        this.numeroBrevetto = numeroBrevetto;
    }

    public int getOreVolo() {
        return oreVolo;
    }

    public void setOreVolo(int oreVolo) {
        if (oreVolo < 0) {
            throw new IllegalArgumentException("Le ore di volo non possono essere negative.");
        }
        this.oreVolo = oreVolo;
    }

}
