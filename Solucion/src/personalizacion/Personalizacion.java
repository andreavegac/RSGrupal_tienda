package personalizacion;

import java.util.ArrayList;
import java.util.List;

import accesorios.Dibujo;

public class Personalizacion {

  private final Tamano tamano;
  private final Color color;
  private final List<Dibujo> accesorios = new ArrayList<>();

  public Personalizacion(final Tamano tamano, final Color color) {
    this.tamano = tamano;
    this.color = color;
  }

  public double getPrecio() {
    double precio = tamano.getPrecio() + color.getPrecio();
    for (Dibujo accesorio : accesorios) {
      precio += accesorio.getPrecio();
    }
    return precio;
  }

  public void setAccesorio(final Dibujo accesorio) {
    accesorio.añadirAPrenda();
    accesorios.add(accesorio);
  }

}
