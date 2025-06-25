public class EJ33 {
  final static int MAX = 20, SEPARADOR = 0;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 25, 74, 4, 0, 0, 7, 8, 9, 10, 0, 25, 74, 0, 0, 6, 7, 8, 9, 0 };
    int[] arregloSecuenciasTamañoIgual = new int[MAX];
    int numero;

    numero = obtenerNumero();

    procesarSecuencia(arrEnteros, arregloSecuenciasTamañoIgual, numero);
    imprimirArreglo(arrEnteros);
    imprimirArreglo(arregloSecuenciasTamañoIgual);
  }

  public static void procesarSecuencia(int[] arreglo, int[] nuevoArreglo, int numeroIngresado) {
    int inicio = 0, fin = -1;
    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // Tengo una secuencia
        if (tamañoSecuencia(inicio, fin) == numeroIngresado) {
          cargarArreglo(nuevoArreglo, arreglo, inicio, fin);
        }
      }
    }
  }

  public static void cargarArreglo(int[] nuevoArreglo, int[] arreglo, int inicio, int fin) {
    int j = 0;
    while (inicio < MAX && inicio <= fin) {
      nuevoArreglo[j] = arreglo[inicio];
      inicio++;
      j++;
    }
  }

  public static int tamañoSecuencia(int inicio, int fin) {
    return (fin - inicio) + 1;
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

  public static int obtenerNumero() {
    int numero;
    System.out.print("Ingrese un numero por favor: ");
    numero = Utils.leerInt();
    return numero;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }
}
/*
 * 33. Hacer un programa que dado el arreglo definido y precargado,
 * y un número entero ingresado por el usuario, copie de forma
 * continua las secuencias de tamaño igual al número ingresado en
 * otro arreglo de iguales características e inicializado con 0. La
 * copia en este último arreglo deben comenzar desde el principio
 * del mismo.
 *
 */
