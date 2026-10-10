package dao;

import java.sql.Connection;
import java.util.List;

import model.Pedido;
import model.DetalleItemPedido;

public interface PedidoDAO extends GenericDAO<Pedido> {
  Pedido crear(Pedido p, Connection conn);

  List<DetalleItemPedido> listarDetalle(int pedidoId);

  List<DetalleItemPedido> listarTodosConDetalle();
}
