public class EJ25 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 5, 6, 0, 0, 3, 0, 14, 5, 3, 0, 0, 0, 5, -5, 0, 150, 5, 0 };

    procesarSecuencia(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo) {
    int inicio = 0, fin = -1, secuenciasTotales = 0;
    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // Tengo una secuencia
        secuenciasTotales++;
      }
    }

    if (secuenciasTotales >= 2) {
      anteultimaSecuencia(arreglo, inicio, fin);
    } else if (secuenciasTotales == 0) {
      System.out.println("No existen secuencias en el arreglo.");
    } else {
      System.out.println("Hay una sola secuencia, por lo tanto no se puede identificar una alteultima.");
    }
  }

  public static void anteultimaSecuencia(int[] arreglo, int inicio, int fin) {
    // hacer seguimiento en papel de esto inicio,
    while (arreglo[fin] != 0) {
      fin--;
    }
    // esta porcion de codigo iria en una funcion
    while (arreglo[fin] == 0) {
      fin--;
    }
    inicio = fin;
    while (arreglo[inicio] != 0) {
      inicio--;
    }
    inicio++;
    System.out.println("Posiciones la anteultima secuencia.");
    System.out.println("Inicio " + inicio);
    System.out.println("Fin " + fin);
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
 * 25. Hacer un programa que devuelva la posición de inicio y fin de la
 * anteúltima secuencia de números distintos de ceros.
 */
