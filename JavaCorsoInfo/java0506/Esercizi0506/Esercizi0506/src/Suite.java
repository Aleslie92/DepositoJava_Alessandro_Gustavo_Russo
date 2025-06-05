public class Suite extends Camera {

    private String serviziExtra;

    public Suite(String nome, int numero, float prezzo, String serviziExtra) {
        super(nome, numero, prezzo);
        this.serviziExtra = serviziExtra;
    }

    public String getserviziExtra() {
        return serviziExtra;
    }

    public void setserviziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    public String getServiziExtra() {
        return serviziExtra;
    }

    public void setServiziExtra(String serviziExtra) {
        this.serviziExtra = serviziExtra;
    }

    @Override
    public void mostraDettagli() {
        System.out
                .println("Suite numero: " + getNumero() + ", Prezzo: " + getPrezzo() + " euro, Tipo: " + serviziExtra);
    }
}
