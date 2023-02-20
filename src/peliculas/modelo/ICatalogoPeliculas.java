
package peliculas.modelo;

public interface ICatalogoPeliculas {
    void insertarPeliculas(Pelicula nombrePelicula);
    void listarPeliculas();
    void buscarPelicula(String nombrePelicula);
}
