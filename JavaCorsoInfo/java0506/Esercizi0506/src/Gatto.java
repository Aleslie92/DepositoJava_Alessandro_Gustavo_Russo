public class Gatto extends Animale {

    private String razza;

    public Gatto(String nome, int eta, String razza) {
        super(nome, eta);
        this.razza = razza;
    }

    public String getRazza() {
        return razza;
    }

    public void setRazza(String razza) {
        this.razza = razza;
    }

    @Override
    public void verso() {
        System.out.println("Il gatto " + getNome() + " miagola.");
    }

    @Override
    public String toString() {
        return "Gatto{" +
                "nome='" + getNome() + '\'' +
                ", eta=" + getEta() +
                ", razza='" + razza + '\'' +
                '}';
    }

}
