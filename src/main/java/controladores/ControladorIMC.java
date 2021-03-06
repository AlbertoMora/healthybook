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
import modelos.ModeloIMC;

/**
 *
 * @author Alberto Mora
 */
public class ControladorIMC {

    public boolean registrarIMC(ModeloIMC imc) {
        DBManager db = new DBManager();
        String query = "RegistrarIMC ?,?,?,?";
        Object params[]={imc.getIdUsuario(), imc.getIdRango(), imc.getIMC(), imc.getFecha()};
        return db.CallProcedure(query, params);
    }

    public ArrayList<ModeloIMC> obtenerHistorialIMC(int idUsuario) throws SQLException {
        ArrayList<ModeloIMC> historial = new ArrayList<>();
        DBManager db = new DBManager();
        ResultSet datos = db.CallProcedureWResults("ObtenerListaIMC ?", new Object[]{idUsuario});
        while (datos.next()) {
            ModeloIMC nRow = new ModeloIMC();
            nRow.setId(datos.getInt("id"));
            nRow.setIdRango(datos.getInt("idRango"));
            nRow.setIMC(datos.getDouble("IMC"));
            nRow.setCategoria(datos.getString("categoria"));
            nRow.setFecha(datos.getString("fecha"));
            nRow.setNombreDietaRec("nombreDieta");
            nRow.setNombreRutinaRec("nombreRutina");
            historial.add(nRow);
        }
        return historial;
    }

    public boolean actualizarIMC(ModeloIMC imc) {
        DBManager db = new DBManager();
        String query = "ActualizarIMC ?,?,?,?,?";
        Object params[] = {imc.getId(), imc.getIdUsuario(), imc.getIdRango(), imc.getIMC(), imc.getFecha()};
        return db.CallProcedure(query, params);
    }

    public boolean eliminarIMC(int id) {
        DBManager db = new DBManager();
        return db.CallProcedure("EliminarRegistroIMC ?", new Object[]{id});
    }
}
