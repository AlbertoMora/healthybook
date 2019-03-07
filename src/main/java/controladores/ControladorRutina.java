/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import libreriasExternas.DBManager;
import modelos.ModeloRutina;

/**
 *
 * @author Alberto Mora
 */
public class ControladorRutina {
    
    public ModeloRutina obtenerRutinaPorRango(int idRango) throws SQLException{
        ModeloRutina rutina = new ModeloRutina();
        DBManager db = new DBManager();
        ResultSet rawData = db.CallProcedureWResults("ObtenerRutina ?", new Object[]{idRango});
        while(rawData.next()){
            rutina.setId(rawData.getInt("id"));
            rutina.setNombre(rawData.getString("nombre"));
            rutina.setDescripcion(rawData.getString("descripcion"));
            rutina.setDuracion(rawData.getDouble("duracionSeg"));
            rutina.setUrl(rawData.getString("URL"));
            rutina.setUriImagen(rawData.getString("uriImagen"));
            rutina.setIdRango(idRango);
        }
        return rutina;
    }
}
