package accesorios;

public class Parche implements Dibujo {

  private static final double PRECIO_BASE = 2.00;

  @Override
  public void añadirAPrenda() {
    System.out.println("Se ha creado un parche para la prenda.");
  }

  @Override
  public double getPrecio() {
    return PRECIO_BASE;
  }

}
