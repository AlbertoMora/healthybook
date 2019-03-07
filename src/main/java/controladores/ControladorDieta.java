/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import libreriasExternas.DBManager;
import modelos.ModeloDieta;

/**
 *
 * @author Alberto Mora
 */
public class ControladorDieta {
    
    public ModeloDieta obtenerDietaPorRango(int idRango) throws SQLException{
        ModeloDieta dieta = new ModeloDieta();
        DBManager db = new DBManager();
        ResultSet rawData = db.CallProcedureWResults("ObtenerDieta ?", new Object[]{idRango});
        while(rawData.next()){
            dieta.setId(rawData.getInt("id"));
            dieta.setNombre(rawData.getString("nombre"));
            dieta.setDescripcion(rawData.getString("descripcion"));
            dieta.setUriImagen(rawData.getString("uriImagen"));
            dieta.setCaloriasRed(rawData.getInt("caloriasRec"));
            dieta.setIdRango(idRango);
        }
        return dieta;
    }
}
