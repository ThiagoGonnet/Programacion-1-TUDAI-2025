class EJ1 {
  final static int MAX = 20, X = 3, SEPARADOR = 0;

  public static void main(String[] args) {
    int[] arreglo = { 0, 67, 67, 67, 67, 67, 67, 67, 67, 0, 14, 0, 33, 33, 33, 33, 0, 5, 98, 0 };
    imprimirArreglo(arreglo);

    procesarArreglo(arreglo);
    imprimirArreglo(arreglo);
  }

  public static void procesarArreglo(int[] arreglo) {
    int inicio = 0, fin = -1;
    while (inicio < MAX) {
      inicio = buscarIni(arreglo, fin + 1);
      if (inicio < MAX) {
        fin = buscarFin(arreglo, inicio);
        // Tengo una secuencia
        int numRepetido = numeroRepetido(arreglo, inicio, fin);
        int cantRepetidos = cantidadRepetidos(arreglo, inicio, fin, numRepetido);
        if (cantRepetidos >= X) {
          System.out.println("Numero repetido " + numRepetido + " cantidad de repetidos " + cantRepetidos);
          comprimirSecuencia(arreglo, inicio, fin, numRepetido, cantRepetidos);
          // actualizar fin
          fin = inicio + 1;
        }
      }
    }
  }

  public static void comprimirSecuencia(int[] arreglo, int inicio, int fin, int numeroRepetido, int cantidadRepetidos) {
    // mientras que fin sea mayor a ini + 1,
    while (fin > inicio + 1) {
      // correr derecha
      correrIzquierda(arreglo, fin);
      fin--;
    }
    arreglo[inicio] = cantidadRepetidos * -1;
    arreglo[inicio + 1] = numeroRepetido;
  }

  public static void correrIzquierda(int[] arreglo, int pos) {
    while (pos < MAX - 1) {
      arreglo[pos] = arreglo[pos + 1];
      pos++;
    }
  }

  public static int cantidadRepetidos(int[] arreglo, int inicio, int fin, int numeroRepetido) {
    int contador = 0;
    while (inicio <= fin && arreglo[inicio] == numeroRepetido) {
      contador++;
      inicio++;
    }
    return contador;
  }

  public static int numeroRepetido(int[] arreglo, int inicio, int fin) {
    int numeroRepetido = 0;
    while (inicio <= fin && arreglo[inicio] == arreglo[inicio + 1]) {
      inicio++;
    }
    numeroRepetido = arreglo[inicio];
    return numeroRepetido;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == SEPARADOR) {
      pos++;
    }
    return pos++;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != SEPARADOR) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + "|");
    }
    System.out.println();
  }
}

/*
 * 1. Compresión de imagen
 * Un dispositivo que toma imágenes de un fenómeno natural está corriendo sobre
 * una plataforma tecnológica
 * con recursos limitados. Cada imagen (representada por una matriz de NxM) está
 * compuesta por píxeles con
 * valores entre 0 y 255. Se desea implementar un algoritmo de compresión que
 * comprima aquellas porciones
 * de la imagen distintas del color negro (0 en la escala de valores del pixel).
 * Se debe implementar la solución
 * para un arreglo (luego dicha solución se reutilizará en un futuro para cada
 * fila de la matriz). Para ello, se pide
 * realizar un programa en JAVA que, dado un arreglo de tamaño M, para cada
 * secuencia delimitada por uno o
 * mas pixeles de color negro (valor 0) con más de X repeticiones de un valor de
 * píxel (todos los elementos de la
 * secuencia deben ser iguales), comprima la secuencia poniendo en la primera
 * posición el valor negado de la
 * cantidad de ocurrenc;ias y a continuación el valor del pixel que se repite.
 * El
 * arreglo empieza y termina con un
 * separador 0 (color negro). Implementar usando las buenas prácticas de
 * programación estructurada vistas en
 * la cátedra.
 * Ejemplo:
 * Arreglo que tiene una fila de la imagen:
 * 0 67 67 67 67 67 67 67 67 0 14 0 33 33 33 33 0 5 98 0
 * El arreglo quedaría de la siguiente forma, para un X=3:
 * 0 -8 67 0 14 0 -4 33 0 5 98 0 0 0 0 0 0 0 0 0
 */
