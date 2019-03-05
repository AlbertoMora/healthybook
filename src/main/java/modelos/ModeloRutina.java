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
public class ModeloRutina {
    int id;
    String nombre;
    String descripcion;
    double duracion;
    String Url;
    String uriImagen;
    int idRango;

    public ModeloRutina() {
    }

    public ModeloRutina(String nombre, String descripcion, double duracion, String Url, String uriImagen, int idRango) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.duracion = duracion;
        this.Url = Url;
        this.uriImagen = uriImagen;
        this.idRango = idRango;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String Url) {
        this.Url = Url;
    }

    public String getUriImagen() {
        return uriImagen;
    }

    public void setUriImagen(String uriImagen) {
        this.uriImagen = uriImagen;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }
    
    
}
