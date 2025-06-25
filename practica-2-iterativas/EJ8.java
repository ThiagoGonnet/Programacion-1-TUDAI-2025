import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ8 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(
          System.in));
      System.out.print("Ingrese un numero entero distinto de cero: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      while (numeroIngresado != 0) {
        System.out.print("Ingrese otro numero entero por favor: ");
        int segundoNumeroIngresado = Integer.parseInt(entrada.readLine());
        System.out.print(segundoNumeroIngresado);
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número entero distinto de 0, pida ingresar otro número entero y lo
 * imprima.
 */
