package ejercicio3;

public class Main {
  public static void main(String[] args) {
    Universidad uni = new Universidad("Universidad Nacional");

    // 1. Crear al menos 3 profesores y 5 cursos
    Profesor prof1 = new Profesor("P01", "Alan Turing", "Ciencias de la Computación");
    Profesor prof2 = new Profesor("P02", "Ada Lovelace", "Algoritmos y Programación");
    Profesor prof3 = new Profesor("P03", "Grace Hopper", "Sistemas Operativos");

    Curso c1 = new Curso("C01", "Estructuras de Datos");
    Curso c2 = new Curso("C02", "Bases de Datos");
    Curso c3 = new Curso("C03", "Arquitectura de Computadoras");
    Curso c4 = new Curso("C04", "Redes de Información");
    Curso c5 = new Curso("C05", "Compiladores");

    // 2. Agregar profesores y cursos a la universidad
    uni.agregarProfesor(prof1);
    uni.agregarProfesor(prof2);
    uni.agregarProfesor(prof3);

    uni.agregarCurso(c1);
    uni.agregarCurso(c2);
    uni.agregarCurso(c3);
    uni.agregarCurso(c4);
    uni.agregarCurso(c5);

    // 3. Asignar profesores a cursos usando asignarProfesorACurso(...)
    uni.asignarProfesorACurso("C01", "P01"); // Turing -> Estructuras de Datos
    uni.asignarProfesorACurso("C02", "P01"); // Turing -> Bases de Datos
    uni.asignarProfesorACurso("C03", "P02"); // Lovelace -> Arquitectura
    uni.asignarProfesorACurso("C04", "P02"); // Lovelace -> Redes
    uni.asignarProfesorACurso("C05", "P03"); // Hopper -> Compiladores

    // 4. Listar cursos con su profesor y profesores con sus cursos
    System.out.println("=== 4. LISTADO DE CURSOS Y PROFESORES ===");
    System.out.println("\n--- LISTA DE CURSOS ---");
    uni.listarCursos();

    System.out.println("\n--- LISTA DE PROFESORES ---");
    uni.listarProfesores();

    System.out.println("\n--- CURSOS DEL PROFESOR P01 (Turing) ---");
    prof1.listarCursos();

    // 5. Cambiar el profesor de un curso y verificar sincronización bidireccional
    System.out.println("\n=== 5. CAMBIO DE PROFESOR EN CURSO C01 (Turing -> Lovelace) ===");
    uni.asignarProfesorACurso("C01", "P02");

    System.out.println("\nCursos de Turing (debería tener solo C02):");
    prof1.listarCursos();

    System.out.println("\nCursos de Lovelace (debería tener C03, C04 y C01):");
    prof2.listarCursos();

    // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor
    System.out.println("\n=== 6. ELIMINAR CURSO C02 (Bases de Datos) ===");
    uni.eliminarCurso("C02");

    System.out.println("\nCursos de Turing tras eliminar C02:");
    prof1.listarCursos();

    // 7. Remover un profesor y dejar profesor = null en sus cursos
    System.out.println("\n=== 7. ELIMINAR PROFESOR P02 (Lovelace) ===");
    uni.eliminarProfesor("P02");

    System.out.println("\nEstado del curso C01 tras eliminar a Lovelace:");
    c1.mostrarInfo();

    // 8. Mostrar un reporte: cantidad de cursos por profesor
    System.out.println("\n=== 8. REPORTE: CANTIDAD DE CURSOS POR PROFESOR ===");
    uni.listarProfesores();
  }
}
