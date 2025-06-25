import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ18 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero distinto que cero por favor: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      double resultado = 0;
      while (numeroIngresado != 0) {
        System.out.print("Ingrese otro numero por favor: ");
        int numero1 = Integer.parseInt(entrada.readLine());
        System.out.print("Ingrese otro numero por favor: ");
        int numero2 = Integer.parseInt(entrada.readLine());
        if (numero2 == 0) {
          System.out.println("No se puede dividir por cero.");
        } else {
          resultado = (numero1 / numero2);
          System.out.print("Resultado de dividir " + numero1 + " y " + numero2 + ": " + resultado + "\n");
        }
        System.out.print("Ingrese un numero distinto que cero por favor (si presiona 0, sale del programa): ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número distinto de 0, pida ingresar otros dos números e imprima
 * el resultado de la división entre los dos últimos números
 * ingresados. ¿Existe alguna restricción para la división?
 */
