public class EJ5 {
  public static void main(String[] args) {
    incrementarNumero();
    System.out.println("terminó");
  }

  public static void incrementarNumero() {
    final int MAX = 4;
    for (int i = 1; i <= MAX; i++) {
      System.out.println(i);
    }
    return;
  }
}
/*
 * 5. Hacer un método que dado un número entero con valor inicial 1,
 * haga una iteración incrementando el número de a uno hasta un
 * valor MAX = 4 (constante). Mientras itera deberá imprimir el
 * número. Luego invocarlo desde el programa principal y cuando
 * termina, imprimir por pantalla “terminó”.
 *
 */
