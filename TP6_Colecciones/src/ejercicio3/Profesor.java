package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Profesor {
  private String id;
  private String nombre;
  private String especialidad;
  private List<Curso> cursos;

  public Profesor(String id, String nombre, String especialidad) {
    this.id = id;
    this.nombre = nombre;
    this.especialidad = especialidad;
    this.cursos = new ArrayList<>();
  }

  public String getId() {
    return id;
  }

  public String getNombre() {
    return nombre;
  }

  public String getEspecialidad() {
    return especialidad;
  }

  public void agregarCurso(Curso c) {
    if (c != null && !cursos.contains(c)) {
      cursos.add(c);

      if (c.getProfesor() != this) {
        c.setProfesor(this);
      }
    }
  }

  public void eliminarCurso(Curso c) {
    if (c != null && cursos.contains(c)) {
      cursos.remove(c);
      if (c.getProfesor() == this) {
        c.setProfesor(null);
      }
    }
  }

  public void desvincularCursos() {
    // Se crea una copia para evitar error al remover mientras se itera
    List<Curso> cursosCopia = new ArrayList<>(this.cursos);
    for (Curso c : cursosCopia) {
      c.setProfesor(null);
    }
  }

  public void listarCursos() {
    if (cursos.isEmpty()) {
      System.out.println("La lista de cursos está vacía.");
      return;
    }

    for (Curso c : cursos) {
      c.mostrarInfo();
    }
  }

  public void mostrarInfo() {
    System.out.println("----------------------------------------");
    System.out.println(" ID:  \"" + id + "\"");
    System.out.println(" Nombre:    " + nombre);
    System.out.println(" Especialidad:    " + especialidad);
    System.out.println(" Cantidad de cursos:    " + cursos.size());
    System.out.println("----------------------------------------");
  }
}
