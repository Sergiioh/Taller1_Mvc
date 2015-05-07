/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Sergioh
 */
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Kevin Arnold
 */
public class main {
    public static void main(String[] args)
    {
        Connection miConexion;
        miConexion= conexion.GetConnection();
      
        if(miConexion!=null)
        {
            JOptionPane.showMessageDialog(null, "Conexión Realizada Correctamente");
        }
    }
}