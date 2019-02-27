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
public class ModeloIMC {
    int id;
    int idUsuario;
    int idRango;
    double IMC;
    String categoria;
    String fecha;
    String nombreRutinaRec;
    String nombreDietaRec;

    public ModeloIMC() {
    }

    public ModeloIMC(int idUsuario, int idRango, double IMC, String fecha) {
        this.idUsuario = idUsuario;
        this.idRango = idRango;
        this.IMC = IMC;
        this.fecha = fecha;
    }
    
    public ModeloIMC(int id, int idUsuario, int idRango, double IMC, String categoria, String fecha, String nombreRutinaRec, String nombreDietaRec) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idRango = idRango;
        this.IMC = IMC;
        this.categoria = categoria;
        this.fecha = fecha;
        this.nombreRutinaRec = nombreRutinaRec;
        this.nombreDietaRec = nombreDietaRec;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRango() {
        return idRango;
    }

    public void setIdRango(int idRango) {
        this.idRango = idRango;
    }

    public double getIMC() {
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombreRutinaRec() {
        return nombreRutinaRec;
    }

    public void setNombreRutinaRec(String nombreRutinaRec) {
        this.nombreRutinaRec = nombreRutinaRec;
    }

    public String getNombreDietaRec() {
        return nombreDietaRec;
    }

    public void setNombreDietaRec(String nombreDietaRec) {
        this.nombreDietaRec = nombreDietaRec;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
