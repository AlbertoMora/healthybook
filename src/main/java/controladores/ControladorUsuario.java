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

    public ModeloUsuario getLoginData(String user, String password) throws SQLException {
        ResultSet data;
        ModeloUsuario usuario;
        DBManager db = new DBManager();
        String query = String.format("LoginData '%s','%s'", user, password);
        data = db.CallProcedureWResults(query);
        System.out.println("Obteniendo query: " + query);
        if (data.next()) {
            usuario = new ModeloUsuario(data.getInt("id"), data.getString("nombre"), data.getString("apellidos"), data.getString("nombreUsuario"), data.getString("email"),
                    data.getString("contrasena"), data.getString("telefono"), data.getBoolean("esAdmin"));
            return usuario;
        } else {
            throw new SQLException();
        }
    }

    public boolean RegistrarUsuario(ModeloUsuario usuario) {
        DBManager db = new DBManager();
        String query = String.format("RegistrarUsuario '%s','%s','%s','%s','%s','%s',0", usuario.getNombre(), usuario.getApellidos(), usuario.getNombreUsuario(), usuario.getEmail(),
                usuario.getContrasena(), usuario.getTelefono());
        return db.CallProcedure(query);
    }

    public boolean EliminarUsuario(int id) {
        DBManager db = new DBManager();
        String query = String.format("EliminarUsuario %s", id);
        return db.CallProcedure(query);
    }

    public boolean ActualizarUsuario(ModeloUsuario usuario) {
        DBManager db = new DBManager();
        String query = String.format("RegistrarUsuario %s,'%s','%s','%s','%s','%s','%s',0", usuario.getId(), usuario.getNombre(), usuario.getApellidos(), usuario.getNombreUsuario(), usuario.getEmail(),
                usuario.getContrasena(), usuario.getTelefono());
        return db.CallProcedure(query);
    }
}
