package interfaz;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public interface PresentInterface {
    void arrayPregunta(String pregunta);
    void agregarPreguntas(String imagen);
    void mostrarPregunta(String pregunta);
    
    void buscarImagen(File archivo);
    void mostrarImagen(byte[] imagen);

}
