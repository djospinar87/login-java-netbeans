/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionSQL {
  
    Connection conectar=null;
    

    public Connection conexion(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=(Connection) DriverManager.getConnection("jdbc:mysql://localhost/escuela","root","");
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Conexion Fallida" +e.getMessage()); 
            
        }
        return conectar;
    }
    
    
}
