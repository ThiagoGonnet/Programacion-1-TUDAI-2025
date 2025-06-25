public class EJ32 {
  final static int MAX = 20, SEPARADORES = 0;

  public static void main(String[] args) {
    int[] arrEnteros = { 0, 1, 5, 2, 0, 0, 5, 4, 0, 2, 0, 9, 3, 1, 0, 4, 8, 9, 5, 0 };
    int numero;

    numero = obtenerPosicion();
    procesarSecuencia(arrEnteros, numero);
  }

  public static void procesarSecuencia(int[] arreglo, int posicionIngresada) {
    int inicio = 0, fin = -1;
    if (arreglo[posicionIngresada] == 0) {
      System.out.println("La posicion en el arreglo da cero!");
    } else {
      fin = buscarFin(arreglo, posicionIngresada);
      if (fin < MAX) {
        inicio = buscarIni(arreglo, fin);
      }
      System.out.println("Segun la posicion dada del usuario");
      System.out.println("Inicio de la secuencia: " + inicio + " Fin de la secuencia " + fin);
    }
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != 0) {
      pos--;
    }
    return pos + 1;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != 0) {
      pos++;
    }
    return pos - 1;
  }

  public static int obtenerPosicion() {
    int numero = -1;
    while (numero < 0 || numero > MAX - 1) {
      System.out.println("Ingrese un numero valido (rango entre 0 y 19):");
      numero = Utils.leerInt();
    }
    return numero;
  }
}
/*
 * 32. Se tiene un arreglo de enteros de tamaño 20 de secuencias de
 * números entre 1 y 9, separadas por 0. El arreglo está precargado,
 * y además empieza y termina con uno o más separadores 0. Hacer
 * un programa que permita obtener a través de métodos la posición
 * de inicio y la posición de fin de la secuencia ubicada a partir de
 * una posición entera ingresada por el usuario. Finalmente, si
 * existen imprima por pantalla ambas posiciones obtenidas
 */
