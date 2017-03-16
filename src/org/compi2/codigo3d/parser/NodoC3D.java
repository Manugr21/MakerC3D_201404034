package org.compi2.codigo3d.parser;

import java.util.ArrayList;

/**
 * Clase sencilla para sintetizar información entre producciones. Cuenta con un
 * único atributo de tipo String, pero pueden agregársele los atributos que se
 * consideren necesarios.
 *
 * @author esvux
 */
public class NodoC3D {

    private String cad;
    private ArrayList<String> Etiquetas_Verdadero;
    private ArrayList<String> Etiquetas_Falso;

    public NodoC3D(String cad) {
        this.cad = cad;
        this.Etiquetas_Verdadero = new ArrayList<String>();
        this.Etiquetas_Falso = new ArrayList<String>();
    }

    public NodoC3D() {
        this.cad = "";
        this.Etiquetas_Verdadero = new ArrayList<String>();
        this.Etiquetas_Falso = new ArrayList<String>();
    }

    public NodoC3D(String cad, ArrayList<String> Etiquetas_Verdadero, ArrayList<String> Etiquetas_Falso) {
        this.cad = cad;
        this.Etiquetas_Verdadero = Etiquetas_Verdadero;
        this.Etiquetas_Falso = Etiquetas_Falso;
    }

    public String getCad() {
        return cad;
    }

    public void Añadir_Etiqueta_Verdadera(String Etiqueta) {
        this.getEtiquetas_Verdadero().add(Etiqueta);
    }

    public void Añadir_Etiquetas_Verdaderas(ArrayList<String> Etiquetas) {
        this.getEtiquetas_Verdadero().addAll(Etiquetas);
    }

    public String getEtiquetas_Verdaderas() {
        String temporal = "";
        for (String etiqueta : getEtiquetas_Verdadero()) {
            temporal += etiqueta + ",";
        }
        return temporal.substring(0, temporal.length() - 1);
    }

    public void Añadir_Etiqueta_Falsa(String Etiqueta) {
        this.getEtiquetas_Falso().add(Etiqueta);
    }

    public void Añadir_Etiquetas_Falsas(ArrayList<String> Etiquetas) {
        this.getEtiquetas_Falso().addAll(Etiquetas);
    }

    public String getEtiquetas_Falsas() {
        String temporal = "";
        for (String etiqueta : getEtiquetas_Falso()) {
            temporal += etiqueta + ",";
        }
        return temporal.substring(0, temporal.length() - 1);
    }

    /**
     * @return the Etiquetas_Verdadero
     */
    public ArrayList<String> getEtiquetas_Verdadero() {
        return Etiquetas_Verdadero;
    }

    /**
     * @param Etiquetas_Verdadero the Etiquetas_Verdadero to set
     */
    public void setEtiquetas_Verdadero(ArrayList<String> Etiquetas_Verdadero) {
        this.Etiquetas_Verdadero = Etiquetas_Verdadero;
    }

    /**
     * @return the Etiquetas_Falso
     */
    public ArrayList<String> getEtiquetas_Falso() {
        return Etiquetas_Falso;
    }

    /**
     * @param Etiquetas_Falso the Etiquetas_Falso to set
     */
    public void setEtiquetas_Falso(ArrayList<String> Etiquetas_Falso) {
        this.Etiquetas_Falso = Etiquetas_Falso;
    }

}
