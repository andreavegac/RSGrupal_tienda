package pedidos;

import java.util.List;

import productos.IProducto;

public class Pedido {

  List<IProducto> productos;
  int numero;

  public Pedido(final List<IProducto> productos) {
    setProductos(productos);
  }

  public double getPrecio() {
    double total = 0.00;
    for (IProducto p : productos) {
      total += p.getPrecio();
    }
    return total;
  }

  public void setProductos(final List<IProducto> productos) {
    this.productos = productos;
  }

  public List<IProducto> getProductos() {
    return productos;
  }

  public int getNumero() {
    return numero;
  }

}
