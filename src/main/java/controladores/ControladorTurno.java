/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import libreriasExternas.DBManager;
import modelos.ModeloTurno;

/**
 *
 * @author Alberto Mora
 */
public class ControladorTurno {
    public ArrayList<ModeloTurno> obtenerTurnosDieta(int idDieta) throws SQLException{
        ArrayList<ModeloTurno> datos = new ArrayList();
        DBManager db = new DBManager();
        ResultSet rawData = db.CallProcedureWResults("ObtenerTurnosDieta ?", new Object[]{idDieta});
        while(rawData.next()){
            ModeloTurno nRow = new ModeloTurno(rawData.getInt("id"),rawData.getInt("idDieta"),rawData.getInt("orden"),rawData.getInt("cantHarinas"),rawData.getInt("cantVegetales"),
                                               rawData.getInt("cantLacteos"),rawData.getInt("cantCarne"), rawData.getInt("cantFrutas"),rawData.getInt("cantGrasas"));
            datos.add(nRow);
        }
        return datos;
    }
}
