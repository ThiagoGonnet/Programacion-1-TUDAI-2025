public class EJ27 {
  final static int MAX = 20, SEPARADOR = 0;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 2, 3, 4, 0, 0, 5, 1, 0, 3, 5, 84, 0, 0, 5, 6, 10, 5, 0, 0 };
    int numeroIngresado;

    numeroIngresado = obtenerNumero();
    procesarSecuencia(arrEnteros, numeroIngresado);

    imprimirArreglo(arrEnteros);
  }

  public static void procesarSecuencia(int[] arreglo, int numeroIngresado) {
    int inicio = 0, fin = -1, tamañoSecuencia = 0;
    boolean seEncontroCoincidencia = false;

    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // tengo una secuencia
        tamañoSecuencia = obtenerTamañoSecuencia(inicio, fin);
        if (tamañoSecuencia == numeroIngresado) {
          eliminarSecuencia(arreglo, inicio, fin);
          seEncontroCoincidencia = true;
          fin = inicio - 1;
        }
      }
    }
    if (!seEncontroCoincidencia) {
      System.out.println("El numero no coincide con el tamaño de las secuencias existentes del arreglo.");
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

  public static int obtenerTamañoSecuencia(int inicio, int fin) {
    // tamaño secuencia fin-inicio+1
    return (fin - inicio) + 1;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != SEPARADOR) {
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
 * 27. Hacer un programa que dado un número N ingresado por el
 * usuario, elimine las secuencias de tamaño N de números distintos
 * de cero.
 *
 */
