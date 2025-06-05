import java.util.Random;

public class Utente {
    private String username;
    private String password;
    private String email;
    private float soldi;

    // public Utente(String username, String password) {
    // this.username = username;
    // this.password = password;
    // }

    public Utente(String username, String email) {
        this.username = username;
        this.email = email;
        this.soldi = randomizzaSoldi(); // Inizializza soldi con un valore casuale
    }

    public Utente(String username, String password, String email, float soldi) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.soldi = soldi;

    }

    public String getUsername() {
        return username;
    }

    public boolean checkPassword(String inputPassword) {
        return this.password.equals(inputPassword);
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getSoldi() {
        return soldi;
    }

    public void setSoldi(float soldi) {
        this.soldi = soldi;
    }

    private float randomizzaSoldi() {
        Random rand = new Random();
        return rand.nextFloat() * 100; // Valore casuale tra 0 e 100€
    }

    public void stampaDati() {
        System.out.println("Nome: " + username);
        System.out.println("Email: " + email);
        System.out.println("Credito: " + soldi + "€");
    }

}
