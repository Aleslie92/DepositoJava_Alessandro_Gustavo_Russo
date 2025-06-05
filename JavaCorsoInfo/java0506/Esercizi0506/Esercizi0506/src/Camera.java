public class Camera {

    private String nome;
    private int numero;
    private float prezzo;

    public Camera(String nome, int numero, float prezzo) {
        this.nome = nome;
        this.numero = numero;
        this.prezzo = prezzo;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public void mostraDettagli() {
        System.out.println("Camera numero: " + numero);
    }

    public void mostraDettagli(boolean conPrezzo) {
        if (conPrezzo) {
            System.out.println("Camera numero: " + numero + ", Prezzo: " + prezzo + " euro");
        } else {
            System.out.println("Camera numero: " + numero);

        }

    }

}
