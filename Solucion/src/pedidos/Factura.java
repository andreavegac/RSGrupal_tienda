package pedidos;

public class Factura {

  private static void crearArchivo() {
    System.out.println("Creando archivo...");
    System.out.println("Actualizando extensión a PDF");
  }

  private static void rellenarFichero() {
    System.out.println("Adjuntando factura...");
    System.out.println("Enviando email...");
    System.out.println("Email enviado al comprador");
  }

  public void enviarFactura() {
    crearArchivo();
    rellenarFichero();
    System.out.println("Factura impresa");
    System.out.println("La factura ha sido introducida en el paquete");
  }

}
