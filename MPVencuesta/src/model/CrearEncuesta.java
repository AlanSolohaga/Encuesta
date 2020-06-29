package model;

import interfaz.CrearEncuestaInterface;
import interfaz.PresentInterface;
import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class CrearEncuesta implements CrearEncuestaInterface{
    private PresentInterface presentador;
    Encuesta encuesta;
    ArrayList<String> array;
    
    public CrearEncuesta(PresentInterface presentador) {
        this.presentador = presentador;
    }


    @Override
    public void arrayPregunta(String pregunta) {
        if(array!=null){
            array.add(pregunta);
        }else{
            array=new ArrayList();
            array.add(pregunta);
        }
        
        for(int i=0;i<array.size();i++){
            System.out.println(""+i+" "+array.get(i));
        }
    }

    @Override
    public void agregarPreguntas(String imagen) {
        encuesta = new Encuesta(imagen,array);
        presentador.mostrarPregunta(""+encuesta.getPregunta().get(1));
        array.clear();
    }

    
}
