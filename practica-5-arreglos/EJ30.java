public class EJ30 {
  final static int MAX = 20;

  public static void main(String[] args) {
    int[] arregloA = { 0, 5, 2, 0, 0, 3, 5, 8, 0, 5, 0, 5, 12, 3, 5, 0, 12, 3, 5, 0 };
    int[] arregloP = { 5, 12, 3, 5 };
    int[] arregloR = { 7, 8, 9, 10 };
    imprimirArreglo(arregloA);

    procesarSecuencia(arregloA, arregloP, arregloR);
    imprimirArreglo(arregloA);
  }

  public static void procesarSecuencia(int[] arregloA, int[] arregloP, int[] arregloR) {
    int inicio = 0, fin = -1;
    while (inicio < MAX) {
      inicio = buscarIni(arregloA, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arregloA, inicio);
        // tengo una secuencia
        if (secuenciaIgualAPatron(arregloA, inicio, fin, arregloP)) {
          reemplazarSecuenciaA_porSecuenciaR(arregloA, inicio, fin, arregloR);
          fin = inicio - 1;
        }
      }
    }
  }

  public static void reemplazarSecuenciaA_porSecuenciaR(int[] arregloA, int inicio, int fin, int[] arregloR) {
    int j = 0;
    while (inicio <= fin) {
      arregloA[inicio] = arregloR[j];
      inicio++;
      j++;
    }
  }

  public static boolean secuenciaIgualAPatron(int[] arregloA, int inicio, int fin, int[] arregloPatron) {
    boolean esSecuenciaIgual = true;
    int j = 0;
    int tamaño = (fin - inicio) + 1;
    if (tamaño == 4) {
      while (inicio <= fin && esSecuenciaIgual) {

        if (arregloA[inicio] != arregloPatron[j]) {
          esSecuenciaIgual = false;
        }
        inicio++;
        j++;
      }
    } else {
      System.out.println("El tamaño de las secuencias no es igual");
      esSecuenciaIgual = false;
    }
    return esSecuenciaIgual;
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
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }
}
/*
 * 30. Hacer un programa que reemplace de un arreglo A todas las
 * ocurrencias de una secuencia patrón dada en un arreglo P, por la
 * secuencia contenida en el arreglo R de igual tamaño
 */
