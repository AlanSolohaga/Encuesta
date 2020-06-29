package model;

import java.util.ArrayList;

/**
 *
 * @author Alan
 */
public class Encuesta {
    //private byte[] imagen;
    private String imagen;
    private ArrayList<String> pregunta;

    public Encuesta(String imagen, ArrayList<String> pregunta) {
        this.imagen = imagen;
        this.pregunta = pregunta;
    }

    public ArrayList<String> getPregunta() {
        return pregunta;
    }

    public void setPregunta(ArrayList<String> pregunta) {
        this.pregunta = pregunta;
    }


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

}
