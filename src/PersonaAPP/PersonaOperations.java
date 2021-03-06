package PersonaAPP;


/**
* PersonaAPP/PersonaOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* lunes 23 de abril de 2018 07:32:59 PM COT
*/

public interface PersonaOperations 
{
  boolean insertarPersona (int id, int cedula, String nombre, String apellido, int telefono);
  String consultarPersona (int id);
  boolean eliminarPersona (int id);
  boolean actualizarPersona (int id, int cedula, String nombre, String apellido, int telefono);
  String listarPersona ();
  void shutdown ();
} // interface PersonaOperations
