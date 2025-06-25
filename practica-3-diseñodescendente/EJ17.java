public class EJ17 {
  public static void main(String[] args) {
    char letraIngresada = obtenerCaracter();
    int numIngresado;
    while (letraIngresada >= 'a' && letraIngresada <= 'z') {
      numIngresado = obtenerNumero();
      if (numIngresado >= 1 && numIngresado <= 5) {
        imprimirTabla(numIngresado);
      }
      letraIngresada = obtenerCaracter();
    }

  }

  public static void imprimirTabla(int num) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * num);
    }
  }

  public static int obtenerNumero() {
    int num;
    System.out.println("Ingrese un numero entero: ");
    num = Utils.leerInt();
    return num;
  }

  public static char obtenerCaracter() {
    char caracter;
    System.out.println("Ingrese un caracter por favor: ");
    caracter = Utils.leerChar();
    return caracter;
  }
}
/*
 * 17. Escribir un programa que mientras que el usuario ingrese un
 * carácter letra minúscula, pida ingresar un número entero. Si el
 * número ingresado está entre 1 y 5 inclusive deberá imprimir la
 * tabla de multiplicar de dicho número.
 *
 */
