/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Fernando
 */
public class ArchivosBD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, SQLException {
        // TODO code application logic here
        Planilla plan = new Planilla();
        Funciones fun = new Funciones();
        plan.setId_planilla(1);
        plan.setAnho(2022);
        plan.setMes("mes");
        plan.setId_planilla(1);
        //fun.guarda(plan);
        //fun.guardaArchivo(plan);
        fun.leer();
        //
        ArrayList<String> lista = new ArrayList<String>();
        try{
            PreparedStatement procedimiento = Conexion.getInstancia().getConexion().prepareCall("SELECT NOMBRE FROM TRABAJADOR B,PERSONA C WHERE c.cui = B.cui AND ESTADO='SUSPENDIDO'");
            ResultSet resultado = procedimiento.executeQuery();
            while(resultado.next()){
                //System.out.println("sss"+resultado.getInt("NOMBRE"));
                lista.add(resultado.getString("NOMBRE"));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        //PreparedStatement procedimiento = Conexion.getInstancia().getConexion().prepareCall("Select codigoCategoria,descripcion from Categorias  WHERE ESTADO<>0");
    }
    
}
