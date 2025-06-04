public class Ereditarieta {

    static class Veicle {
        protected String brand = "Ford";

        public void honk() {
            System.out.println("tuu,tuuuuu");
        }
    }

    static class Car extends Veicle {
        private String modelName = "Subaru";

        public static void main(String[] args) {
            Car myCar = new Car();
            myCar.honk();
            System.out.println(myCar.brand + " " + myCar.modelName);

        }

    }
}
