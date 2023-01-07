import java.util.ArrayList;
import java.util.List;

import accesorios.Cosido;
import accesorios.Dibujo;
import accesorios.Parche;
import accesorios.PinFormaDecorator;
import pedidos.Factura;
import pedidos.FacturaDigital;
import pedidos.FacturaDigitalAdapter;
import pedidos.Facturacion;
import pedidos.Pedido;
import personalizacion.*;
import productos.*;

public class Main {

  public static void main(String[] args) {
    final Pedido pedido = new Pedido(crearProductos());

    final Facturacion facturacion = new Facturacion(pedido);
    facturacion.cobrarFactura(new Factura());
    facturacion.cobrarFactura(new FacturaDigitalAdapter(new FacturaDigital()));

  }

  private static List<IProducto> crearProductos() {
    List<IProducto> productos = new ArrayList<>();
    final Personalizacion personalizacionAzulM = getPersonalizacionAzulM();
    productos.add(new Camiseta(personalizacionAzulM));
    productos.add(new Pantalon(personalizacionAzulM));

    final Personalizacion personalizacionRojoXLParche = getPersonalizacionRojoXLParche();
    productos.add(new Camiseta(personalizacionRojoXLParche));
    productos.add(new Pantalon(personalizacionRojoXLParche));

    final Personalizacion personalizacionVioletaXSParche = getPersonalizacionVioletaXSCosidoPin();
    productos.add(new Camiseta(personalizacionVioletaXSParche));
    productos.add(new Pantalon(personalizacionVioletaXSParche));

    return productos;
  }

  private static Personalizacion getPersonalizacionAzulM() {
    final Tamano talla = new Tamano("m");
    final Color color = new Color("Azul");
    return new Personalizacion(talla, color);
  }

  private static Personalizacion getPersonalizacionVioletaXSCosidoPin() {
    final Tamano talla = new Tamano("xs");
    final Color color = new Color("Violeta");
    final Personalizacion personalizacion = new Personalizacion(talla, color);
    final Dibujo cosidoEnPin = new PinFormaDecorator(new Cosido());
    final Dibujo parcheEnPin = new PinFormaDecorator(new Parche());
    final Dibujo cosido = new Cosido();
    final Dibujo parche = new Parche();

    personalizacion.setAccesorio(cosido);
    personalizacion.setAccesorio(parche);
    personalizacion.setAccesorio(parcheEnPin);
    personalizacion.setAccesorio(cosidoEnPin);

    return personalizacion;
  }

  private static Personalizacion getPersonalizacionRojoXLParche() {
    final Tamano talla = new Tamano("XL");
    final Color color = new Color("Rojo");
    final Personalizacion personalizacion = new Personalizacion(talla, color);
    final Dibujo parche = new Parche();
    personalizacion.setAccesorio(parche);

    return personalizacion;
  }

}
