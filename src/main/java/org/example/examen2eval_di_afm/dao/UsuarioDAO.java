package org.example.examen2eval_di_afm.dao;

import org.example.examen2eval_di_afm.database.DatabaseConnection;
import org.example.examen2eval_di_afm.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    public Usuario validarUsuario(String username, String password){
        String sql = "Select * from usuarios where username = ? and password = ?";
        try(Connection connection = DatabaseConnection.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql)){
            ps.setString(1,username);
            ps.setString(2,password);
            try(ResultSet rs = ps.executeQuery()){
                if (rs.next()){
                    return new Usuario(
                            rs.getString("username"),
                            rs.getString("password"),
                            rs.getBoolean("admin")
                    );
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public boolean registrarUsuario(String username, String password, boolean admin){
        String checkSql = "Select count(*) from usuarios where username = ?";
        String sql = "Insert into usuarios(username,password,admin) values(?,?,?)";
        try(Connection connection = DatabaseConnection.getConnection()) {
            try(PreparedStatement ps = connection.prepareStatement(checkSql)){
                ps.setString(1,username);
                try(ResultSet rs = ps.executeQuery()){
                    if (rs.next() && rs.getInt(1) > 0 ){
                        return false;
                    }
                }

            }
            try(PreparedStatement psInsert = connection.prepareStatement(sql)){
                psInsert.setString(1,username);
                psInsert.setString(2,password);
                psInsert.setBoolean(3,admin);
                psInsert.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
