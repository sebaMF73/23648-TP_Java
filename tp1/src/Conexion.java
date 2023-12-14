
import java.sql.*;
import javax.swing.JOptionPane;

public class Conexion {
  Connection con;
    public Connection conectar(){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbjoes","root","root");
            //JOptionPane.showMessageDialog(null,"La conexión está ok");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString());
        };
       return con; 
        
    }
    public void cerrarConexion() throws SQLException{
        con.close();
    }
}
