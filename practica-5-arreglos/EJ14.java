public class EJ14 {
  public final static int MAX = 5;

  public static void main(String[] args) {
    char[] arregloCaracteres = { 'a', 'i', 's', 't', 'i' };

    System.out.println("Arreglo de posiciones de vocales");
    imprimirArreglo((devolverArregloVocalesPosiciones(arregloCaracteres)));

    System.out.println("Arreglo de posiciones de consonantes:");
    imprimirArreglo((devolverArregloConsonantesPosiciones(arregloCaracteres)));
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + " |");
    }
    System.out.println("");
  }

  public static int[] devolverArregloVocalesPosiciones(char[] arregloCaracteres) {
    int[] arregloVocalesPosiciones = new int[MAX];
    for (int pos = 0; pos < MAX; pos++) {
      switch (arregloCaracteres[pos]) {
        case 'a', 'e', 'i', 'o', 'u':
          arregloVocalesPosiciones[pos] = pos;
          break;
        default:
          arregloVocalesPosiciones[pos] = -1;
      }
    }
    return arregloVocalesPosiciones;
  }

  public static int[] devolverArregloConsonantesPosiciones(char[] arregloCaracteres) {
    int[] arregloConsonantesPosiciones = new int[MAX];
    for (int j = 0; j < MAX; j++) {
      switch (arregloCaracteres[j]) {
        case 'a', 'e', 'i', 'o', 'u':
          arregloConsonantesPosiciones[j] = -1;
          break;
        default:
          arregloConsonantesPosiciones[j] = j;
      }
    }
    return arregloConsonantesPosiciones;
  }
}
/*
 * 14. Dado un arreglo de caracteres de tamaño MAX, hacer un
 * programa que implemente métodos tal que devuelva al main: un
 * arreglo con las posiciones de los caracteres que son letras
 * vocales y otro con las posiciones que son consonantes.
 *
 */
