class EJ11 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arregloA = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    int[] arregloB = { 1, 2, 9, 4, 6, 5, 7, 8, 3, 10 };

    compararArreglos(arregloA, arregloB);
  }

  public static void compararArreglos(int[] arregloA, int[] arregloB) {
    int indice = 0;
    boolean todosPresentes = true;
    boolean seEncontro = false;
    int pos = 0;

    while (pos < MAX && todosPresentes) {
      while (indice < MAX) {
        if (arregloA[pos] == arregloB[indice]) {
          seEncontro = true;
        }
        indice++;
      }
      if (!seEncontro) {
        System.out.println(arregloA[pos] + " no se encuentra en el Arreglo B");
        todosPresentes = false;
      } else {
        System.out.println(arregloA[pos] + " se encuentra en el arreglo!");
        todosPresentes = true;
      }
      seEncontro = false;
      indice = 0;
      pos++;
    }
    if (todosPresentes) {
      System.out.println("Todos los numeros del Arreglo A estan presentes en el Arreglo B");
    } else {
      System.out.println("No todos los numeros del Arreglo A estan presentes en el Arreglo B...");
    }
  }
}
/*
 * 11. Dado dos arreglos de números enteros A y B determinar si
 * todos los números almacenados en el arreglo A están presentes
 * en el arreglo B.
 */
