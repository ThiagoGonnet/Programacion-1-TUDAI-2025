public class EJ10 {
  public static void main(String[] args) {
    int numeroIngresado = obtenerNumero();
    char caracterIngresado = ' ';
    while (numeroIngresado >= 1 && numeroIngresado <= 10) {
      if (numeroIngresado % 3 == 0) {
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
      }
      if (numeroIngresado % 5 == 0) {
        imprimirTabla(numeroIngresado);
      }
      System.out.println("Ingrese otro numero o ingrese 0 (cero) para salir:");
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

  public static void imprimirTabla(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * num);
    }
  }
}

/*
 * Escribir un programa que mientras el usuario ingrese un
 * número entero entre 1 y 10 realice:
 * a. Si el numero ingresado es múltiplo de 3 pida ingresar un
 * caracter y para el caracter ingresado imprima a qué tipo de
 * carácter está asociado:
 * i. “letra minúscula” si el carácter es una letra del
 * abecedario en minúscula;
 * ii. “letra mayúscula” si el carácter es una letra del
 * abecedario en mayúscula;
 * iii. “dígito” si el carácter corresponde a un número;
 * iv. “otro” para los restantes casos de caracteres.
 * b. Si el número ingresado es múltiplo de 5 imprima la tabla de
 * multiplicar del número ingresado.
 *
 */
