package productos;

import personalizacion.Personalizacion;

public class Pantalon extends Producto {

  private final double PRECIO_BASE = 15.00;

  public Pantalon(Personalizacion personalizacion) {
    super.personalizacion = personalizacion;
  }

  public double getPrecioBase() {
    return PRECIO_BASE;
  }
}