public class CDAudio extends Material {
    private String artista;
    private String genero;
    private double duracion;
    private int numCanciones;
    private int unidadesDisponibles;

    public CDAudio(int id, String titulo, String artista, String genero, double duracion, int numCanciones, int unidadesDisponibles) {
        super(id, titulo);
        this.artista = artista;
        this.genero = genero;
        this.duracion = duracion;
        this.numCanciones = numCanciones;
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
