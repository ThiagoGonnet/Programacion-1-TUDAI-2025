import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ20 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese numeros enteros positivos por favor: ");
      int numeroIngresado = Integer.parseInt(entrada.readLine());
      while (numeroIngresado != 0) {
        System.out.print("Ingrese un caracter por favor: ");
        char caracterIngresado = entrada.readLine().charAt(0);
        switch (caracterIngresado) {
          case 'a':
            System.out.print("Ingrese un texto libre y se imprimira por pantalla: ");
            String textoLibre = entrada.readLine();
            System.out.println(textoLibre);
            break;
          case 'b':
            System.out.print("Ingrese 5 numeros positivos por favor: ");
            int numeroAnterior = Integer.parseInt(entrada.readLine());
            boolean enAscenso = true;
            for (int i = 0; i < 4; i++) {
              System.out.print("Ingrese otro numero mas por favor: ");
              int numeroPosterior = Integer.parseInt(entrada.readLine());
              if (numeroAnterior >= numeroPosterior) {
                enAscenso = false;
              }
              numeroAnterior = numeroPosterior;
            }
            System.out.println("Los numeros fueron ingresado en ascendencia?: " + enAscenso);
            break;
          case 'c':
            System.out.print("Ingrese 2 numeros enteros negativos por favor: ");
            int numeroNegativo_1 = Integer.parseInt(entrada.readLine());
            int numeroNegativo_2 = Integer.parseInt(entrada.readLine());
            if (numeroNegativo_1 > 0 || numeroNegativo_2 > 0) {
              System.out.println("No se ingresaron numeros enteros negativos.");
            } else {
              double resultado = numeroNegativo_1 * numeroNegativo_2;
              if (resultado >= 0) {
                double raiz = Math.sqrt(resultado);
                System.out.println("La raíz cuadrada es: " + raiz);
              } else {
                System.out.println("Error: No se puede calcular la raíz cuadrada de un número negativo.");
              }
            }
          default:
            System.out.print("Ocurrio un error, ingrese otro caracter por favor: ");
            caracterIngresado = entrada.readLine().charAt(0);
            break;
        }
        System.out.print("Ingrese numeros enteros positivos por favor (Ingrese 0 para salir): ");
        numeroIngresado = Integer.parseInt(entrada.readLine());
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 *
 * Pedir números enteros positivos por teclado. En cada iteración
 * el usuario puede ingresar 0 para salir del programa. Si ingresa un
 * número distinto de 0 se debe pedir el ingreso de un carácter.
 * a. Si es ‘a’ se debe permitir al usuario escribir un texto libre e
 * imprimirlo por pantalla.
 * b. Si es ‘b’ se deben pedir 5 números positivos e informar si
 * fueron ingresados en orden ascendente.
 * c. Si es ‘c’ se deben pedir dos números enteros negativos e
 * imprimir la raíz cuadrada de su multiplicación. La raíz
 * cuadrada de un número se calcula con la sentencia:
 * Math.sqrt(numero) .
 * d. Ante cualquier otro carácter ingresado se debe informar un
 * error y pedir nuevamente el carácter.
 */
