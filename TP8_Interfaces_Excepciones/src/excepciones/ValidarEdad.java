package excepciones;

public class ValidarEdad {
  public void validar(int edad) throws EdadInvalidaException {
    if (edad < 0)
      throw new EdadInvalidaException("Error: no se puede tener una edad menor a 0");

    if (edad > 120)
      throw new EdadInvalidaException("Error: no se puede tener una edad mayor a 120");
  }

}
