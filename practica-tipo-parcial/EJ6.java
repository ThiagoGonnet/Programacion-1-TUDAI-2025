public class EJ6 {
  final static int MAXP = 28, SEPARADOR = 0, MAXR = 2;

  public static void main(String[] args) {
    int[] arregloP = { 0, 0, 9, 12, 18, 0, 1, 5, 43, 73, 88, 0, 8, 9, 52, 0, 1, 10, 90, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
    int[] arregloR = { 44, 6 };

    imprimirArreglo(arregloP);
    procesarArreglo(arregloP, arregloR);
    imprimirArreglo(arregloP);
  }

  public static void procesarArreglo(int[] arregloP, int[] arregloR) {
    int ini = 0, fin = -1, contador = 0;
    while (ini < MAXP) {
      ini = buscarIni(arregloP, fin + 1);
      if (ini < MAXP) {
        fin = buscarFin(arregloP, ini);
        // tengo una secuencia
        contador++;
        insertarProductos(arregloP, arregloR, ini, fin);
        // FALTABA ACTUALIZAR EL FIN
        fin += MAXR;
      }
    }
    System.out.println("La cantidad total de productos regalados fue: " + (contador * MAXR));
  }

  public static void insertarProductos(int[] arregloP, int[] arregloR, int ini, int fin) {
    int pos = 0;
    for (int i = 0; i < MAXR; i++) {
      pos = buscarPosOrdenado(arregloP, arregloR, ini, fin, i);
      // FALTABA ACTUALIZAR EL FIN
      fin++;
      correrDerecha(arregloP, pos, arregloR[i]);
    }

  }

  public static int buscarPosOrdenado(int[] arregloP, int[] arregloR, int ini, int fin, int i) {
    int j = ini;
    while (j <= fin && arregloP[j] < arregloR[i]) {
      j++;
    }
    return j;
  }

  public static void correrDerecha(int[] arreglo, int pos, int valor) {
    int j = MAXP - 1;
    while (j > pos) {
      arreglo[j] = arreglo[j - 1];
      j--;
    }
    arreglo[j] = valor;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAXP && arreglo[pos] == 0) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAXP && arreglo[pos] != 0) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < MAXP; i++) {
      System.out.print(arreglo[i] + "|");
    }
    System.out.println();
  }
}
/*
 * Un reconocido supermercado de venta online ha decidido regalar productos a
 * modo de promoción en todos
 * sus pedidos. Cada producto está identificado con un valor numérico mayor a 0.
 * Los pedidos recibidos se
 * almacenan en un arreglo P de tamaño MAXP que comienza y finaliza con uno o
 * más 0. Cada pedido está
 * compuesto por una serie de productos y separados entre sí también por uno o
 * más 0. Dentro de cada pedido,
 * los productos están ordenados de forma ascendente. A modo de ejemplo, en el
 * siguiente arreglo P, el primer
 * pedido está compuesto por los productos 9, 12 y 18. En total hay 4 pedidos.
 * 0 0 9 12 18 0 1 5 43 73 88 0 8 9 52 0 1 10 90 0 0 0 0 0 0 0 0 0
 * Se pide realizar un programa en Java que permita incorporar a cada pedido los
 * productos promocionados
 * que están almacenados en un arreglo R de tamaño MAXR. La incorporación de los
 * productos se deberá
 * realizar respetando el orden ascendente de los productos de cada pedido. Se
 * pide además informar la
 * cantidad de productos regalados en total.
 * Continuando con el ejemplo, dado un arreglo R = {44, 6} con MAXR = 2 el
 * arreglo resultante será:
 * 0 0 6 9 12 18 44 0 1 5 6 43 44 73 88 0 6 8 9 44 52 0 1 6 10 44 90 0
 * En el ejemplo, la cantidad total de productos regalados fue 8.
 */
