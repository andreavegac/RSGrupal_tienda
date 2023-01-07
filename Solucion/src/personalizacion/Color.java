package personalizacion;

public class Color {

  double precio;

  public Color(final String nombreColor) {
    calcularPrecioPorColor(nombreColor);
  }

  private void calcularPrecioPorColor(final String nombreColor) {
    switch (nombreColor.toUpperCase()) {
      case "ROJO":
        precio = 4.00;
        break;
      case "AZUL":
        precio = 3.00;
        break;
      case "VERDE":
        precio = 2.00;
        break;
      case "NEGRO":
        precio = 1.00;
        break;
      default:
        System.out.println("El color " + nombreColor
            + " es una color especial y tenemos que crearlo. El coste de la prenda será muy elevado.");
        precio = 20.00;
        break;
    }
  }

  public double getPrecio() {
    return precio;
  }
}
