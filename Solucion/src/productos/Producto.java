package productos;

import personalizacion.Personalizacion;

public abstract class Producto implements IProducto {

  protected double precio;
  protected Personalizacion personalizacion;

  @Override
  public double getPrecio() {
    return getPrecioBase() + personalizacion.getPrecio();
  }

  public abstract double getPrecioBase();

  @Override
  public void setPersonalizacion(Personalizacion personalizacion) {
    this.personalizacion = personalizacion;
  }

}
