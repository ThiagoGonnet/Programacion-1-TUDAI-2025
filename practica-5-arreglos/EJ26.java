public class EJ26 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 3, 4, 0, 0, 5, 1, 0, 3, 5, 84, 0, 0, 5, 6, 10, 5, 0, 0 };
    procesarSecuencia(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0, fin = -1, tamaño = 0, mayorTamaño = 0, inicioPosMayor = 0, finPosMayor = 0;

    while (inicio < MAX) {
      inicio = buscarInicio(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        tamaño = tamañoSecuencia(arreglo, inicio, fin);
        if (tamaño > mayorTamaño) {
          mayorTamaño = tamaño;
          inicioPosMayor = inicio;
          finPosMayor = fin;
        }
      }
    }
    System.out.println("Las posiciones de secuencia de mayor tamaño son: " + inicioPosMayor + " y " + finPosMayor);
  }

  public static int tamañoSecuencia(int[] arreglo, int inicio, int fin) {
    // tamaño secuencia = fin-inicio+1
    int tamaño = (fin - inicio) + 1;
    return tamaño;
  }

  public static int buscarInicio(int[] arreglo, int pos) {
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
 * 26. Hacer un programa que devuelva la posición de inicio y de fin
 * de la secuencia de mayor tamaño.
 *
 */
