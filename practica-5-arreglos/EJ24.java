public class EJ24 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 5, 6, 0, 0, 3, 0, 14, 5, 3, 6, 0, 0, 5, 2, 0, 150, 5, 0 };
    procesarSecuencia(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0, fin = -1, mayorSecuencia = 0, mayorIni = 0, mayorFin = 0, contador = 0;

    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // Aca ya tengo una secuencia
        contador = sumarElementos(arreglo, inicio, fin);
        if (contador > mayorSecuencia) {
          mayorSecuencia = contador;
          mayorIni = inicio;
          mayorFin = fin;
        }
      }
    }
    System.out.println("Posiciones de mayor secuencia " + mayorIni + " y " + mayorFin);
  }

  public static int sumarElementos(int[] arr, int ini, int fin) {
    int contador = 0;
    while (ini <= fin) {
      contador += arr[ini];
      ini++;
    }
    return contador;
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
}
/*
 * 24. Hacer un programa que devuelva la posición de inicio y fin de la
 * secuencia de números distintos de ceros cuya suma del contenido
 * sea mayor.
 *
 */
