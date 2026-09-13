package Ejercicio9;

public class CitaMédica {
  private String fecha;
  private String hora;
  private Profesional profesional;
  private Paciente paciente;

  public CitaMédica(String fecha, String hora) {
    this.fecha = fecha;
    this.hora = hora;
  }

  public String getFecha() {
    return fecha;
  }

  public String getHora() {
    return hora;
  }

  public Profesional getProfesional() {
    return profesional;
  }

  public void setProfesional(Profesional profesional) {
    this.profesional = profesional;
  }

  public void setPaciente(Paciente paciente) {
    this.paciente = paciente;
  }

  public Paciente getPaciente() {
    return paciente;
  }

}
