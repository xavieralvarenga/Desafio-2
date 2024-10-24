public class Libro extends Material {
    private String autor;
    private int numPaginas;
    private String editorial;
    private String isbn;
    private int anoPublicacion;
    private int unidadesDisponibles;

    public Libro(int id, String titulo, String autor, int numPaginas, String editorial, String isbn, int anoPublicacion, int unidadesDisponibles) {
        super(id, titulo);
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.isbn = isbn;
        this.anoPublicacion = anoPublicacion;
        this.unidadesDisponibles = unidadesDisponibles;
    }
}
