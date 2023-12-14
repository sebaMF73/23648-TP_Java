
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Usuario {
    int id;
    String nombre;
    String edad;
    String ciudad;
    
    public void insertarUsuario(String pNombre, String pEdad,String pCiudad){
        this.nombre=pNombre;
        this.edad=pEdad;
        this.ciudad=pCiudad;
    }
    public void llenarTabla(JTable pTablita){
        DefaultTableModel modelo=new DefaultTableModel(){
          @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }  
                    
                    
        };
        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Edad");
        modelo.addColumn("Ciudad");
        
        pTablita.setModel(modelo);
        Conexion conexion=new Conexion();
        
        Statement st;
        
        String[] datos=new String[4];
        
        try{        
           

            st=conexion.conectar().createStatement();
            ResultSet rs=st.executeQuery("select * from users;");
                
            while(rs.next()){
                
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);     
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                //JOptionPane.showMessageDialog(null,datos[0]);
                modelo.addRow(datos);
            }
            
            pTablita.setModel(modelo);
        }catch(Exception e){JOptionPane.showMessageDialog(null,"Error: "+e.toString());}
    }
    
       public void seleccionar(JTable pTablita,JTextField pID,JTextField pNombre,JTextField pEdad,JTextField pCiudad){
           int fila=pTablita.getSelectedRow();
           
          // if (fila>=0){
               pID.setText(pTablita.getValueAt(fila,0).toString());
               pNombre.setText(pTablita.getValueAt(fila,1).toString());
               pEdad.setText(pTablita.getValueAt(fila,2).toString());
               pCiudad.setText(pTablita.getValueAt(fila,3).toString());
           //}
           
        }
    
    public void CrearXML() throws IOException {
        Conexion con=new Conexion();
        Statement st;
        ResultSet rs;
        String filePath;
        String linea;
        //filePath="C:\\cursos\\codo a codo\\fullstack java\\java\\tp1\\oradores.xml";
        filePath="C:\\Program Files\\Apache Software Foundation\\Tomcat 9.0\\webapps\\ROOT\\sebas\\oradores.xml";
        Path path=Paths.get(filePath);
        Files.delete(path);
        
        try{
            st=con.conectar().createStatement();
            rs=st.executeQuery("select * from users");
        
            
            linea="<oradores>";
            FileWriter pl=new FileWriter(filePath,true);
            pl.write(linea);
            pl.close();
            while (rs.next()){
                linea="<orador>";
                linea=linea+"<ID>";
                linea=linea+rs.getString("ID");
                linea=linea+"</ID>";
                linea=linea+"<nombre>";
                linea=linea+rs.getString("nombre");
                linea=linea+"</nombre>";
                linea=linea+"<edad>";
                linea=linea+rs.getString("edad");
                linea=linea+"</edad>";
                linea=linea+"<ciudad>";
                linea=linea+rs.getString("ciudad");
                linea=linea+"</ciudad>";               
                //linea=linea+rs.getString("ID")+","+rs.getString("nombre")+","+rs.getString("edad")+","+rs.getString("ciudad");
                linea=linea+"</orador>";
                FileWriter fw=new FileWriter(filePath,true);
                fw.write(linea);
                fw.close();
            }
            linea="</oradores>";
            FileWriter ul=new FileWriter(filePath,true);
            ul.write(linea);
            ul.close();
 
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error: "+e.toString());
         }
    
            
    }   
       
       
}
