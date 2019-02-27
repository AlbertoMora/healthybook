/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import libreriasExternas.DBManager;
import modelos.ModeloRango;

/**
 *
 * @author Alberto Mora
 */
public class ControladorRango {
    public ModeloRango obtenerIdRango(double imc) throws SQLException{
        DBManager db = new DBManager();
        String query = String.format("ObtenerRango %s", imc);
        ResultSet data = db.CallProcedureWResults(query);
        ModeloRango datos = new ModeloRango();
        while(data.next()){
            datos.setId(data.getInt("id"));
            datos.setCategoria(data.getString("categoria"));
        }
        return datos;
    }
}
