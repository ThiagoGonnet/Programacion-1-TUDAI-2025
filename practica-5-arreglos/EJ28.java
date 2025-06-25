public class EJ28 {
  final static int MAX = 20, SEPARADOR = 20, MAXPATRON = 3;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 3, 4, 0, 0, 5, 1, 0, 3, 5, 84, 0, 0, 3, 5, 84, 0, 0, 0 };
    int[] arrSecuenciasPatron = { 3, 5, 84 };

    imprimirArreglo(arrEnteros);

    procesarSecuencia(arrEnteros, arrSecuenciasPatron);
    imprimirArreglo(arrEnteros);
  }

  public static void procesarSecuencia(int[] arregloEnteros, int[] arregloPatron) {
    int inicio = 0, fin = -1, contador = 0;

    while (inicio < MAX) {
      inicio = buscarIni(arregloEnteros, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arregloEnteros, inicio);
        // tengo una secuencia
        contador++;
        System.out.println("Secuencia Nro " + contador);
        System.out.println("Se encuentra en la posicion " + inicio + " y " + fin);

        if (compararSecuenciaConPatron(arregloEnteros, arregloPatron, inicio, fin)) {
          eliminarSecuencia(arregloEnteros, inicio, fin);
          fin = inicio - 1;
        }

      }
    }
  }

  public static boolean compararSecuenciaConPatron(int[] arreglo, int[] arregloPatron, int inicio, int fin) {
    if (fin - inicio + 1 != MAXPATRON) {
      return false;
    }
    for (int i = 0; i < MAXPATRON; i++) {
      if (arreglo[inicio + i] != arregloPatron[i]) {
        return false;
      }
    }
    return true;
  }

  public static void correrIzquierda(int[] arreglo, int pos) {
    while (pos < MAX - 1) {
      arreglo[pos] = arreglo[pos + 1];
      pos++;
    }
  }

  public static void eliminarSecuencia(int[] arreglo, int inicio, int fin) {
    int i = inicio;
    while (i <= fin) {
      correrIzquierda(arreglo, inicio);
      i++;
    }
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
 * 28. Hacer un programa que elimine de un arreglo todas las
 * ocurrencias de una secuencia patrón dada por otro arreglo.
 *
 */
