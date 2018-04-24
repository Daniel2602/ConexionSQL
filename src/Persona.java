import java.sql.*;
import conexion.Conexion;
import javax.swing.JOptionPane;
import org.omg.CORBA.ORB;

public class Persona extends PersonaAPP.PersonaPOA{
    
    private ORB orb;

    @Override
    public boolean insertarPersona(int id, int cedula, String nombre, String apellido, int telefono) {
        
        boolean resultado=false;
        try {
            String query = "insert into persona(id,cedula,nombre,apellido,telefono)" + "values ("+id+","+nombre+","+apellido+","+telefono+")";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"ocurrió un error" +e.getMessage());
        }
        return resultado;
    }

    @Override
    public String consultarPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarPersona(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean actualizarPersona(int id, int cedula, String nombre, String apellido, int telefono) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String listarPersona() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void shutdown() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
}
