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
        String query = String.format("RegistrarIMC %s,%s,%s,%s, '%s','%s'", imc.getIdUsuario(), imc.getIdDietaRec(), imc.getIdRutina(), imc.getIMC(), imc.getCategoria(), imc.getFecha());
        return db.CallProcedure(query);
    }

    public ArrayList<ModeloIMC> obtenerHistorialIMC(int idUsuario) throws SQLException {
        ArrayList<ModeloIMC> historial = new ArrayList<>();
        DBManager db = new DBManager();
        ResultSet datos = db.CallProcedureWResults(String.format("ObtenerListaIMC %s", idUsuario));
        while (datos.next()) {
            ModeloIMC nRow = new ModeloIMC();
            nRow.setId(datos.getInt("id"));
            nRow.setIdDietaRec(datos.getInt("idDietaRec"));
            nRow.setIdRutina(datos.getInt("idRutina"));
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
        String query = String.format("ActualizarIMC %s,%s,%s,%s,%s, '%s','%s'", imc.getId(), imc.getIdUsuario(), imc.getIdDietaRec(), imc.getIdRutina(), imc.getIMC(), imc.getCategoria(), imc.getFecha());
        return db.CallProcedure(query);
    }

    public boolean eliminarIMC(int id) {
        DBManager db = new DBManager();
        String query = String.format("EliminarRegistroIMC %s", id);
        return db.CallProcedure(query);
    }
}
