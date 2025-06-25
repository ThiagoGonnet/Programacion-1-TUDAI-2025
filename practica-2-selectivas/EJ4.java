import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ4 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero entre 0 y 999: ");
      int numero = Integer.parseInt(entrada.readLine());
      if (numero >= 0 && numero <= 9) {
        System.out.println("Tiene 1 digito");
      } else if (numero >= 10 && numero <= 99) {
        System.out.println("Tiene 2 digitos");
      } else if (numero >= 100 && numero <= 999) {
        System.out.println(numero + " tiene 3 digitos.");
      } else {
        System.out.println("Tiene mas de 3 digitos el numero ingresado.");
      }
    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * 4. Escribir un programa donde el usuario ingrese un número entre 0
 * y 999, y muestre un mensaje de cuántos dígitos tiene. Además, si
 * tiene 3 dígitos debe informar qué número es.
 */
