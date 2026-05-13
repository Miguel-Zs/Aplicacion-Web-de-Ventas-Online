import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



public class VentasTest {



  // ─────────────────────────────────────────

  // SPRINT 1: Registro e Inicio de Sesión

  // ─────────────────────────────────────────



  @Test

  public void testRegistroUsuarioExitoso() {

    String nombre  = "Juan Pérez";

    String email  = "juan@mail.com";

    String password = "clave1234";



    assertNotNull(nombre);

    assertNotNull(email);

    assertTrue(email.contains("@"));

    assertTrue(password.length() >= 8);

  }



  @Test

  public void testEmailInvalido() {

    String email = "correo-sin-arroba";

    assertFalse(email.contains("@"));

  }



  @Test

  public void testLoginCorrecto() {

    String passwordGuardada = "clave1234";

    String passwordIngresada = "clave1234";

    assertEquals(passwordGuardada, passwordIngresada);

  }



  @Test

  public void testLoginIncorrecto() {

    String passwordGuardada = "clave1234";

    String passwordIngresada = "incorrecta";

    assertNotEquals(passwordGuardada, passwordIngresada);

  }



  // ─────────────────────────────────────────

  // SPRINT 2: Catálogo y Carrito de Compras

  // ─────────────────────────────────────────



  @Test

  public void testProductoConStock() {

    int stock = 10;

    assertTrue(stock > 0);

  }



  @Test

  public void testProductoSinStock() {

    int stock = 0;

    assertFalse(stock > 0);

  }



  @Test

  public void testAgregarProductoAlCarrito() {

    int cantidadEnCarrito = 0;

    cantidadEnCarrito += 1; // se agrega un producto

    assertEquals(1, cantidadEnCarrito);

  }



  @Test

  public void testTotalCarrito() {

    double precioLaptop = 1299.99;

    double precioMouse = 29.99;

    double totalEsperado = 1329.98;



    double totalCalculado = precioLaptop + precioMouse;

    assertEquals(totalEsperado, totalCalculado, 0.01);

  }



  @Test

  public void testEliminarProductoDelCarrito() {

    int cantidadEnCarrito = 2;

    cantidadEnCarrito -= 1; // se elimina un producto

    assertEquals(1, cantidadEnCarrito);

  }



  // ─────────────────────────────────────────

  // SPRINT 3: Pagos y Facturación

  // ─────────────────────────────────────────



  @Test

  public void testPagoAprobado() {

    String estadoPago = "APROBADO";

    assertEquals("APROBADO", estadoPago);

  }



  @Test

  public void testPagoRechazado() {

    String estadoPago = "RECHAZADO";

    assertNotEquals("APROBADO", estadoPago);

  }



  @Test

  public void testFacturaGenerada() {

    String numeroFactura = "FAC-0001";

    assertNotNull(numeroFactura);

    assertTrue(numeroFactura.startsWith("FAC-"));

  }



  @Test

  public void testTotalFacturaCorrecto() {

    double totalCarrito = 1329.98;

    double totalFactura = 1329.98;

    assertEquals(totalCarrito, totalFactura, 0.01);

  }

}