public class EJ21 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 10, 9, 8, 7, 6, 5, 4, 3, 2, 1 };
    imprimirArreglo(arrEnteros);

    int numeroPosicion = obtenerPosicion();
    int valorElemento = obtenerElemento();

    insertarNumero(arrEnteros, valorElemento, numeroPosicion);

    imprimirArreglo(arrEnteros);
  }

  public static void insertarNumero(int[] arreglo, int valorElemento, int numeroPosicion) {
    for (int pos = MAX - 1; pos > numeroPosicion; pos--) {
      arreglo[pos] = arreglo[pos - 1];
    }
    arreglo[numeroPosicion] = valorElemento;
  }

  public static int obtenerElemento() {
    int numero;
    System.out.print("Ingrese el elemento a insertar en el arreglo: ");
    numero = Utils.leerInt();
    return numero;
  }

  public static int obtenerPosicion() {
    int numero = -1;
    while (numero < 0 || numero > MAX - 1) {
      System.out
          .print("Ingrese un numero en la posicion que quiera insertar el numero rango entre 0 y " + (MAX - 1) + ": ");
      numero = Utils.leerInt();
    }
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
 * 21. Hacer un programa que inserte un elemento en un arreglo
 * (ordenado decrecientemente) de tamaño MAX=10.
 *
 */
