package dao;

import config.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;

public class CategoriaDAOImpl
    implements CategoriaDAO {

  @Override
  public Categoria crear(Categoria c) {
    // SQL para insertar los datos
    String sql = "INSERT INTO categoria (nombre, descripcion) VALUES (?, ?)";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
      // Crea el stmt e inserta los datos de forma segura
      // RETURN_GENERATED_KEYS para que devuelva el id
      stmt.setString(1, c.getNombre());
      stmt.setString(2, c.getDescripcion());
      stmt.executeUpdate();

      // Obtiene las keys generadas y las inserta en Categoria
      try (ResultSet rs = stmt.getGeneratedKeys()) {
        if (rs.next()) {
          c.setId(rs.getInt(1));
        }
      }

      return c;
    } catch (

    Exception e) {
      System.err.println("Error al persistir una nueva categoria: " + e.getMessage());
    }

    return null;
  }

  @Override
  public Categoria leer(int id) {
    String sql = "SELECT * FROM categoria WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      stmt.setInt(1, id);

      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          String nombre = rs.getString("nombre");
          String descripcion = rs.getString("descripcion");

          return new Categoria(id, nombre, descripcion);
        }
      }
    } catch (Exception e) {
      System.err.println("Error al obtener categoria de ID=" + id + " : " + e.getMessage());
    }
    return null;
  }

  @Override
  public boolean actualizar(Categoria c) {
    // SQL para insertar los datos
    String sql = "UPDATE categoria SET nombre = ?,  descripcion = ? WHERE id = ?";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, c.getNombre());
      stmt.setString(2, c.getDescripcion());
      stmt.setInt(3, c.getId());
      int filasAfectadas = stmt.executeUpdate();

      return filasAfectadas > 0;
    } catch (

    Exception e) {
      System.err.println("Error al actualizar la categoria con ID=" + c.getId() + ": " + e.getMessage());
    }

    return false;
  }

  @Override
  public boolean eliminar(int id) {
    String sql = "Delete FROM categoria WHERE id = ?";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      stmt.setInt(1, id);
      int filasAfectadas = stmt.executeUpdate();

      return filasAfectadas > 0;
    } catch (

    Exception e) {
      System.err.println("Error al eliminar la categoria con ID=" + id + ": " + e.getMessage());
    }

    return false;
  }

  @Override
  public List<Categoria> listar() {
    List<Categoria> arrayCategoria = new ArrayList<>();
    String sql = "SELECT * FROM categoria";

    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      try (ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {

          String nombre = rs.getString("nombre");
          String descripcion = rs.getString("descripcion");
          int id = rs.getInt("id");

          arrayCategoria.add(new Categoria(id, nombre, descripcion));
        }
        return arrayCategoria;

      }
    } catch (Exception e) {
      System.err.println("Error al obtener las categorias: " + e.getMessage());
    }

    return arrayCategoria;

  }

  @Override
  public boolean existeNombre(String nombre) {
    String sql = "SELECT COUNT(*) FROM categoria WHERE nombre = ?";

    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      stmt.setString(1, nombre);

      try (ResultSet rs = stmt.executeQuery()) {
        // COUNT(*) siempre devuelve una fila: hay que leer el valor,
        // rs.next() solo confirma que hay fila (siempre true).
        if (rs.next()) {
          return rs.getInt(1) > 0;
        }
        return false;
      }
    } catch (Exception e) {
      System.err.println("Error al verificar si existe el nombre '" + nombre + "': " + e.getMessage());
    }

    return false;
  }
}
