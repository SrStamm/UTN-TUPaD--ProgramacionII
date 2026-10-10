package model;

public class Categoria {
  private int id;
  private String nombre;
  private String descripcion;

  public Categoria(int id, String nombre, String descripcion) {
    this.id = id;
    this.nombre = nombre;
    this.descripcion = descripcion;
  }

  public Categoria(String nombre, String descripcion) {
    this(0, nombre, descripcion);
  }

  public Categoria(String nombre) {
    this(0, nombre, "");
  }

  @Override
  public String toString() {
    return "Categoria = {id= " + id + " nombre= " + nombre + " descripcion=" + descripcion + "}";
  }

  public String getNombre() {
    return nombre;
  }

  public String getDescripcion() {
    return descripcion;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

}
