public class test {
  final static int E = 20, MAXCOL = 23, MAXFILA = 4, SEPARADOR = 0;

  public static void main(String[] args) {
    int[][] matrizM = {{...},{...},{...},{...}};
    int[] arreglpo = {};
  }

  public static int corregirMedicion(int[] arr, int ini, int fin) {
    int cantEliminados = 0;
    for (int i = ini; i <= fin; i++) {
      if (arr[i] < E) {
        correrIzquierda(arr, i);
        cantEliminados++;
      } else {
        arr[i] -= E;
      }
    }
    return cantEliminados;
  }

  public static void correrIzquierda(int[] arr, int pos) {
    while (pos < MAXCOL - 1) {
      arr[pos] = arr[pos + 1];
      pos++;
    }
  }
}
