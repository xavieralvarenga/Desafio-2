public class Revista extends Material {
    private String editorial;
    private String periodicidad;
    private String fechaPublicacion;
    private int unidadesDisponibles;

    public Revista(int id, String titulo, String editorial, String periodicidad, String fechaPublicacion, int unidadesDisponibles) {
        super(id, titulo);
        this.editorial = editorial;
        this.periodicidad = periodicidad;
        this.fechaPublicacion = fechaPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
