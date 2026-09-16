package ejercicio3;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
  private String nombre;
  private List<Profesor> profesores;
  private List<Curso> cursos;

  public Universidad(String nombre) {
    this.nombre = nombre;
    this.profesores = new ArrayList<>();
    this.cursos = new ArrayList<>();
  }

  public void agregarProfesor(Profesor p) {
    if (p != null && !profesores.contains(p)) {
      profesores.add(p);
    }
  }

  public void agregarCurso(Curso c) {
    if (c != null && !cursos.contains(c)) {
      cursos.add(c);
    }
  }

  public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
    // Busca el profesor y se valida que se haya encontrado
    Profesor p = buscarProfesorPorId(idProfesor);
    if (p == null) {
      System.out.println("No se encontro el profesor");
      return;
    }

    // Busca el curso y se valida que se haya encontrado
    Curso c = buscarCursoPorCodigo(codigoCurso);
    if (c == null) {
      System.out.println("No se encontro el curso");
      return;
    }

    // Se setea el profesor en el curso
    c.setProfesor(p);
  }

  public void listarProfesores() {
    for (Profesor p : profesores) {
      p.mostrarInfo();
    }
  }

  public void listarCursos() {
    if (cursos.isEmpty()) {
      System.out.println("La lista de cursos esta vacío");
      return;
    }

    for (Curso c : cursos) {
      c.mostrarInfo();
    }
  }

  public Profesor buscarProfesorPorId(String id) {
    if (profesores.isEmpty()) {
      return null;
    }

    for (Profesor p : profesores) {
      if (p.getId().equals(id)) {
        return p;
      }
    }

    return null;
  }

  public Curso buscarCursoPorCodigo(String codigo) {
    if (cursos.isEmpty()) {
      return null;
    }

    for (Curso c : cursos) {
      if (c.getCodigo().equals(codigo)) {
        return c;
      }
    }

    return null;
  }

  // Romper la relación
  public void eliminarCurso(String codigo) {
    Curso c = buscarCursoPorCodigo(codigo);

    if (c == null) {
      System.out.println("No se encontro el curso");
      return;
    }

    // Desvincula al profesor del curso
    c.setProfesor(null);

    // Elimina el curso
    cursos.remove(c);
  }

  public void eliminarProfesor(String id) {
    Profesor p = buscarProfesorPorId(id);

    if (p == null) {
      System.out.println("No se encontro el profesor");
      return;
    }

    p.desvincularCursos();
    profesores.remove(p);
  }

}
