public class EJ8 {
  public final static int MAX = 5;

  public static void main(String[] args) {
    int[] arregloB = { 10, 5, 1, 50, 100 };

    if (esAscendente(arregloB)) {
      System.out.println("El arreglo B es ascendente!");
    } else {
      System.out.println("El arreglo B no es ascendente.");
    }
  }

  public static boolean esAscendente(int[] arreglo) {
    boolean esAscendente = true;
    for (int pos = 1; pos < MAX; pos++) {
      if (arreglo[pos] < arreglo[pos - 1]) {
        esAscendente = false;
      }
    }
    return esAscendente;
  }
}
/*
 * 8. Hacer un programa que determine si los valores almacenados en
 * un arreglo de enteros se encuentran en orden ascendente.
 */
