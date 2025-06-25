public class EJ9 {
  public final static int MAX = 5;

  public static void main(String[] args) {
    char[] arregloChar = { 'a', 'e', 'i', 'o', 'u' };
    if (estaRepetido(arregloChar)) {
      System.out.println("Hay por lo menos una letra repetida en el arreglo!");
    } else {
      System.out.println("No hay ninguna letra repetida!");
    }
  }

  public static boolean estaRepetido(char[] arreglo) {
    boolean estaRepetido = false;
    for (int pos = 0; pos < MAX; pos++) {
      for (int pos2 = pos + 1; pos2 < MAX; pos2++) {
        if (arreglo[pos] == arreglo[pos2]) {
          estaRepetido = true;
        }
      }
    }
    return estaRepetido;
  }
}
/*
 * 9. Dado un arreglo de caracteres, determinar si en el arreglo existe al
 * menos una letra repetida.
 *
 */
