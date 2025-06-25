public class EJ8 {
  public static void main(String[] args) {
    int num1 = obtenerEntero();
    int num2 = obtenerEntero();
    char caracterIngresado = obtenerCaracter();
    switch (caracterIngresado) {
      case 'a':
        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
        break;
      case 'b':
        System.out.println("La resta de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
        break;
      case 'c':
        System.out.println("La multiplicacion de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
        break;
      case 'd':
        System.out.println("La division de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
        break;
    }
  }

  public static int obtenerEntero() {
    int num = 0;
    System.out.println("Ingrese un número entero por favor: ");
    num = Utils.leerInt();
    return num;
  }

  public static char obtenerCaracter() {
    System.out.println("Ingrese un caracter: ");
    char caracter = Utils.leerChar();
    return caracter;
  }

  public static int sumar(int num1, int num2) {
    return num1 + num2;
  }

  public static int restar(int num1, int num2) {
    return num1 - num2;
  }

  public static int multiplicar(int num1, int num2) {
    return num1 * num2;
  }

  public static double dividir(int num1, int num2) {
    while (num2 == 0) {
      System.out.println("No se puede dividir por cero, ingrese otro numero: ");
      num2 = obtenerEntero();
    }
    double resultado = (double) num1 / num2;
    return resultado;
  }

}
