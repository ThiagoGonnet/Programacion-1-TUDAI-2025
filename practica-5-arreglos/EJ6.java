public class EJ6 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    obtenerNumerosPares(arrEnteros);
  }

  public static void obtenerNumerosPares(int[] arreglo) {
    int suma = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] % 2 == 0) {
        suma += 1;
      }
    }
    System.out.println("Hay " + suma + " numeros pares en el arreglo.");
  }
}
/*
 * 6. Hacer un programa que dado un arreglo de enteros de tamaño 10
 * que se encuentra cargado, obtenga la cantidad de números pares
 * que tiene y la imprima.
 *
 */
