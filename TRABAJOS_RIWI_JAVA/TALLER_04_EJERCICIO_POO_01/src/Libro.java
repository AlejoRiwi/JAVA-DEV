public class Libro {
    // Encapsulamiento
    private String titulo;
    private String autor;
    private String publicacion;
    private boolean prestado;


    // Constructor
public Libro () {

}

    public Libro(String titulo, String autor, String publicacion, boolean prestado) {
        this.titulo = titulo;
        this.autor = autor;
        this.publicacion = publicacion;
        this.prestado = prestado;
    }

    // Metodos Get Para obtener informacion privada o protegida de una clase
    public String getTitulo(){
        return this.titulo;
    }

    public String getAutor(){
        return this.autor;
    }
    public String getPublicacion(){
        return this.publicacion;
    }

    public boolean getPrestado(){
        return this.prestado;
    }

    // Metodos Set para ingresar informacion privada o protegida de una clase


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void cambiarEstado(){
    this.prestado = !this.prestado;
        System.out.println("El estado del libro actualizado correctamente ");
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", publicacion='" + publicacion + '\'' +
                ", prestado=" + prestado +
                '}';
    }
}
