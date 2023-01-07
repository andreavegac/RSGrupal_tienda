package accesorios;

public abstract class DibujoDecorator implements Dibujo {

  protected Dibujo dibujoDecorado;

  public DibujoDecorator(final Dibujo dibujoDecorado) {
    this.dibujoDecorado = dibujoDecorado;
  }

  @Override
  public void añadirAPrenda() {
    dibujoDecorado.añadirAPrenda();
  }

}
