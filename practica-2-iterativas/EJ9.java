import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ9 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un caracter por favor:");
      char caracterIngresado = entrada.readLine().charAt(0);
      while ((caracterIngresado >= '0' && caracterIngresado <= '9')
          || (caracterIngresado >= 'a' && caracterIngresado <= 'z')) {
        if (caracterIngresado >= '0' && caracterIngresado <= '9') {
          System.out.println(caracterIngresado + " es caracter digito");
        } else {
          switch (caracterIngresado) {
            case 'a', 'e', 'i', 'o', 'u':
              System.out.println(caracterIngresado + " es vocal.");
              break;
            default:
              System.out.println(caracterIngresado + " es consonante");
              break;
          }
        }
        System.out.print("Ingrese otro caracter por favor: ");
        caracterIngresado = entrada.readLine().charAt(0);
      }
      ;
      System.out.println("Se ingreso un valor que no es caracter digito ni caracter letra minuscula.");
      System.out.println("Fin del programa.");
    } catch (

    Exception err) {
      System.out.print("Ocurrió un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * carácter dígito o carácter letra minúscula, imprima si es carácter
 * dígito o carácter letra minúscula, y si es letra minúscula imprimir si
 * es vocal o consonante.
 */
