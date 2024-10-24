public class Material {
    protected int id;
    protected String titulo;

    public Material(int id, String titulo) {
        this.id = id;
        this.titulo = titulo;
    }

    public int getCodigo() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}

