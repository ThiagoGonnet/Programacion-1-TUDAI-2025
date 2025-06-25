public class EJ19 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 2, 7, 8, 2, 10 };
    imprimirArreglo(arrEnteros);

    int numero = obtenerNumero();
    buscarCoincidencia(arrEnteros, numero);

    imprimirArreglo(arrEnteros);
  }

  public static void buscarCoincidencia(int[] arreglo, int numeroABuscar) {
    for (int pos = 0; pos < MAX; pos++) {
      while (arreglo[pos] == numeroABuscar) {
        eliminarCoincidencia(arreglo, pos);
        pos--;
      }
    }
  }

  public static void eliminarCoincidencia(int[] arreglo, int pos) {
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
 * 19. Hacer un programa que dado un arreglo de enteros de tamaño
 * 10 que se encuentra precargado, solicite al usuario un número
 * entero y elimine todas las ocurrencia de número en el arreglo.
 * Mientras exista (en cada iteración tiene que buscar la posición
 * dentro del arreglo) tendrá que usar la posición para realizar un
 * corrimiento a izquierda (quedarán tantas copias de la última
 * posición del arreglo como cantidad de ocurrencias del número).
 */
