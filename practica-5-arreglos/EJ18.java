public class EJ18 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int numero = obtenerNumero();

    buscarNumero(arrEnteros, numero);

    imprimirArreglo(arrEnteros);
  }

  public static void buscarNumero(int[] arreglo, int numero) {
    int pos = 0;
    while (pos < MAX - 1 && arreglo[pos] != numero) {
      pos++;
    }
    if (arreglo[pos] == numero) {
      eliminarCoincidencia(pos, arreglo);
    } else {
      System.out.println("No existe el numero indicado " + numero + " en el arreglo.");
    }
  }

  public static void eliminarCoincidencia(int pos, int[] arreglo) {
    int i = pos;
    while (i < MAX - 1) {
      arreglo[i] = arreglo[i + 1];
      i++;
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
 * 18. Hacer un programa que dado un arreglo de enteros de tamaño
 * 10 que se encuentra precargado, solicite al usuario un número
 * entero y elimine la primera ocurrencia del número (un número
 * igual) en el arreglo (si existe). Para ello tendrá que buscar la
 * posición y si está, realizar un corrimiento a izquierda (queda una
 * copia de la última posición del arreglo en la anteúltima posición).
 */
