public class Cane extends Animale {

    private String razza;

    public Cane(String nome, int eta, String razza) {
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
        System.out.println("Il cane " + getNome() + " abbaia.");
    }

    @Override
    public String toString() {
        return "Cane{" +
                "nome='" + getNome() + '\'' +
                ", eta=" + getEta() +
                ", razza='" + razza + '\'' +
                '}';
    }

}
