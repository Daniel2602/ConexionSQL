package PersonaAPP;

/**
* PersonaAPP/PersonaHolder.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from Persona.idl
* lunes 23 de abril de 2018 07:32:59 PM COT
*/

public final class PersonaHolder implements org.omg.CORBA.portable.Streamable
{
  public PersonaAPP.Persona value = null;

  public PersonaHolder ()
  {
  }

  public PersonaHolder (PersonaAPP.Persona initialValue)
  {
    value = initialValue;
  }

  public void _read (org.omg.CORBA.portable.InputStream i)
  {
    value = PersonaAPP.PersonaHelper.read (i);
  }

  public void _write (org.omg.CORBA.portable.OutputStream o)
  {
    PersonaAPP.PersonaHelper.write (o, value);
  }

  public org.omg.CORBA.TypeCode _type ()
  {
    return PersonaAPP.PersonaHelper.type ();
  }

}