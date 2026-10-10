package excepciones;

public class DataAccessException extends RuntimeException {
  public DataAccessException(String mensaje) {
    super(mensaje);
  }
}
