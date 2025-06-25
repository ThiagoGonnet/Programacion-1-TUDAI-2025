public class EJ1 {
  public final static int MAX = 15;
  public final static int RANGO_MIN = 1;
  public final static int RANGO_MAX = 12;

  public static void main(String[] args) {
    int[] arregloEnteros = new int[MAX];
    cargarArreglo(arregloEnteros);
    mostrarArreglo(arregloEnteros);
  }

  public static void cargarArreglo(int[] arreglo) {
    int numIngresado = -1;
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print("Ingrese un valor por favor (entre " + RANGO_MIN + " y " + RANGO_MAX + "): ");
      numIngresado = Utils.leerInt();
      while (numIngresado < RANGO_MIN || numIngresado > RANGO_MAX) {
        System.out.println("El valor ingresado se pasa del rango.");
        System.out.print("Ingrese un valor válido por favor (entre " + RANGO_MIN + " y " + RANGO_MAX + "):");
        numIngresado = Utils.leerInt();
      }
      arreglo[pos] = numIngresado;
    }
  }

  public static void mostrarArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.println("El arreglo en posicion -> " + pos + " tiene el valor de: " + arreglo[pos]);
    }
  }
}

/*
 * 1. Cargar un arreglo de tamaño 15, pidiendo el ingreso por teclado
 * de valores entre 1 y 12. Luego mostrar cómo quedó cargado.
 */
