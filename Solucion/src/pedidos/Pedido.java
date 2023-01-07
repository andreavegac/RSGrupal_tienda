package pedidos;

import java.util.List;

import productos.IProducto;

public class Pedido {

  List<IProducto> productos;

  public Pedido(final List<IProducto> productos) {
    setProductos(productos);
  }

  public void setProductos(final List<IProducto> productos) {
    this.productos = productos;
  }

}
