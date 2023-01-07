package accesorios;

public class Cosido implements Dibujo {

  private static final double PRECIO_BASE = 4.00;

  @Override
  public void añadirAPrenda() {
    System.out.println("Se ha creado un cosido para la prenda.");
  }

  @Override
  public double getPrecio() {
    return PRECIO_BASE;
  }

}
