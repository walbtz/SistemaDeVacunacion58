package SistemaDeVacunacion.Conexiones;

import SistemaDeVacunacion.Entidades.Laboratorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.mariadb.jdbc.Statement;

public class LaboratorioData {
    private Connection con=null;
    
    public LaboratorioData(){
        con=Conexion.getConexion();
    }
    public void guardarLaboratorio(Laboratorio laboratorio){
     
        String sql ="INSERT INTO laboratorio VALUES (?,?,?,?,?)";
        
        try{
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setLong(1, laboratorio.getCuit());
            ps.setString(2, laboratorio.getNombre());
            ps.setString(3, laboratorio.getPais());
            ps.setString(4, laboratorio.getDomicilio());
            ps.setLong(5, laboratorio.getStock()); 
                    
            ResultSet rs=ps.executeQuery();
            if(rs.next()) {
                JOptionPane.showMessageDialog(null, "Lab Created");
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cant create Lab");
        }
                
    }
    
   public void modificarStockLaboratorio(Laboratorio laboratorio){
       
       String sql = "UPDATE laboratorio SET stock=? WHERE cuit=?";
       
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getStock());
            ps.setLong(2, laboratorio.getCuit());
//ps.setString(1, String.valueOf(laboratorio.getStock()));
            //ps.setString(2, String.valueOf(laboratorio.getCuit()));
            System.out.println(laboratorio.getStock() +"actualizo");
            
            ps.executeUpdate();
            
            ps.close(); 
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cant mod Lab");
        }
}
   
   public void eliminarLaboratorio(Laboratorio laboratorio){
       
       String sql = "DELETE FROM laboratorio WHERE cuit = ?";
       try{
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setLong(1, laboratorio.getCuit());
            
            ps.executeUpdate();
            //ResultSet rs=ps.getGeneratedKeys();
            //if(rs.next()) {
            //    JOptionPane.showMessageDialog(null, "Lab deleted");
                
            //}
            
            ps.close(); 
       }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Cant del Lab");
        }
   }
   
}