// Classe genitore
class Veicolo {
    // Metodo da sovrascrivere
    void run() {
        System.out.println("Il veicolo è in marcia");
    }
}

// Classe figlia che estende Veicolo
class Bike extends Veicolo {
    public static void main(String[] args) {
        Bike obj = new Bike(); // Crea oggetto
        obj.run(); // Chiama il metodo run() ereditato
    }
}

// Classe figlia che estende Veicolo e sovrascrive il metodo run()
class Bike2 extends Veicolo {
    @Override
    void run() {
        System.out.println("La bici sta correndo in sicurezza");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // Crea oggetto
        obj.run(); // Chiama il metodo run() sovrascritto
    }

}

// Sposta le classi Bank, SBI, ICICI, AXIS e Test2 fuori da Bike2

class Bank {
    int getRateOfInterest() {
        return 0;
    }
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class ICICI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class AXIS extends Bank {
    int getRateOfInterest() {
        return 9;
    }
}

class Test2 {
    public static void main(String[] args) {

        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        AXIS axis = new AXIS();

        System.out.println("Rate" + sbi.getRateOfInterest());
        System.out.println("Rate" + icici.getRateOfInterest());
        System.out.println("Rate" + axis.getRateOfInterest());
    }
}
