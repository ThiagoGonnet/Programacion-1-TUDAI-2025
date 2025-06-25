public class EJ13 {
  public final static int MAX = 5;

  public static void main(String[] args) {
    char[] arregloCaracteres = { 'a', 'i', 's', 't', 'i' };

    System.out.println("Arreglo de vocales");
    imprimirArreglo((devolverArregloVocales(arregloCaracteres)));

    System.out.println("Arreglo de consonantes:");
    imprimirArreglo((devolverArregloConsonantes(arregloCaracteres)));
  }

  public static void imprimirArreglo(char[] arreglo) {
    for (int pos = 0; pos < MAX; pos++) {
      System.out.print(arreglo[pos] + " |");
    }
    System.out.println("");
  }

  public static char[] devolverArregloVocales(char[] arregloCaracteres) {
    char[] arregloVocales = new char[MAX];
    for (int pos = 0; pos < MAX; pos++) {
      switch (arregloCaracteres[pos]) {
        case 'a', 'e', 'i', 'o', 'u':
          arregloVocales[pos] = arregloCaracteres[pos];
          break;
        default:
          arregloVocales[pos] = '0';
      }
    }
    return arregloVocales;
  }

  public static char[] devolverArregloConsonantes(char[] arregloCaracteres) {
    char[] arregloConsonantes = new char[MAX];
    for (int j = 0; j < MAX; j++) {
      switch (arregloCaracteres[j]) {
        case 'a', 'e', 'i', 'o', 'u':
          arregloConsonantes[j] = '0';
          break;
        default:
          arregloConsonantes[j] = arregloCaracteres[j];
      }
    }
    return arregloConsonantes;
  }
}
/*
 * 13. Dado un arreglo de caracteres de tamaño MAX, hacer un
 * programa que implemente métodos tal que devuelva al main dos
 * arreglos: un arreglo con los caracteres que son letras vocales y
 * otro con los que son consonantes.
 */
