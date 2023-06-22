package Felidae;

public class Guepardo extends Felinos {
    //Atributos de clase
    public String latin;
    int tamanio, peso;

    //Constructor
    public Guepardo(String nombre_comun, String nombre_cientifico,
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
    private void manchas(){
        System.out.println("Poseen una cantidad amplia de manchas");
    }
    private void alimento(){
        System.out.println("Su principal alimento son las gacelas.");
    }
    private void caza(){
        System.out.println("Cazan en manada a sus presas");
    }
    private void depredadores(){
        System.out.println("Sus depredadores principales son leones u otros carnivoros grandes");
    }

    public void imprimirDatos(){
        System.out.println("\nSu nombre en latin es: "+latin);
        System.out.println("Su tamaño promedio es "+tamanio);
        System.out.println("El peso promedio es "+peso);
        manchas();
        alimento();
        caza();
        depredadores();
    }

}

