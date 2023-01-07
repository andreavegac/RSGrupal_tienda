package pedidos;

public class FacturaDigital {

  private static void iniciarSesion() {
    System.out.println("Iniciando sesión como administrador...");
    System.out.println("Usuario y contraseña correctos.");
    System.out.println("Sesión iniciada en el servidor.");
  }

  private static void subirFactura() {
    System.out.println("Adjuntando factura...");
    System.out.println("Factura subida a la cuenta del comprador.");
    System.out.println("Enviar notificación al correo del comprador.");
  }

  private static void cerrarSesion() {
    System.out.println("Cerrando sesión...");
    System.out.println("¡Vuelve pronto!");
  }

  public void procesar() {
    iniciarSesion();
    subirFactura();
    cerrarSesion();
  }
}
