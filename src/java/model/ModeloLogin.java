package model;

import com.mysql.jdbc.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class ModeloLogin {

    private String name, password;
    private String id = "0";
    private boolean estado = false;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void ValidarLogin() {

        Connection con1 = conexion.GetConnection();
        Statement st;
        ResultSet rt;
        try {
            st = (Statement) con1.createStatement();
            rt = st.executeQuery("select * from usuario");
            while (rt.next()) {
                if (this.estado != true) {
                    this.estado = this.validate(rt.getString("user"), rt.getString("pass"));
                    this.id = rt.getString("id");
                    System.out.println("3");
                    
                } else {
                    this.id = "0";
                    break;
                }
            }    
            }catch(Exception ex)
            {
             JOptionPane.showMessageDialog(null, ex, "Error2  "+ex.getMessage(), JOptionPane.ERROR_MESSAGE);

            }

        }
        public Boolean validate(String nombre, String password){
			if(name.equals(nombre) && this.password.equals(password)){ 
				return true;
                                
			}
			else{
				
				return false;
			}
    }
}

