public class EJ2 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    calcularPromedio(arrEnteros);
  }

  public static void calcularPromedio(int[] arreglo) {
    int suma = 0;
    for (int pos = 0; pos < MAX; pos++) {
      suma += arreglo[pos];
    }
    System.out.println("El promedio es: " + ((double) suma / MAX));
  }
}
/*
 * 2. Hacer un programa que dado un arreglo ya cargado con 10
 * enteros, calcule el promedio y lo muestre por la consola.
 */
