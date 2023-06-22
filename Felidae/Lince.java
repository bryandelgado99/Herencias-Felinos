package Felidae;

public class Lince extends Felinos {
    //Atributos de clase
    public String latin;
    int tamanio, peso;

    //Constructor
    public Lince(String nombre_comun, String nombre_cientifico,
                 String latin,
                 int tamanio,
                 int peso) {
        super(nombre_comun, nombre_cientifico);
        this.tamanio = tamanio;
        this.peso = peso;
    }

    //Metodos Setters y Getters
    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    //Metodos de la clase
    private String manada(){
        System.out.println("Son animales que viven en manada");
        return null;
    }
    private String era(){
        System.out.println("Son animales que aparecieron en Norte America");
        return null;
    }
    private String caza(){
        System.out.println("Cazan en manada a sus presas");
        return null;
    }
    private String salta(){
        System.out.println("Son animales con buen fisico y saltan muy alto.");
        return null;
    }

    public void imprimirDatos(){
        System.out.println("\nSu nombre en latin es: "+latin);
        System.out.println("Su tamaño promedio es "+tamanio);
        System.out.println("El peso promedio es "+peso);
        manada();
        era();
        caza();
        salta();
    }

}
