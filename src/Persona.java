import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;


public class Persona extends PersonaAPP.PersonaPOA{
    
    private ORB orb;
    Conexion conex = new Conexion();

    @Override
    public boolean insertarPersona(int id, int cedula, String nombre, String apellido, int telefono) {
        
        boolean resultado=false;
        try {
            String query = "insert into persona(id,cedula,nombre,apellido,telefono)" + "values ('"+id+"','"+cedula+"','"+nombre+"','"+apellido+"','"+telefono+"')";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if (valor > 0) {
                resultado = true;
                JOptionPane.showMessageDialog(null, "Datos insertados");
            }
            //cerramos los recursos.
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrió un error" +e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int id) {
        String resultado = "";
        try {
            String query = "Select * from persona WHERE id ="+ id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                resultado += rs.getLong(2) + " - " 
                            + rs.getString(3) + " - " 
                            + rs.getString(4) + " - " 
                            + rs.getLong(5) + "\n" ;
            }
            //cerramos los recursos.
            st.close();
            rs.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error" +e.getMessage());
        }
        return resultado;
    }

    @Override
    public boolean eliminarPersona(int id) {
        
        boolean resultado=false;
        try {
            String query = "Delete from persona WHERE id ="+ id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if (valor > 0) {
                resultado = true;
            }
            //cerramos los recursos.
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrió un error" +e.getMessage());
        }
        return resultado;      
        
    }

    @Override
    public boolean actualizarPersona(int id, int cedula, String nombre, String apellido, int telefono) {
         boolean resultado=false;
        try {
            String query = "update persona set cedula = '"+cedula+"',nombre ='"+nombre+"',apellido = '"+apellido+"',telefono = '"+telefono+"' where id = "+id;
            conex.conexion();
            Statement st = conex.conex.createStatement();
            int valor = st.executeUpdate(query);
            if (valor > 0) {
                resultado = true;
            }
            //cerramos los recursos.
            st.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrió un error" +e.getMessage());
        }
        return resultado;
    }

    @Override
    public String listarPersona() {
        String resultado = "";
        try {
            String query = "Select * from persona";    
            conex.conexion();
            Statement st = conex.conex.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                resultado += rs.getLong(2) + " - " 
                            + rs.getString(3) + " - " 
                            + rs.getString(4) + " - " 
                            + rs.getLong(5) + "\n" ;
            }
            //cerramos los recursos.
            st.close();
            rs.close();
            conex.conex.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error" +e.getMessage());
        }
        
        return resultado;
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public ResultSet listaEstados(){
        ResultSet resultado = null;
          try {
            String query = "Select id, nombre from estado";
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error"+ e.getMessage());
        }
           
        return resultado;
    }
        public ResultSet cargarTablaPersona() {
        ResultSet resultado = null;
        try {
            String query = "Select id, nombre, apellido from persona";    
            conex.conexion();
            Statement st = conex.conex.createStatement();
            resultado = st.executeQuery(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrió un error" +e.getMessage());
        }
        
        return resultado;
    }
         
}
