public class EJ3 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEnteros = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    double promedio = calcularPromedio(arrEnteros);
    System.out.println(contarElementosMayorQuePromedio(arrEnteros, promedio));
  }

  public static int contarElementosMayorQuePromedio(int[] arreglo, double promedio) {
    int contador = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] > promedio) {
        contador += 1;
      }
    }
    return contador;
  }

  public static double calcularPromedio(int[] arreglo) {
    int suma = 0;
    for (int pos = 0; pos < MAX; pos++) {
      suma += arreglo[pos];
    }
    System.out.println("El promedio es: " + ((double) suma / MAX));
    return (double) suma / MAX;
  }
}
/*
 * 3. Con el mismo arreglo del ejercicio anterior informe por pantalla
 * cuantos elementos del mismo están por encima del promedio
 * calculado.
 */
