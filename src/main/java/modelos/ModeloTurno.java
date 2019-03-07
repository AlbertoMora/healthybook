/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author Alberto Mora
 */
public class ModeloTurno {
    int id;
    int idDieta;
    int orden;
    int cHarinas;
    int cVegetales;
    int cLacteos;
    int cCarne;
    int cFrutas;
    int cGrasas;

    public ModeloTurno() {
    }

    public ModeloTurno(int id, int idDieta, int orden, int cHarinas, int cVegetales, int cLacteos, int cCarne, int cFrutas, int cGrasas) {
        this.id = id;
        this.idDieta = idDieta;
        this.orden = orden;
        this.cHarinas = cHarinas;
        this.cVegetales = cVegetales;
        this.cLacteos = cLacteos;
        this.cCarne = cCarne;
        this.cFrutas = cFrutas;
        this.cGrasas = cGrasas;
    }
    
    public ModeloTurno(int idDieta, int orden, int cHarinas, int cVegetales, int cLacteos, int cCarne, int cFrutas, int cGrasas) {
        this.idDieta = idDieta;
        this.orden = orden;
        this.cHarinas = cHarinas;
        this.cVegetales = cVegetales;
        this.cLacteos = cLacteos;
        this.cCarne = cCarne;
        this.cFrutas = cFrutas;
        this.cGrasas = cGrasas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(int idDieta) {
        this.idDieta = idDieta;
    }
    
    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getcHarinas() {
        return cHarinas;
    }

    public void setcHarinas(int cHarinas) {
        this.cHarinas = cHarinas;
    }

    public int getcVegetales() {
        return cVegetales;
    }

    public void setcVegetales(int cVegetales) {
        this.cVegetales = cVegetales;
    }

    public int getcLacteos() {
        return cLacteos;
    }

    public void setcLacteos(int cLacteos) {
        this.cLacteos = cLacteos;
    }

    public int getcCarne() {
        return cCarne;
    }

    public void setcCarne(int cCarne) {
        this.cCarne = cCarne;
    }

    public int getcFrutas() {
        return cFrutas;
    }

    public void setcFrutas(int cFrutas) {
        this.cFrutas = cFrutas;
    }

    public int getcGrasas() {
        return cGrasas;
    }

    public void setcGrasas(int cGrasas) {
        this.cGrasas = cGrasas;
    }
    
    
}
