public class EJ23 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 3, 4, 0, 0, 5, 1, 0, 3, 5, 84, 0, 0, 5, 6, 10, 5, 0, 0 };
    procesarSecuencia(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0;
    int fin = -1;
    if (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // Ya tengo una secuencia con inicio y fin
        imprimirSecuencia(arreglo, inicio, fin);
      }
    }
  }

  public static void imprimirSecuencia(int[] arreglo, int inicio, int fin) {
    for (int i = inicio; i < fin; i++) {
      System.out.print(arreglo[i] + "|");
    }
    System.out.println();
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != 0) {
      pos++;
    }
    return pos;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == 0) {
      pos++;
    }
    return pos;
  }

}
/*
 * 23. Hacer un programa que devuelva la posición de inicio y fin de la
 * primera secuencia de números distinta de ceros.
 */
