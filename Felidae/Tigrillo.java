package Felidae;

public class Tigrillo extends Felinos{
    //Atributos de clase
    public String latin;
    int tamanio, altura;

    //Constructor
    public Tigrillo(String nombre_comun, String nombre_cientifico,
                 String latin,
                 int tamanio,
                 int altura) {
        super(nombre_comun, nombre_cientifico);
        this.tamanio = tamanio;
        this.altura= altura;
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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    private String habitat(){
        System.out.println("Son concurrentes en la Amazonia sudamericana");
        return null;
    }
    private String caza(){
        System.out.println("Cazan en solitario a sus presas");
        return null;
    }
    private String habitos(){
        System.out.println("Son animales nocturnos y cazan desde los arboles");
        return null;
    }

    private String presas(){
        System.out.println("Sus presas principales son monos pequenos.");
        return null;
    }

    public void imprimirDatos(){
        System.out.println("\nSu nombre en latin es: "+latin);
        System.out.println("Su tamaño promedio es "+tamanio);
        System.out.println("Su altura promedio es " + altura);
        habitat();
        caza();
        habitos();
        presas();
    }

}

