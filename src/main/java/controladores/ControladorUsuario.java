/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelos.ModeloUsuario;
import libreriasExternas.DBManager;

/**
 *
 * @author Alberto Mora
 */
public class ControladorUsuario {

    public ModeloUsuario obtenerDatosSesion(String user, String password) throws SQLException {
        ResultSet data;
        ModeloUsuario usuario;
        DBManager db = new DBManager();
        String query = "LoginData ?,?";
        String params[] = {user, password};
        data = db.CallProcedureWResults(query, params);
        if (data.next()) {

            usuario = new ModeloUsuario(data.getInt("id"), data.getString("nombre"), data.getString("apellidos"), data.getString("nombreUsuario"), data.getString("email"),
                    data.getString("contrasena"), data.getString("telefono"), data.getBoolean("esAdmin"));
            return usuario;
        } else {
            throw new SQLException();
        }
    }

    public boolean registrarUsuario(ModeloUsuario usuario) {
        DBManager db = new DBManager();
        String query = "RegistrarUsuario ?,?,?,?,?,?,0";
        Object params[] = {usuario.getNombre(), usuario.getApellidos(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getContrasena(), usuario.getTelefono()};
        return db.CallProcedure(query, params);
    }

    public boolean eliminarUsuario(int id) {
        DBManager db = new DBManager();
        String query = "EliminarUsuario ?";
        return db.CallProcedure(query, new Object[]{id});
    }

    public boolean actualizarUsuario(ModeloUsuario usuario) {
        DBManager db = new DBManager();
        String query = "ActualizarUsuario ?,?,?,?,?,?,?,?";
        Object params[] = {usuario.getId(), usuario.getNombre(), usuario.getApellidos(), usuario.getNombreUsuario(), usuario.getEmail(), usuario.getContrasena(), usuario.getTelefono(), usuario.isEsAdmin()};
        return db.CallProcedure(query, params);
    }
}
