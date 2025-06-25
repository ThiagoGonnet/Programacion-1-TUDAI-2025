public class EJ3 {
  final static int MAXFILA = 4, MAXCOL = 16;
  final static char SEPARADOR = ' ';

  public static void main(String[] args) {
    char[][] matriz = {
        { SEPARADOR, 'e', 'l', 'a', 'g', 'e', 'n', 't', 'e', SEPARADOR, SEPARADOR, SEPARADOR, SEPARADOR, SEPARADOR,
            SEPARADOR, SEPARADOR },
        { SEPARADOR, 'J', 'a', 'm', 'e', 's', SEPARADOR, 'B', 'o', SEPARADOR, 's', 'e', SEPARADOR, SEPARADOR, SEPARADOR,
            SEPARADOR },
        { SEPARADOR, 'e', 'n', 'c', 'u', 'e', 'n', 't', 'r', 'a', SEPARADOR, 'e', 'n', SEPARADOR, SEPARADOR,
            SEPARADOR },
        { SEPARADOR, 'C', 'o', 'l', 'o', 'n', 'i', 'a', SEPARADOR, SEPARADOR, SEPARADOR, SEPARADOR, SEPARADOR,
            SEPARADOR, SEPARADOR, SEPARADOR }
    };

    procesarMatriz(matriz);
  }

  public static void procesarMatriz(char[][] matriz) {
    int secEncriptadas = 0;
    for (int fila = 0; fila < MAXFILA; fila++) {
      secEncriptadas += secuenciaInteres(matriz[fila]);
    }
    System.out.println("Se encriptaron un total de " + secEncriptadas + " de secuencias.");
  }

  public static int secuenciaInteres(char[] arreglo) {
    int ini = 0, fin = -1, secEncriptadas = 0, cantVocalesDuplicadas = 0;
    while (ini < MAXCOL) {
      ini = buscarIni(arreglo, fin + 1);
      if (ini < MAXCOL) {
        fin = buscarFin(arreglo, ini);
        // Tengo una secuencia
        if (arreglo[ini] >= 'A' && arreglo[ini] <= 'Z') {
          cantVocalesDuplicadas = vocalesDuplicadas(arreglo, ini, fin);
          fin += cantVocalesDuplicadas;
          if (ini >= 0 && fin < MAXCOL && ini < fin) {
            invertirSecuencia(arreglo, ini, fin);
            secEncriptadas++;
          }

        }
      }
    }
    mostrar(arreglo);
    return secEncriptadas;
  }

  public static int vocalesDuplicadas(char[] arr, int ini, int fin) {
    int j = ini, cantVocalesDuplicadas = 0;
    while (j <= fin) {
      if (esVocal(arr[j])) {
        correrDerecha(arr, j);
        cantVocalesDuplicadas++;
        fin++;
        j += 2;
      } else {
        j++;
      }
    }
    return cantVocalesDuplicadas;
  }

  public static void correrDerecha(char[] arr, int elem) {
    for (int i = MAXCOL - 1; i > elem; i--) {
      arr[i] = arr[i - 1];
    }
    arr[elem + 1] = arr[elem];
  }

  public static void invertirSecuencia(char[] arr, int ini, int fin) {
    char aux;
    while (ini < fin) {
      aux = arr[fin];
      arr[fin] = arr[ini];
      arr[ini] = aux;
      ini++;
      fin--;
    }
  }

  public static boolean esVocal(char valor) {
    boolean esVocal = false;
    switch (valor) {
      case 'a', 'e', 'i', 'o', 'u':
        esVocal = true;
        break;
      default:
        esVocal = false;
    }
    return esVocal;
  }

  public static int buscarIni(char[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(char[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] != SEPARADOR) {
      pos++;
    }
    return pos - 1;
  }

  public static void mostrar(char[] arr) {
    for (int i = 0; i < MAXCOL; i++) {
      System.out.print(" | " + arr[i]);
    }
    System.out.println();
  }
}
