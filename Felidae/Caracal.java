package Felidae;

public class Caracal extends Felinos{
    //Atributos de clase
    public String latin;
    int tamanio_cola, peso;

    //Constructor
    public Caracal(String nombre_comun, String nombre_cientifico,
                 String latin,
                 int tamanio_cola,
                 int peso) {
        super(nombre_comun, nombre_cientifico);
        this.tamanio_cola = tamanio_cola;
        this.peso = peso;
    }

    //Metodos Setters y Getters
    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public int getTamanio_cola() {
        return tamanio_cola;
    }

    public void setTamanio_cola(int tamanio_cola) {
        this.tamanio_cola = tamanio_cola;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private void orejas(){
        System.out.println("La medida de sus orejas es 25 cm, incluyendo sus puntas ramificadas");
    }

    private void habitat(){
        System.out.println("Su habitat central es el continen Africano");
    }

    private void subespecies(){
        System.out.println("Existen un total de 8 subespecies de caracal.");
    }

    private void estado_conservacion(){
        System.out.println("Es un felino con bajo nivel de amenazas.");
    }

    public void imprimirDatos(){
        System.out.println("\nSu nombre en latin es: "+latin);
        System.out.println("El tamaño de su cola promedio es "+tamanio_cola);
        System.out.println("Su peso promedio es " + peso);
        orejas();
        habitat();
        subespecies();
        estado_conservacion();
    }

}

