public class EJ7 {
  final static int MAXFILA = 3, MAXCOL = 20, SEPARADOR = 0;

  public static void main(String[] args) {
    int[][] matrizComprimida = {
        { 0, -8, 67, 0, 14, 0, -4, 33, 0, 5, 98, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 25, 25, 0, -5, 3, 0, 25, 44, 44, 0, -4, 1, 0, 0, 0, 0, 0, 0, 0 },
        { 0, 44, 44, 44, 0, -7, 15, 0, -4, 9, 0, 12, 0, 0, 0, 0, 0, 0, 0, 0 }
    };
    procesarMatriz(matrizComprimida);
  }

  public static void procesarMatriz(int[][] matriz) {
    int cantPixelesDescomprimidos = 0, cantAnterior = 0, mayorFilaDescomprimida = 0, pixelesTotales = 0;
    for (int fila = 0; fila < MAXFILA; fila++) {
      cantPixelesDescomprimidos = obtenerPixelesDescomprimidos(matriz[fila]);
      if (cantPixelesDescomprimidos > cantAnterior) {
        cantAnterior = cantPixelesDescomprimidos;
        mayorFilaDescomprimida = fila;
      }
      pixelesTotales += cantPixelesDescomprimidos;
    }
    System.out.println("Cantidad total de pixeles descomprimidos " + pixelesTotales
        + " la mayor fila descomprimida fue: " + mayorFilaDescomprimida);
  }

  public static int obtenerPixelesDescomprimidos(int[] arr) {
    int ini = 0, fin = -1, cantTotal = 0, elemAgregados = 0;
    while (ini < MAXCOL) {
      ini = buscarIni(arr, fin + 1);
      if (ini < MAXCOL) {
        fin = buscarFin(arr, ini);
        if (arr[ini] < 0 && ((fin - ini + 1) == 2)) {
          elemAgregados = descomprimirSecuencia(arr, ini, fin);
          fin += elemAgregados;
          cantTotal += fin - ini + 1;
        }
      }
    }
    imprimirArreglo(arr);
    return cantTotal;
  }

  public static int descomprimirSecuencia(int[] arr, int ini, int fin) {
    int numeroRepetido = arr[fin], MAX = arr[ini] * -1, elemAgregados = 0;
    while (ini < MAXCOL && elemAgregados < MAX) {
      correrDerecha(arr, ini);
      arr[ini] = numeroRepetido;
      elemAgregados++;
      ini++;
    }
    return elemAgregados;
  }

  public static void correrDerecha(int[] arr, int pos) {
    int j = MAXCOL - 1;
    while (j > pos) {
      arr[j] = arr[j - 1];
      j--;
    }
  }

  public static int buscarIni(int[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] != SEPARADOR) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arr) {
    for (int i = 0; i < MAXCOL; i++) {
      System.out.print(arr[i] + "|");
    }
    System.out.println();
  }
}
