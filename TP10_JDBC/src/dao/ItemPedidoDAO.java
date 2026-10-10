package dao;

import java.sql.Connection;

import model.ItemPedido;

public interface ItemPedidoDAO extends GenericDAO<ItemPedido> {
  ItemPedido crear(ItemPedido i, Connection conn);
}
