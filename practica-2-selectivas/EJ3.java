import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ3 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingresa un numero mayor a 50: ");
      int numero = Integer.parseInt(entrada.readLine());
      if (numero > 50) {
        if (numero % 2 == 0) {
          System.out.print(numero + " es múltiplo de 2.");
        } else if (numero % 3 == 0) {
          System.out.println(numero + " es múltiplo de 3.");
        } else {
          System.out.println(numero + " no es multiplo ni de 2 ni de 3.");
        }
      } else {
        System.out.println("El numero no es mayor que 50.");
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}

/*
 * Escribir un programa que solicite el ingreso de un número mayor a
 * 50, y lo muestre por pantalla en caso de ser múltiplo de 2 o 3.
 */
