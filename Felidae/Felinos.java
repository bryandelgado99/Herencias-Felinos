package Felidae;

public class Felinos {

    //Atributos
    public String nombre_comun;
    public String nombre_cientifico;

    //Constructores

    public Felinos(String nombre_comun, String nombre_cientifico) {
        this.nombre_comun = nombre_comun;
        this.nombre_cientifico = nombre_cientifico;
    }

    //Métodos
    public String getNombre_comun() {
        return nombre_comun;
    }

    public void setNombre_comun(String nombre_comun) {
        this.nombre_comun = nombre_comun;
    }

    public String getNombre_cientifico() {
        return nombre_cientifico;
    }

    public void setNombre_cientifico(String nombre_cientifico) {
        this.nombre_cientifico = nombre_cientifico;
    }

    private String carnivoro(){
        System.out.println("Son animales carnivoros");
        return null;
    }

    private String herviboro(){
        System.out.println("Son animales herbivoros");
        return null;
    }

    private String ubicacion(){
        System.out.println("Se distribuyen por todo el planeta");
        return null;
    }

    private String extinto(){
        System.out.println("Sn animales que no se encuentran extintos");
        return null;
    }

    public void imprimir_Datos(){
        System.out.println("\nEl nombre comun del felino es: " + nombre_comun);
        System.out.println("El nombre cientifico del felino es: " + nombre_cientifico);
    }
}
