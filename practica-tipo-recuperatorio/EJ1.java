public class EJ1 {
  final static int MAXFILA = 3, MAXCOL = 20, MAXB = 3, R = 2;

  public static void main(String[] args) {
    char[][] matrizV = {
        { 'x', 't', 'a', 'C', 'M', 'O', 't', 'a', 'a', 't', 'O', 'C', 't', 't', 'a', 'O', 'M', 'C', 't', 'x' },
        { 'x', 'r', 'r', 'r', 'C', 'C', 'O', 'O', 'r', 'r', 'C', 'r', 'G', 'G', 'G', 'r', 'r', 'x', 'x', 'x' },
        { 'x', 'm', 'G', 'm', 'h', 'h', 'L', 'G', 'G', 'O', 'h', 'h', 'm', 'm', 'O', 'B', 'M', 'C', 'x', 'x' }
    };
    char[] arregloB = { 'C', 'O', 'L' };

    procesarMatriz(matrizV, arregloB);
  }

  public static void procesarMatriz(char[][] matriz, char[] arrB) {
    int cantMalezaEliminada = 0;
    for (int fila = 0; fila < MAXFILA; fila++) {
      cantMalezaEliminada += procesarFila(matriz[fila], arrB);
    }
    System.out.println("La cantidad de maleza eliminada fue de " + cantMalezaEliminada);
  }

  public static int procesarFila(char[] arr, char[] arrB) {
    int ini = 0, fin = -1, malezaEliminada = 0;
    while (ini < MAXCOL) {
      ini = buscarIni(arr, fin + 1);
      if (ini < MAXCOL) {
        fin = buscarFin(arr, ini);
        if (fin - ini + 1 > R) {
          malezaEliminada += cantEliminada(arr, ini, fin, arrB);
          fin -= malezaEliminada;
        }
      }
    }
    imprimirArreglo(arr);
    return malezaEliminada;
  }

  public static int cantEliminada(char[] arr, int ini, int fin, char[] arrB) {
    int cant = 0;
    int i = ini;
    while (i <= fin) {
      if ((existeEnB(arr[i], arrB))) {
        correrIzquierda(arr, i);
        cant++;
        fin--;
      } else {
        i++;
      }
    }
    return cant;
  }

  public static boolean existeEnB(int i, char[] arrB) {
    /*
     * boolean existeEnB = false;
     * int j = 0;
     * while (j < MAXB && !existeEnB) {
     * if (i == arrB[j])
     * existeEnB = true;
     * j++;
     * }
     * return existeEnB;
     */
    int j = 0;
    while (j < MAXB && arrB[j] != i) {
      j++;
    }
    return (j == MAXB);
  }

  public static void correrIzquierda(char[] arr, int i) {
    while (i < MAXCOL - 1) {
      arr[i] = arr[i + 1];
      i++;
    }
  }

  public static int buscarIni(char[] arr, int pos) {
    while (pos < MAXCOL && esSeparador(arr[pos])) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(char[] arr, int pos) {
    while (pos < MAXCOL && !esSeparador(arr[pos])) {
      pos++;
    }
    return pos - 1;
  }

  public static boolean esSeparador(char valor) {

    return !(valor >= 'A' && valor <= 'Z');
  }

  public static void imprimirArreglo(char[] arr) {
    for (int i = 0; i < MAXCOL; i++) {
      System.out.print(arr[i] + "|");
    }
    System.out.println();
  }
}

/*
 * 1. Huerta Orgánica
 * Una huerta orgánica desea combatir las malezas con un innovador sistema
 * robótico. Dicho sistema utiliza inteligencia
 * artificial para detectar la especie de cada ejemplar vegetal que crece en la
 * huerta. La huerta está organizada en N
 * surcos. El sistema recorre cada surco y registra las especies a las que
 * pertenece cada ejemplar vegetal que encuentra a
 * su paso. Por cada ejemplar vegetal, registra, en una matriz V de N x M, su
 * especie, utilizando un carácter alfabético
 * minúscula o mayúscula. Las plantas cultivadas se identifican con letras
 * minúsculas mientras que el resto de la
 * vegetación, tanto las plantas beneficiosas como las malezas, se identifican
 * con letras mayúsculas. A modo de ejemplo, la
 * siguiente matriz representa una huerta de 3 surcos de longitud 20, en cuyo
 * primer surco se cultiva Solanum lycopersicum
 * (tomate, ‘t’) y Ocimum basilicum (albahaca, ‘a’). Además, se pueden ver otras
 * plantas identificadas: Calendula officinalis
 * (calendula, ‘C’), Ocimum basilicum (chamico, ‘M’) y Urtica dioica (ortiga,
 * ‘O’) . Además, cada fila comienza y termina con
 * uno o más caracteres ‘x’ para facilitar el procesamiento (no corresponde a
 * ninguna especie).
 * x t a C M O t a a t O C t t a O M C t x
 * x r r r C C O O r r C r G G G r r x x x
 * x m G m h h L G G O h h m m O B M C x x
 * Para eliminar las malezas, el robot posee un láser que destruye las plantas
 * indicadas. Para preservar los cultivos, el
 * láser sólo puede accionarse cuando existen más de R especies vegetales no
 * cultivadas consecutivas. No obstante, en
 * estas situaciones, no todas las plantas no cultivadas son destruidas, sino
 * sólo aquellas que no son beneficiosas para la
 * huerta. Para ello, se cuenta con un arreglo B (de tamaño MAXB) que indica al
 * sistema cuáles se consideran plantas
 * beneficiosas.
 * Se pide implementar un programa en Java que indique cómo quedaría la huerta,
 * representada por una matriz V, luego
 * de aplicar el láser del robot, considerando un arreglo de plantas
 * beneficiosas B y un valor R. Además, se debe informar
 * la cantidad total de malezas eliminadas en toda la huerta.
 * Continuando con el ejemplo anterior, dado B={‘C’, ‘O’, ‘L’} de tamaño MAXB =
 * 3 y un valor R=2, la matriz V resultante
 * sería:
 * x t a C O t a a t O C t t a O C t x x x
 * x r r r C C O O r r C r r r x x x x x x
 * x m G m h h L O h h m m O C x x x x x x
 * En este ejemplo, la cantidad total de malezas eliminadas fue 9.
 *
 */
