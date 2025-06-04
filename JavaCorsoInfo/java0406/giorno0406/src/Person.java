public class Person {

    private String name;
    private int eta;

    public String getName() {
        return name;
    }

    public int getAge() {
        return eta;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int eta) {
        this.eta = eta;
    }

    private boolean controllaSeMaggiorenne(int eta) {
        return this.eta >= 18;
    }

    public void stampaMaggiorenne(int eta) {
        if (controllaSeMaggiorenne(eta)) {
            System.out.println("La persona è maggiorenne.");
        } else {
            System.out.println("La persona non è maggiorenne.");
        }
    }
}
