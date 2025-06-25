public class EJ12 {
  public static void main(String[] args) {
    System.out.println("Ingrese un numero valido para un dado de 6 caras.");
    int num = obtenerNumero();
    while (num < 1 || num > 6) {
      num = obtenerNumero();
    }
    System.out.println("Las veces que salio su numero ingresado fue: " + simulacionDado(num, 1000));
  }

  public static int simulacionDado(int numIngresado, int MAX) {
    int contador = 0;
    int dado = 0;
    for (int i = 1; i <= MAX; i++) {
      dado = (int) (6 * Math.random() + 1);
      if (dado == numIngresado) {
        contador++;
      }
    }
    return contador;
  }

  public static int obtenerNumero() {
    int num = 0;
    System.out.print("Ingrese un numero entero por favor: ");
    num = Utils.leerInt();
    return num;
  }
}
/*
 * Escribir un programa que simule 1000 lanzamientos de un dado
 * y muestre por pantalla cuántas veces salió el valor del dado
 * correspondiente al número entero N ingresado por el usuario.
 * Considerar que el valor N ingresado se corresponda a un valor
 * posible para un dado. Usar la sentencia Math.random() que
 * devuelve un valor aleatorio real entre 0 y 1.
 * Para asignar un posible valor a la variable dado entero:
 * dado = (int) (6*Math.random() + 1)
 *
 */
