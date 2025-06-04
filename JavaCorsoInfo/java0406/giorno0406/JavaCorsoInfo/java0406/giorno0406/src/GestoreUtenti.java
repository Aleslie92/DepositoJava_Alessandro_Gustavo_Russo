import java.util.HashMap;
import java.util.Map;

public class GestoreUtenti {
    private Map<String, Utente> utenti = new HashMap<>();

    public boolean registraUtente(String username, String password) {
        if (utenti.containsKey(username))
            return false;
        utenti.put(username, new Utente(username, password));
        return true;
    }

    public Utente login(String username, String password) {
        Utente utente = utenti.get(username);
        if (utente != null && utente.checkPassword(password)) {
            return utente;
        }
        return null;
    }
}
