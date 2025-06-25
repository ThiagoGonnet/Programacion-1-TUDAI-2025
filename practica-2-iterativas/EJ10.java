import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ10 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero por favor: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      int contador = 0;
      while (numeroIngresado >= 1 && numeroIngresado <= 10) {
        contador = contador + numeroIngresado;
        System.out.print("Ingrese otro numero por favor: ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
      }
      ;
      System.out.println("Resultado de los numeros ingresados sumados: " + contador);
    } catch (Exception err) {
      System.out.println("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras que el usuario ingrese un
 * número entero entre 1 y 10 inclusive, lleve la suma de los
 * números ingresados. Finalmente, cuando sale del ciclo muestre
 * por pantalla el resultado de la suma. ¿En qué casos termina?
 */
/*
 * Respuesta: Termina en los caso q se ingrese un valor que este fuera de 1 y 10
 * (tipos int)
 */
