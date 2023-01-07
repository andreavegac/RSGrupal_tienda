package personalizacion;

public class Tamano {

  double precio;

  public Tamano(final String nombre) {
    calcularPrecioPorTalla(nombre);
  }

  private void calcularPrecioPorTalla(final String nombreTalla) {
    switch (nombreTalla.toUpperCase()) {
      case "XL":
        precio = 4.00;
        break;
      case "L":
        precio = 3.00;
        break;
      case "M":
        precio = 2.00;
        break;
      case "S":
        precio = 1.00;
        break;
      default:
        System.out.println("La talla " + nombreTalla
            + " es una talla especial y tenemos que modificar su patronaje. El coste de la prenda será muy elevado.");
        precio = 10.00;
        break;
    }
  }

  public double getPrecio() {
    return precio;
  }

}
