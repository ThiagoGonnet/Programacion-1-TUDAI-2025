import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ16 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      int contadorActual = 0;
      int maxContador = 0;

      for (int i = 0; i < 15; i++) { // Se ingresan 15 caracteres
        System.out.print("Ingrese un caracter por favor: ");
        char caracterIngresado = entrada.readLine().charAt(0);

        if (caracterIngresado == 'a') {
          contadorActual++;
          if (contadorActual > maxContador) {
            maxContador = contadorActual;
          }
        } else {
          contadorActual = 0; // Se reinicia el contador cuando no es 'a'
        }
      }

      System.out.print("La mayor cantidad de 'a' seguidas fueron: " + maxContador);
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error: " + err);
    }
  }
}
