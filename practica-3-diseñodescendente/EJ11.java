public class EJ11 {
  public static void main(String[] args) {
    System.out.println("Ingrese la cantidad de veces que quiere que ingrese los numeros el usuario:");
    int MAX = Utils.leerInt();
    System.out.println("El maximo numero ingresado fue: " + ingresarNumeros(MAX));
  }

  public static int obtenerNumero() {
    int num = 0;
    System.out.print("Ingrese un numero entero por favor: ");
    num = Utils.leerInt();
    return num;
  }

  public static int mayorNumero(int num1, int num2) {
    int numMayor;
    while (num1 == num2) {
      System.out.println("Los dos numeros son iguales");
    }
    if (num1 < num2) {
      numMayor = num2;
    } else {
      numMayor = num1;
      num2 = num1;
    }
    return numMayor;
  }

  public static int ingresarNumeros(int MAX) {
    int max = obtenerNumero();
    for (int i = 1; i < MAX; i++) {
      int siguiente = obtenerNumero();
      max = mayorNumero(max, siguiente);
    }
    return max;
  }
}

/*
 * Escribir un método que retorne el mayor de dos números. Usar
 * ese método para calcular el máximo de una serie de números
 * ingresados por el usuario (20 números en total).
 *
 */
