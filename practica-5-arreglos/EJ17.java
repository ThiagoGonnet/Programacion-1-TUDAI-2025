public class EJ17 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int numero = obtenerNumero();
    insertarNumero(arrEnteros, numero);

    imprimirArreglo(arrEnteros);
  }

  public static void insertarNumero(int[] arreglo, int numero) {
    for (int pos = MAX - 1; pos >= 0; pos--) {
      if (pos == 0) {
        arreglo[pos] = numero;
      } else {
        arreglo[pos] = arreglo[pos - 1];
      }
    }
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print("|" + arreglo[pos]);
    }
    System.out.println();
  }

  public static int obtenerNumero() {
    int numero;
    System.out.print("Ingrese un numero por favor: ");
    numero = Utils.leerInt();
    return numero;
  }
}
/*
 * 17. Hacer un programa que dado un arreglo de enteros de tamaño
 * 10 que se encuentra cargado, solicite al usuario un número entero
 * y lo agregue al principio del arreglo (posición 0). Para ello tendrá
 * que realizar un corrimiento a derecha (se pierde el último valor del
 * arreglo) y colocar el número en el arreglo en la posición indicada.
 */
