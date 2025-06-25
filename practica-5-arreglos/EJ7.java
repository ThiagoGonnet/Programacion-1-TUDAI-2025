public class EJ7 {
  public final static int MAX = 6;

  public static void main(String[] args) {
    int[] arrEnteros = { 3, 2, 3, 4, 5, 3 };
    int numeroN, numeroM;

    System.out.print("Ingrese un numero de 0 a 9: ");
    numeroN = Utils.leerInt();
    int contador = buscarCoincidencia(arrEnteros, numeroN);
    int[] posicionesN = nuevoArreglo(MAX, contador, arrEnteros, numeroN);

    System.out.println("Ingrese numero M para multiplicar las coincidencias en el arreglo original: ");
    numeroM = Utils.leerInt();

    multiplicarArreglo(arrEnteros, numeroN, numeroM);

    System.out.println("Arreglo de enteros con coincidencias multiplicadas por " + numeroM);
    imprimirArreglo(arrEnteros, MAX);

    System.out.println("Arreglo vacio ya cargado: ");
    imprimirArreglo(posicionesN, contador);

  }

  public static int buscarCoincidencia(int[] arreglo, int numero) {
    int contador = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] == numero) {
        contador++;
      }
    }
    return contador;
  }

  public static int[] nuevoArreglo(int MAX, int MAX_2, int[] arrEnteros, int numeroN) {
    int[] nuevoArreglo = new int[MAX_2];
    int indice = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arrEnteros[pos] == numeroN) {
        nuevoArreglo[indice] = pos;
        indice++;
      }
    }
    return nuevoArreglo;
  }

  public static void multiplicarArreglo(int[] arreglo, int numero, int numeroM) {
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] == numero) {
        arreglo[pos] *= numeroM;
      }
    }
  }

  public static void imprimirArreglo(int[] arreglo, int MAX) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.println("Arreglo en posicion->" + pos + " con valor:" + arreglo[pos]);
    }
  }
}

/*
 * Hacer un programa que dado un arreglo de enteros y un número
 * N, genere un arreglo con las posiciones donde se encuentra dicho
 * número. A continuación, multiplicar por un número M todas las
 * ocurrencias del número N en el arreglo original.
 *
 */
