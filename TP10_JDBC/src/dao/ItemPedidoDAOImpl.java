package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import config.DatabaseConnection;
import model.ItemPedido;
import excepciones.DataAccessException;

public class ItemPedidoDAOImpl implements ItemPedidoDAO {
  @Override
  public ItemPedido crear(ItemPedido i) {
    try (Connection conn = DatabaseConnection.getConnection()) {
      return crear(i, conn);
    } catch (SQLException e) {
      throw new DataAccessException("Error de conexión al intentar crear el Item del Pedido", e);
    }
  }

  public ItemPedido crear(ItemPedido i, Connection c) {
    String sql = "INSERT INTO items_pedido (pedido_id, producto_id, cantidad, subtotal ) VALUES (?, ?, ?, ?)";
    try (
        PreparedStatement stmt = c.prepareStatement(
            sql,
            Statement.RETURN_GENERATED_KEYS)) {

      stmt.setInt(1, i.getPedidoId());
      stmt.setInt(2, i.getProductoId());
      stmt.setInt(3, i.getCantidad());
      stmt.setDouble(4, i.getSubtotal());
      stmt.executeUpdate();

      try (ResultSet rs = stmt.getGeneratedKeys()) {
        if (rs.next()) {
          i.setId(rs.getInt(1));
        }
      }

      return i;
    } catch (Exception e) {
      throw new DataAccessException("Error al persistir un nuevo Item del Pedido=" + i.getPedidoId(), e);
    }
  }

  @Override
  public ItemPedido leer(int id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public boolean actualizar(ItemPedido t) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public boolean eliminar(int id) {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }

  @Override
  public List<ItemPedido> listar() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from
                                                                   // nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
  }
}
