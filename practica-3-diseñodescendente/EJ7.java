public class EJ7 {
  public static void main(String[] args) {
    int numero = obtenerNumeroEntero();
    while (numero != 0) {
      System.out.println("La sumatoria de los primeros 200 numeros naturales es: " + sumatoriaNaturalesHasta200(200));
      numero = obtenerNumeroEntero();
    }
  }

  public static int obtenerNumeroEntero() {
    int num = 0;
    System.out.print("Ingrese un numero entero por favor: ");
    num = Utils.leerInt();
    return num;
  }

  public static int sumatoriaNaturalesHasta200(int MAX) {
    int contador = 0;
    for (int i = 1; i <= MAX; i++) {
      contador += i;
    }
    return contador;
  }
}
