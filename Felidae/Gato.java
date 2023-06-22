package Felidae;

public class Gato extends Felinos{
    //Atributos de clase
    public String latin;
    int num_razas, edad_max;

    //Conatructor
    public Gato(String nombre_comun, String nombre_cientifico,
                String latin,
                int num_razas,
                int edad_max) {
        super(nombre_comun, nombre_cientifico);
        this.latin = latin;
        this.num_razas = num_razas;
        this.edad_max = edad_max;
    }

    //Metodos Setters y Getters
    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public int getNum_razas() {
        return num_razas;
    }

    public void setNum_razas(int num_razas) {
        this.num_razas = num_razas;
    }

    public int getEdad_max() {
        return edad_max;
    }

    public void setEdad_max(int edad_max) {
        this.edad_max = edad_max;
    }

    //Metodos de clase
    private String saltar(){
        System.out.println("Es un animal capaz de saltar");
        return null;
    }

    private String caza(){
        System.out.println("Son capaces de cazar");
        return null;
    }

    private String domestico(){
        System.out.println("Es un animal domestico");
        return null;
    }

    private String jugueton(){
        System.out.println("Son animales muy juguetones");
        return  null;
    }

    public void imprimirDatos(){
        System.out.println("\nSu nombre en latin es " + latin);
        System.out.println("Existe "+num_razas+" tipos de razas.");
        System.out.println("Su edad maxima es de "+edad_max+" años.");
        caza();
        domestico();
        saltar();
        jugueton();
    }
}
