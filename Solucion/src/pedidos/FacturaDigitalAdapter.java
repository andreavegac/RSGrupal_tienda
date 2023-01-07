package pedidos;

public class FacturaDigitalAdapter extends Factura {

  private final FacturaDigital facturaDigital;

  public FacturaDigitalAdapter(final FacturaDigital facturaDigital) {
    this.facturaDigital = facturaDigital;
  }

  @Override
  public void enviarFactura() {
    facturaDigital.procesar();
  }
}
