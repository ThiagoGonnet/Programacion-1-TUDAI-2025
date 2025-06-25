import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ13 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un caracter: ");
      char caracterIngresado = entrada.readLine().charAt(0);
      int numeroIngresado;
      while (caracterIngresado >= 'a' && caracterIngresado <= 'z') {
        System.out.print("Ingrese un numero por favor: ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
        if (numeroIngresado >= 1 && numeroIngresado <= 5) {
          System.out.println("Tabla de multiplicacion de: " + numeroIngresado);
          for (int i = 0; i <= 10; i++) {
            System.out.println(i * numeroIngresado);
          }
        }
        System.out.print("Ingrese un caracter: ");
        caracterIngresado = entrada.readLine().charAt(0);
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * caracter letra minúscula, pida ingresar un número entero. Si el
 * número ingresado está entre 1 y 5 inclusive deberá imprimir la
 * tabla de multiplicar de dicho número.
 */
