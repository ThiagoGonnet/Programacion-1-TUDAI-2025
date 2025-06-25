public class EJ31 {
  final static int MAX = 20, SEPARADORES = 0;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 23, 5, 2, 0, 0, 5, 4, 0, 2, 0, 50, 3, 1, 0, 4, 8, 9, 5, 0 };
    imprimirArreglo(arrEnteros);

    procesarSecuencia(arrEnteros);
    imprimirArreglo(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0, fin = -1, ultimoInicio = -1, ultimoFin = -1;
    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // tengo una secuencia
        ultimoInicio = inicio;
        ultimoFin = fin;
      }
    }
    invertirUltimaSecuencia(arreglo, ultimoInicio, ultimoFin);
  }

  public static void invertirUltimaSecuencia(int[] arreglo, int inicio, int fin) {
    int aux;
    while (inicio < fin) {
      aux = arreglo[fin];
      arreglo[fin] = arreglo[inicio];
      arreglo[inicio] = aux;
      inicio++;
      fin--;
    }
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == SEPARADORES) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != SEPARADORES) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }

}
/*
 * Hacer un programa que invierta el orden de la última secuencia
 * en un arreglo.
 *
 */
