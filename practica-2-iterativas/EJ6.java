import java.io.BufferedReader;
import java.io.InputStreamReader;

class EJ6 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero por favor: ");
      final int numeroIngresado = Integer.parseInt(entrada.readLine());
      while (numeroIngresado <= 100 && numeroIngresado >= 1) {
        final boolean esMultiploDeDosYDeTres = numeroIngresado % 2 == 0 && numeroIngresado % 3 == 0;
        System.out.print(
            "¿El numero " + numeroIngresado + " es múltiplo de 2 y de 3 simultaneamente?: " + esMultiploDeDosYDeTres);
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
/*
 * Escribir un programa que mientras el usuario ingrese un número
 * entero menor que 100 y mayor a 1, muestre por pantalla si el
 * número es múltiplo de 2 y múltiplo de 3 simultáneamente. (¿Los
 * valores mencionados en el enunciado deberían ser constantes?.
 * De a poco habría que definirlos como constantes).
 */
