public class EJ5 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    char[] arregloCaracteres = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'j', 'k' };
    char[] arregloInvertido = new char[MAX];
    invertirOrdenArreglo(arregloCaracteres, arregloInvertido);
  }

  public static void invertirOrdenArreglo(char[] arreglo, char[] arregloInvertido) {
    int pos2 = 0;
    for (int pos = MAX - 1; pos >= 0; pos--) {
      System.out.println(arregloInvertido[pos2] = arreglo[pos]);
    }
  }
}
/*
 * 5. Hacer un programa que dado un arreglo de caracteres de tamaño
 * MAX que se encuentra cargado, invierta el orden del contenido
 */
