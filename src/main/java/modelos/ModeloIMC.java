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
    int idDietaRec;
    int idRutina;
    double IMC;
    String categoria;
    String fecha;
    String nombreRutinaRec;
    String nombreDietaRec;

    public ModeloIMC() {
    }

    public ModeloIMC(int id, int idUsuario, int idDietaRec, int idRutina, double IMC, String fecha, String nombreRutinaRec, String nombreDietaRec, String categoria) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idDietaRec = idDietaRec;
        this.idRutina = idRutina;
        this.IMC = IMC;
        this.categoria = categoria;
        this.fecha = fecha;
        this.nombreRutinaRec = nombreRutinaRec;
        this.nombreDietaRec = nombreDietaRec;
    }
    
    public ModeloIMC(int id, int idUsuario, int idDietaRec, int idRutina, double IMC, String fecha, String categoria) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idDietaRec = idDietaRec;
        this.idRutina = idRutina;
        this.IMC = IMC;
        this.categoria = categoria;
        this.fecha = fecha;
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

    public int getIdDietaRec() {
        return idDietaRec;
    }

    public void setIdDietaRec(int idDietaRec) {
        this.idDietaRec = idDietaRec;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public void setIdRutina(int idRutina) {
        this.idRutina = idRutina;
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
