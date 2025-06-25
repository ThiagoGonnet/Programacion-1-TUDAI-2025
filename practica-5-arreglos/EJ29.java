public class EJ29 {

  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 3, 4, 0, 0, 5, 1, 0, 3, 5, 84, 0, 0, 3, 5, 84, 0,
        0, 0 };
    imprimirArreglo(arrEnteros);
    procesarSecuencia(arrEnteros);
    imprimirArreglo(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0, fin = -1;
    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // tenemos una secuencia
        if (esSecuenciaDescendente(arreglo, inicio, fin)) {
          System.out.println("Secuencia entre inicio:" + inicio + " fin:" + fin +
              " son descendentes");
          eliminarSecuencia(arreglo, inicio, fin);
        }
      }
    }
  }

  public static void eliminarSecuencia(int[] arreglo, int inicio, int fin) {
    int i = inicio;
    while (i <= fin) {
      correrIzquierda(arreglo, inicio);
      i++;
    }
  }

  public static void correrIzquierda(int[] arreglo, int inicio) {
    while (inicio < MAX - 1) {
      arreglo[inicio] = arreglo[inicio + 1];
      inicio++;
    }
  }

  public static boolean esSecuenciaDescendente(int[] arreglo, int inicio, int fin) {
    boolean esDescendente = true;
    while (inicio < fin) {
      if (!(arreglo[inicio] > arreglo[inicio + 1])) {
        esDescendente = false;
      }
      inicio++;
    }
    return esDescendente;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == 0) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != 0) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < MAX; i++) {
      System.out.print(arreglo[i] + "|");
    }
    System.out.println();
  }

}

/*
 *
 * 29. Hacer un programa que elimine de un arreglo todas las
 * secuencias que tienen orden descendente entre sus elementos
 */
