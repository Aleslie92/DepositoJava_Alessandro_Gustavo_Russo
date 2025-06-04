import java.util.ArrayList;

public class Professore {
    private String nome;
    private ArrayList<Studente> studenti;

    public Professore(String nome) {
        this.nome = nome;
        this.studenti = new ArrayList<>();
    }

    public void aggiungiStudente(Studente studente) {
        studenti.add(studente);
    }

    public Studente cercaStudentePerNome(String nome) {
        for (Studente s : studenti) {
            if (s.getNome().equalsIgnoreCase(nome)) {
                return s;
            }
        }
        return null; // se non trovato
    }

    public void stampaStudenti() {
        for (Studente s : studenti) {
            System.out.println("Studente: " + s.getNome() + ", Voto: " + s.getVoto());
        }
    }
}
