public class EJ20 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 2, 7, 8, 2, 10 };
    imprimirArreglo(arrEnteros);

    int numero = obtenerNumero();
    buscarCoincidencia(arrEnteros, numero);

    imprimirArreglo(arrEnteros);
  }

  public static void buscarCoincidencia(int[] arreglo, int numeroABuscar) {
    boolean seEncontro = false;
    for (int pos = 0; pos < MAX; pos++) {
      while (arreglo[pos] == numeroABuscar) {
        eliminarCoincidencia(arreglo, pos);
        seEncontro = true;
        if (pos > 0) {
          pos--;
        }
      }
    }
    if (!seEncontro) {
      System.out.println(numeroABuscar + " no se encuentra en el arreglo.");
    }
  }

  public static void eliminarCoincidencia(int[] arreglo, int pos) {
    if (pos < MAX && pos > MAX - 2) {
      while (pos < MAX) {
        arreglo[pos] = arreglo[pos - 1];
        pos++;
      }
    }

    for (int i = pos; i < MAX - 1; i++) {
      arreglo[i] = arreglo[i + 1];
    }
  }

  public static int obtenerNumero() {
    int numeroIngresado;
    System.out.print("Numero a eliminar: ");
    numeroIngresado = Utils.leerInt();
    return numeroIngresado;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print("|" + arreglo[pos]);
    }
    System.out.println();
  }
}
/*
 * 20. Suponer a partir de lo resuelto en el ejercicio anterior (11) que
 * el elemento a eliminar coincide con el último que hay en el arreglo.
 * ¿Qué pasa en este caso? ¿Cómo daría una solución al problema?
 */
