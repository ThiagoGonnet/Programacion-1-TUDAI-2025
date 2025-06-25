import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ14 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      int contador = 0;
      int numeroIngresado;
      for (int i = 0; i <= 9; i++) {
        System.out.print("Ingrese 10 numeros enteros positivos por favor: ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
        if (numeroIngresado > 0) {
          if (numeroIngresado % 2 == 0) {
            contador = contador + 1;
          }
        } else {
          System.out.println("No se ingreso un numero positivo.");
        }

      }
      System.out.println("Las veces que se ingresaron numeros pares fueron: " + contador);

    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Pedir por consola el ingreso de 10 números enteros positivos.
 * Contar cuántas veces se ingresaron números pares y mostrarlo
 * por pantalla.
 */
