import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ17 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un valor por favor: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      if (numeroIngresado > 1 && numeroIngresado <= 10) {
        for (int i = numeroIngresado; i >= 0; i--) {
          System.out.println(i);
        }
      } else {
        System.out.println("No se ha ingresado un numero entre 2 y 10");
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que dado un valor ingresado por el
 * usuario menor que 10 y mayor a 1, muestre por pantalla una
 * cuenta regresiva de números desde dicho valor hasta el 0
 * inclusive.
 */
