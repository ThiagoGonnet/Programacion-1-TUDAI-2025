import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ21 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Por favor ingrese un número entero: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      boolean esPrimo = true;
      if (numeroIngresado <= 1) {
        esPrimo = false;
      } else {
        for (int i = 2; i <= Math.sqrt(numeroIngresado); i++) {
          if (numeroIngresado % i == 0) {
            esPrimo = false;
            break;
          }
        }
      }
      System.out.print(numeroIngresado + " es primo?: " + esPrimo);

    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Pedir por consola un número entero e informar si es un número
 * primo. Un número es primo si solo es divisible por 1 y por sí
 * mismo.
 */
