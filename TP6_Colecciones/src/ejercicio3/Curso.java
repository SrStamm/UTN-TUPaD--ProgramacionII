package ejercicio3;

public class Curso {
  private String codigo;
  private String nombre;
  private Profesor profesor;

  public Curso(String codigo, String nombre, Profesor profesor) {
    this.codigo = codigo;
    this.nombre = nombre;
    setProfesor(profesor);
  }

  public Curso(String codigo, String nombre) {
    this(codigo, nombre, null);
  }

  public String getCodigo() {
    return codigo;
  }

  public Profesor getProfesor() {
    return profesor;
  }

  public void setProfesor(Profesor p) {
    if (this.profesor == p)
      return; // Evita trabajo innecesario si es el mismo

    Profesor profeAnterior = this.profesor;
    this.profesor = p; // Se actualiza la referencia local PRIMERO

    if (profeAnterior != null) {
      profeAnterior.eliminarCurso(this);
    }

    if (p != null) {
      p.agregarCurso(this);
    }
  }

  public void mostrarInfo() {
    String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";

    System.out.println("----------------------------------------");
    System.out.println(" Codigo:  \"" + codigo + "\"");
    System.out.println(" Nombre:    " + nombre);
    System.out.println(" Profesor:    " + nombreProfesor);
    System.out.println("----------------------------------------");
  }
}
