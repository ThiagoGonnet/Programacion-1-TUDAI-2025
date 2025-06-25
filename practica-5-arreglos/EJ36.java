public class EJ36 {
  final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int numero;

    numero = obtenerNumero();

  }

  public static int obtenerNumero() {
    int numero;
    System.out.print("Ingresa un numero por favor: ");
    numero = Utils.leerInt();
    return numero;
  }
}
/*
 * 36. Hacer un programa que dado un arreglo ordenado creciente de
 * enteros de tamaño 10 que se encuentra precargado, solicite al
 * usuario un número entero y elimine la primera ocurrencia de
 * número (un número igual) en el arreglo (si existe). Informar si no
 * existe en el arreglo.
 */
