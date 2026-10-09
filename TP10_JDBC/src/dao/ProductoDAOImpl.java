package dao;

import config.DatabaseConnection;
import dao.ProductoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Producto;

public class ProductoDAOImpl implements ProductoDAO {
  @Override
  public Producto crear(Producto p) {
    String sql = "INSERT INTO productos (nombre, descripcion, precio, cantidad, id_categoria) VALUES (?, ?, ?, ?, ?)";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

      stmt.setString(1, p.getNombre());
      stmt.setString(2, p.getDescripcion());
      stmt.setDouble(3, p.getPrecio());
      stmt.setInt(4, p.getCantidad());
      stmt.setInt(5, p.getId_categoria());
      stmt.executeUpdate();

      try (ResultSet rs = stmt.getGeneratedKeys()) {
        if (rs.next()) {
          p.setId(rs.getInt(1));
        }
      }

      return p;
    } catch (

    Exception e) {
      System.err.println("Error al persistir un nuevo producto: " + e.getMessage());
    }

    return null;
  }

  @Override
  public Producto leer(int id) {
    String sql = "SELECT * FROM productos WHERE id = ?";

    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      stmt.setInt(1, id);

      try (ResultSet rs = stmt.executeQuery()) {
        if (rs.next()) {
          String nombre = rs.getString("nombre");
          String descripcion = rs.getString("descripcion");
          double precio = rs.getDouble("precio");
          int cantidad = rs.getInt("cantidad");
          int id_categoria = rs.getInt("id_categoria");

          return new Producto(id, nombre, descripcion, precio, cantidad, id_categoria);
        }
      }
    } catch (Exception e) {
      System.err.println("Error al obtener producto de ID=" + id + " : " + e.getMessage());
    }
    return null;
  }

  @Override
  public boolean actualizar(Producto p) {
    // SQL para insertar los datos
    String sql = "UPDATE productos SET nombre = ?,  descripcion = ?, precio = ?, cantidad = ?, id_categoria = ? WHERE id = ?";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {
      stmt.setString(1, p.getNombre());
      stmt.setString(2, p.getDescripcion());
      stmt.setDouble(3, p.getPrecio());
      stmt.setInt(4, p.getCantidad());
      stmt.setInt(5, p.getId_categoria());
      stmt.setInt(6, p.getId());
      int filasAfectadas = stmt.executeUpdate();

      return filasAfectadas > 0;
    } catch (

    Exception e) {
      System.err.println("Error al actualizar el producto con ID=" + p.getId() + ": " + e.getMessage());
    }

    return false;
  }

  @Override
  public boolean eliminar(int id) {
    String sql = "Delete FROM productos WHERE id = ?";

    try (
        Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      stmt.setInt(1, id);
      int filasAfectadas = stmt.executeUpdate();

      return filasAfectadas > 0;
    } catch (

    Exception e) {
      System.err.println("Error al eliminar el producto con ID=" + id + ": " + e.getMessage());
    }

    return false;
  }

  @Override
  public List<Producto> listar() {
    List<Producto> arrayProducto = new ArrayList<>();
    String sql = "SELECT * FROM productos";

    try (Connection conn = DatabaseConnection.getConnection();
        PreparedStatement stmt = conn.prepareStatement(sql)) {

      try (ResultSet rs = stmt.executeQuery()) {

        while (rs.next()) {
          int id = rs.getInt("id");
          String nombre = rs.getString("nombre");
          String descripcion = rs.getString("descripcion");
          double precio = rs.getDouble("precio");
          int cantidad = rs.getInt("cantidad");
          int id_categoria = rs.getInt("id_categoria");

          arrayProducto.add(new Producto(id, nombre, descripcion, precio, cantidad, id_categoria));
        }

        return arrayProducto;

      }
    } catch (Exception e) {
      System.err.println("Error al obtener las productos: " + e.getMessage());
    }

    return arrayProducto;
  }

  @Override
  public boolean existeNombre(String nombre) {
    String sql = "SELECT COUNT(*) FROM productos WHERE nombre = ?";

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
