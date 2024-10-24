public class DVD extends Material {
    private String director;
    private String genero;
    private double duracion;

    public DVD(int id, String titulo, String director, String genero, double duracion) {
        super(id, titulo);
        this.director = director;
        this.genero = genero;
        this.duracion = duracion;
    }
}
