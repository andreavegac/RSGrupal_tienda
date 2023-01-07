package accesorios;

public class PinFormaDecorator extends DibujoDecorator {

  private static final double PRECIO_BASE = 1.00;

  public PinFormaDecorator(final Dibujo dibujoDecorado) {
    super(dibujoDecorado);
  }

  @Override
  public void añadirAPrenda() {
    dibujoDecorado.añadirAPrenda();
    setPin();
  }

  private static void setPin() {
    System.out.println("El dibujo se ha añadido a la prenda con un pin");
  }

  @Override
  public double getPrecio() {
    return dibujoDecorado.getPrecio() + PRECIO_BASE;
  }
}
