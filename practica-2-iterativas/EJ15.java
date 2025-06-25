import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ15 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero entero por favor, ingrese cero si quiere finalizar el programa: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());

      if (numeroIngresado == 0) { // Manejo especial si se ingresa 0 primero
        System.out.println("No se ingresaron números.");
        return;
      }

      double suma = 0;
      int menorNumero = numeroIngresado;
      int mayorNumero = numeroIngresado;
      int contador = 0;

      while (numeroIngresado != 0) {
        suma = suma + numeroIngresado;
        contador++;

        if (numeroIngresado < mayorNumero) {
          menorNumero = numeroIngresado;
        }
        if (numeroIngresado > menorNumero) {
          mayorNumero = numeroIngresado;
        }

        System.out.print("Ingrese un numero entero por favor, ingrese cero si quiere finalizar el programa: ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
      }
      double promedio = suma / contador;
      System.out.println("Termino el programa.");
      System.out.println("El promedio de los numeros ingresados fue: " + promedio);
      System.out.println("El menor numero fue: " + menorNumero);
      System.out.println("El mayor numero fue: " + mayorNumero);
    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Pedir por consola el ingreso de números enteros. Cuando se
 * ingrese un 0 se debe terminar el programa informando el
 * promedio de los números ingresados, cuál fue el mayor número y
 * cuál fue el menor número.
 */
