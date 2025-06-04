public class Studente {

    private String nome;
    private int voto;
    private static int nextId = 1; // per l'autoincremento
    private int id;

    public Studente(String nome, int voto) {
        this.nome = nome;
        this.setVoto(voto); // usa il setter per gestire il controllo sul voto
        this.id = nextId++;
    }

    public String getNome() {
        return nome;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        if (voto >= 0 && voto <= 10) {
            this.voto = voto;
        } else {
            System.out.println("Errore: Il voto deve essere compreso tra 0 e 10.");
        }
    }

}
