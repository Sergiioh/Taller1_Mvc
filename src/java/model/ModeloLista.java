/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ModeloLista {

    private int id;
    private String lista;
    private boolean borrado;
    private boolean ingreso;
    private String canciones;

    public int getId() {
        return this.id;
    }

    public void setId(int num) {
        this.id = num;
    }

    public String getLista() {
        return lista;
    }

    public boolean isBorrado() {
        return borrado;
    }

    public void setBorrado(boolean borrado) {
        this.borrado = borrado;
    }

    public String getCanciones() {
        return canciones;
    }

    public void setCanciones(String canciones) {
        this.canciones = canciones;
    }

    public boolean isIngreso() {
        return ingreso;
    }

    public void setIngreso(boolean estado) {
        this.ingreso = estado;
    }

    public void setLista(String name) {
        this.lista = name;
    }

    public void Eliminarlista() {
        Connection con1 = conexion.GetConnection();
        Statement st;
        try {
            st = (Statement) con1.createStatement();
            st.executeUpdate("DELETE FROM listausuario WHERE nomLista= '" + lista + "'");
            this.borrado = true;
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error2" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            this.borrado = false;
        }
    }

    public void CrearLista() {

        Connection con1 = conexion.GetConnection();
        Statement st;
        try {
            st = (Statement) con1.createStatement();
            st.executeUpdate("INSERT INTO listausuario VALUES('" + id + "','" + lista + "')");
            this.ingreso = true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e, "Error2" + e.getMessage(), JOptionPane.ERROR_MESSAGE);
            this.ingreso = false;
        }

    }

    public String MostrarMusica() {
        Connection con1 = conexion.GetConnection();
        Statement st;
        ResultSet rs;
        String rf = "";
        try {
            st = (Statement) con1.createStatement();
            rs = st.executeQuery("select * from listareproduccion ");
            while (rs.next()) {
                rf += rs.getString("nombre") + "," + rs.getString("cantante") + "\n";
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex, "Error2" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            this.borrado = false;
        }
        return rf;
    }
}

