public class EJ4 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    char[] arrCaracteres = { 'a', 'e', 'i', 'o', 'u', 'a', 'b', 'c', 'd', 'e' };
    char caracter = obtenerCaracter();
    buscarCaracter(arrCaracteres, caracter);
  }

  public static char obtenerCaracter() {
    char caracterObtenido = ' ';
    while ((caracterObtenido < 'a' || caracterObtenido > 'z') && (caracterObtenido < 'A' || caracterObtenido > 'Z')) {
      System.out.print("Ingrese un caracter válido por favor: ");
      caracterObtenido = Utils.leerChar();
    }
    return caracterObtenido;
  }

  public static void buscarCaracter(char[] arreglo, char caracterBuscar) {
    boolean seEncontro = false;
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] == caracterBuscar) {
        System.out.println("El caracter coincide! se encuentra en la posicion: " + pos);
        seEncontro = true;
      }
    }
    if (!seEncontro) {
      System.out.println("El caracter en el arreglo no existe.");
    }
  }
}
/*
 * 4. Buscar un elemento en un arreglo de caracteres ya cargado de
 * tamaño 10 y mostrar la/s posición/es del elemento, en caso de no
 * estar indicarlo también.
 *
 */
