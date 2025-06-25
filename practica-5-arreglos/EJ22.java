public class EJ22 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    imprimirArreglo(arrEnteros);

    eliminarValoresPares(arrEnteros);

    imprimirArreglo(arrEnteros);
  }

  public static void eliminarValoresPares(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      if (pos == MAX - 1) {
        arreglo[pos] = arreglo[pos - 1];
      }
      if (arreglo[pos] % 2 == 0) {
        arreglo[pos] = arreglo[pos + 1];
        pos--;
      }
    }
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }
}
/*
 * 22. Hacer un programa que elimine los valores pares en un arreglo
 * de tamaño MAX=10.
 */
