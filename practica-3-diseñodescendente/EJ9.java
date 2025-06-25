public class EJ9 {
  public static void main(String[] args) {
    int numeroIngresado = obtenerNumero();
    char caracterIngresado = ' ';
    while (numeroIngresado >= 1 && numeroIngresado <= 10) {
      caracterIngresado = obtenerCaracter();
      if (esLetraMinuscula(caracterIngresado)) {
        System.out.println("Es letra minuscula.");
      } else if (esLetraMayuscula(caracterIngresado)) {
        System.out.println("Es letra mayuscula.");
      } else if (esDigito(caracterIngresado)) {
        System.out.println("Es digito");
      } else {
        System.out.println("Otro");
      }
      System.out.print("Ingrese otro numero o ingrese 0 (cero) para salir:");
      numeroIngresado = obtenerNumero();
    }
  }

  public static int obtenerNumero() {
    int num = 0;
    System.out.print("Ingrese un numero entero por favor: ");
    num = Utils.leerInt();
    return num;
  }

  public static char obtenerCaracter() {
    char caracter = ' ';
    System.out.print("Ingrese un caracter por favor: ");
    caracter = Utils.leerChar();
    return caracter;
  }

  public static boolean esLetraMinuscula(char letra) {
    return (letra >= 'a' && letra <= 'z');
  }

  public static boolean esLetraMayuscula(char letra) {
    return (letra >= 'A' && letra <= 'Z');
  }

  public static boolean esDigito(char letra) {
    return (letra >= '0' && letra <= '9');
  }
}

/*
 * 9. Escribir un programa que mientras el usuario ingrese un número
 * entero entre 1 y 10, pida ingresar un carácter, y por cada carácter
 * ingresado imprima:
 *
 * a. “letra minúscula” si el carácter es una letra del abecedario en
 * minúscula;
 * b. “letra mayúscula” si el carácter es una letra del abecedario
 * en mayúscula;
 * c. “dígito” si el carácter corresponde a un número;
 * d. “otro” para los restantes casos de caracteres.
 *
 */
