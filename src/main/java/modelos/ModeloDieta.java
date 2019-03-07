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
public class ModeloDieta {
    int id;
    String nombre;
    String descripcion;
    String uriImagen;
    int caloriasRed;
    int idRango;

    public ModeloDieta() {
    }

    public ModeloDieta(String nombre, String descripcion, String uriImagen, int caloriasRed, int idRango) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.uriImagen = uriImagen;
        this.caloriasRed = caloriasRed;
        this.idRango = idRango;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUriImagen() {
        return uriImagen;
    }

    public void setUriImagen(String uriImagen) {
        this.uriImagen = uriImagen;
    }

    public int getCaloriasRed() {
        return caloriasRed;
    }

    public void setCaloriasRed(int caloriasRed) {
        this.caloriasRed = caloriasRed;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    
}
