package productos;

import personalizacion.Personalizacion;

public class Camiseta extends Producto {

  private static final double PRECIO_BASE = 10.00;

  public Camiseta(final Personalizacion personalizacion) {
    setPersonalizacion(personalizacion);
  }

  public double getPrecioBase() {
    return PRECIO_BASE;
  }

  @Override
  public String toString() {
    return "Camiseta [PRECIO_BASE=" + PRECIO_BASE + "]";
  }

}
