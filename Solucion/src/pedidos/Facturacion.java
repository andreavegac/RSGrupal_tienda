package pedidos;

public class Facturacion {

  Pedido pedido;

  public Facturacion(Pedido pedido) {
    this.pedido = pedido;
  }

  public void cobrarFactura(Factura factura) {
    pedido.toString();
    factura.enviarFactura();
  }
}
