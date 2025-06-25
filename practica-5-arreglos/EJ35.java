public class EJ35 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int numero;

    numero = obtenerNumero();
    buscar_posOrdenado(arrEnteros, numero);

    imprimirArreglo(arrEnteros);
  }

  public static void buscar_posOrdenado(int[] arreglo, int numeroIngresado) {
    int pos = 0;
    while (pos < MAX && numeroIngresado > arreglo[pos]) {
      pos++;
    }
    correrDerecha(arreglo, numeroIngresado, pos);
  }

  public static int obtenerNumero() {
    int numero;
    System.out.print("Ingresa un numero por favor: ");
    numero = Utils.leerInt();
    return numero;
  }

  public static void correrDerecha(int[] arreglo, int numeroIngresado, int pos) {
    int j = MAX - 1;
    while (j > pos) {
      arreglo[j] = arreglo[j - 1];
      j--;
    }
    arreglo[j] = numeroIngresado;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }
}
/*
 * 35. Hacer un programa que dado un arreglo ordenado creciente de
 * enteros de tamaño 10 que se encuentra precargado, solicite al
 * usuario un número entero y lo inserte en el arreglo manteniendo
 * su orden. Para ello tendrá que realizar un corrimiento a derecha
 * (se pierde el último valor del arreglo) y colocar el número en el
 * arreglo en la posición indicada.
 *
 */
