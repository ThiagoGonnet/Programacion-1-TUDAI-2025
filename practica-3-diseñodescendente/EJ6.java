public class EJ6 {
  public static void main(String[] args) {
    // Pedir caracter
    char caracterIngresado = obtenerCaracter();
    while (caracterIngresado != '0') {
      while ('a' <= caracterIngresado && caracterIngresado <= 'z') {
        imprimirTabla(9);
        caracterIngresado = obtenerCaracter();
      }
      while ('A' <= caracterIngresado && caracterIngresado <= 'Z') {
        System.out.println("Ingrese otro caracter letra: ");
        caracterIngresado = obtenerCaracter();
      }
    }
  }

  public static char obtenerCaracter() {
    char caracterIngresado = ' ';
    while (!('a' <= caracterIngresado && caracterIngresado <= 'z')
        && !('A' <= caracterIngresado && caracterIngresado <= 'Z') && (caracterIngresado != '0')) {
      System.out.print("Ingrese un caracter letra (o ingrese cero (0) para salir): ");
      caracterIngresado = Utils.leerChar();
    }
    return caracterIngresado;
  }

  public static void imprimirTabla(int num) {
    System.out.println("Tabla de multiplicacion del " + num + ":");
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * num);
    }
  }
}
