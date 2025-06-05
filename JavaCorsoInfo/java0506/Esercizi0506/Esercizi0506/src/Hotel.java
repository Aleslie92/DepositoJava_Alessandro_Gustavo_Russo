import java.util.ArrayList;

public class Hotel {

    private String nome;
    private ArrayList<Camera> camere;
    private static int contatoreSuite = 0;
    private static int contatoreCamera = 0;

    public Hotel(String nome) {
        this.nome = nome;
        this.camere = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Camera> getCamere() {
        return camere;
    }

    public void setCamere(ArrayList<Camera> camere) {
        this.camere = camere;
    }

    public void aggiungiCamera(Camera camera) {
        camere.add(camera);
        System.out.println("Camera aggiunta");
    }

    public static void contaSuite(ArrayList<Camera> camere) {
        for (Camera camera : camere) {
            if (camera instanceof Suite) {
                contatoreSuite++;
            }
        }
        System.out.println("Numero di suite: " + contatoreSuite);
    }

    public static void contaCamera(ArrayList<Camera> camere) {
        for (Camera camera : camere) {
            if (camera instanceof Camera) {
                contatoreCamera++;
            }
        }
        System.out.println("Numero di camere: " + contatoreSuite);
    }

}
