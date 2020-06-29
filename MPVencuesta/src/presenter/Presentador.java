package presenter;

import interfaz.BuscarImagenInterface;
import interfaz.CrearEncuestaInterface;
import interfaz.PresentInterface;
import interfaz.VistaInterface;
import java.io.File;
import model.BuscarImagen;
import model.CrearEncuesta;

/**
 *
 * @author Alan
 */
public class Presentador implements PresentInterface{
    private CrearEncuestaInterface crearEncuesta;
    private VistaInterface vista;
    private BuscarImagenInterface buscarImagen;

    public Presentador(VistaInterface vista) {
        this.vista = vista;
        this.crearEncuesta = new CrearEncuesta(this);
        this.buscarImagen = new BuscarImagen(this);
    }
    
    @Override
    public void mostrarPregunta(String pregunta) {
        if(vista!=null){
            vista.mostrarPregunta(pregunta);
        }
    }


    @Override
    public void arrayPregunta(String pregunta) {
        if(vista!=null){
            crearEncuesta.arrayPregunta(pregunta);
        }
    }

    @Override
    public void agregarPreguntas(String imagen) {
        if(vista!=null){
            crearEncuesta.agregarPreguntas(imagen);
        }
    }

    @Override
    public void buscarImagen(File archivo) {
        if(vista!=null){
            buscarImagen.buscarImagen(archivo);
        }
    }

    @Override
    public void mostrarImagen(byte[] imagen) {
        if(vista!=null){
            vista.mostrarImagen(imagen);
        }
    }

}
