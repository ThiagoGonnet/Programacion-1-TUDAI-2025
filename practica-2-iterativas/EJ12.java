import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ12 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      char caracterMenor = 'a';
      char caracterMayor = 'z';
      System.out.print("Ingrese un caracter letra minuscula: ");
      char caracterIngresado = entrada.readLine().charAt(0);
      while (caracterIngresado >= 'a' && caracterIngresado <= 'z') {
        if (caracterIngresado >= 'a') {
          caracterMenor = entrada.readLine().charAt(0);
        }
        if (caracterIngresado <= 'z') {
          caracterMayor = entrada.readLine().charAt(0);
        }
        System.out.println("Menor letra ingresada: " + caracterMenor);
        System.out.println("Menor letra ingresada: " + caracterMayor);
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras el usuario ingrese un
 * carácter letra minúscula, se quede con la menor y la mayor letra
 * ingresada. Finalmente muestre por pantalla dichas letras.
 */
