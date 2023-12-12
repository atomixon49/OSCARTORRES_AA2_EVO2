/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Fernando
 */
public class Conexion {
    private Connection conexion;
    private Statement sentencia;
    private static Conexion instancia;
    
    public Conexion(){
        try{
             Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/oraclefernando","planilla","guatemala");
        }catch(ClassNotFoundException e){
            e.printStackTrace();
        }catch(InstantiationException e){
            e.printStackTrace();
        }catch(IllegalAccessException e){
            e.printStackTrace();
        }catch(SQLException e){
            e.printStackTrace();
        }
        
        
    }
    
    public static Conexion getInstancia(){
        if(instancia==null){
            instancia = new Conexion();
        }
        return instancia;
    } 

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
}
