import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Officina officina = new Officina();

        Auto auto1 = new Auto("Fiat", "Panda", 2020);
        Auto auto2 = new Auto("Toyota", "Yaris", 2019);
        Auto auto3 = new Auto("Ford", "Fiesta", 2021);

        officina.addAuto(auto1);
        officina.addAuto(auto2);
        officina.addAuto(auto3);

        officina.printAutoList();

        officina.removeAuto(auto2);

        officina.printAutoList();

        Person person = new Person();
        person.setName("Alessandro");
        person.setAge(18);

        person.stampaMaggiorenne(person.getAge());
        System.out.println("Nome della persona: " + person.getName());

        // Gestione studenti
        Studente s1 = new Studente("Mario Rossi", 8);

        System.out.println("Nome: " + s1.getNome());
        System.out.println("Voto: " + s1.getVoto());

        s1.setVoto(9); // valido
        System.out.println("Nuovo voto: " + s1.getVoto());

        s1.setVoto(15); // non valido

        ArrayList<Studente> studenti = new ArrayList<>();
        studenti.add(s1);
        studenti.add(new Studente("Luisa Bianchi", 7));

        System.out.println("Lista studenti:");
        for (Studente studente : studenti) {
            System.out.println(
                    " Nome: " + studente.getNome() + ", Voto: " + studente.getVoto());
        }

        // cerca un studente per nome

        Professore prof = new Professore("Prof. Bianchi");
        prof.aggiungiStudente(s1);
        prof.aggiungiStudente(new Studente("Luisa Verdi", 9));
        prof.aggiungiStudente(new Studente("Giovanni Neri", 6));

        // Stampa tutti gli studenti
        prof.stampaStudenti();

        // Cerca studente per nome
        Studente trovato = prof.cercaStudentePerNome("Luisa Verdi");
        if (trovato != null) {
            System.out.println("Studente trovato: " + trovato.getNome() + " con voto " + trovato.getVoto());
        } else {
            System.out.println("Studente non trovato.");
        }

    }
}
