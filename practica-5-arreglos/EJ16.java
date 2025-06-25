public class EJ16 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 12, 3, 6, 23, 3, 8, 9, 7, 4, 6 };
    int posicion = obtenerPosicion();

    imprimirArreglo(arrEnteros);

    System.out.println("Corrimiento a izquierda.");
    corrimientoAIzquierda(arrEnteros, posicion);
    imprimirArreglo(arrEnteros);
  }

  public static void corrimientoAIzquierda(int[] arreglo, int posicion) {
    while (posicion < MAX - 1) {
      arreglo[posicion] = arreglo[posicion + 1];
      posicion++;
    }
  }

  public static int obtenerPosicion() {
    int numero = -1;
    while (numero < 0 || numero >= MAX) {
      System.out.print("Ingrese un numero valido en el rango(" + (MAX - MAX) + " y " + (MAX - 1) + ") por favor: ");
      numero = Utils.leerInt();
    }
    return numero;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print("|" + arreglo[pos]);
    }
    System.out.println();
  }
}
/*
 * 16. Implementar un método que realice un corrimiento a izquierda
 * en un arreglo ordenado de tamaño MAX=10 a partir de una
 * posición.
 *
 *
 */
