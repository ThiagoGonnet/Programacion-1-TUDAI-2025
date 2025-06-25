import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ7 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un caracter por favor: ");
      char caracterIngresado = entrada.readLine().charAt(0);
      while (caracterIngresado != '*') {
        switch (caracterIngresado) {
          case 'a', 'e', 'i', 'o', 'u':
            System.out.print("Es caracter vocal minuscula.");
            break;
          case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9':
            System.out.print("Es caracter digito");
            break;
          default:
            System.out.println("No es caracter digito ni vocal minuscula.");
        }
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras el usuario ingrese un caracter
 * distinto del carácter ‘*’, muestre por pantalla si es carácter dígito, o
 * si es carácter vocal minúscula.
 */
