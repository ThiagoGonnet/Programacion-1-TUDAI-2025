import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ11 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un caracter letra minuscula: ");
      char caracterIngresado = entrada.readLine().charAt(0);
      int contador = 0;
      while (caracterIngresado >= 'a' && caracterIngresado <= 'z') {
        switch (caracterIngresado) {
          case 'a', 'e', 'i', 'o', 'u':
            contador++;
            break;
        }
        System.out.print("Ingrese otro caracter letra minuscula: ");
        caracterIngresado = entrada.readLine().charAt(0);
      }
      System.out.println("Se ingresaron " + contador + " vocales.");
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras el usuario ingrese un
 * caracter letra minúscula, acumule la cantidad de vocales que
 * ingresó. Finalmente muestre por pantalla dicha cantidad.
 */
