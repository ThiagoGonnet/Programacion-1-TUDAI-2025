public class EJ4 {
  final static int MAXP = 25, SEPARADOR = 0, MAXT = 2;

  public static void main(String[] args) {
    // SECUENCIAS = PEDIDOS
    // ELEMENTOS = PRODUCTOS
    int[] arregloP = { 0, 0, 12, 9, 18, 0, 15, 5, 4, 7, 10, 0, 8, 9, 12, 0, 19, 10, 9, 0, 0, 0, 0, 0, 0, };
    int[] productoPromocionadoR = { 22 };
    int[] arregloT = { 8, 9 };
    int cantidad = 2;

    imprimirArreglo(arregloP);
    System.out.println("---------------------------------------------------");
    procesarArreglo(arregloP, productoPromocionadoR, arregloT, cantidad);
    imprimirArreglo(arregloP);
  }

  public static void procesarArreglo(int[] arregloP, int[] productoPromocionado, int[] arregloT, int cantidad) {
    int ini = 0, fin = -1, contador = 0;
    while (ini < MAXP && contador < cantidad) {
      ini = buscarIni(arregloP, fin + 1);
      if (ini < MAXP) {
        fin = buscarFin(arregloP, ini);
        // Tengo una secuencia
        if (existeElementoT(arregloP, arregloT, ini, fin)) {
          int posOrdenado = obtenerPosOrdenado(arregloP, productoPromocionado, ini, fin);
          correrDerecha(arregloP, productoPromocionado, posOrdenado);
          contador++;
        }
      }
    }
    if (contador < MAXT) {
      System.out.println("Quedaron sin agregar " + (cantidad - contador) + " productos R.");
    }
  }

  public static void correrDerecha(int[] arregloP, int[] productoPromocionado, int posOrdenado) {
    int j = MAXP - 1;
    while (j > posOrdenado) {
      arregloP[j] = arregloP[j - 1];
      j--;
    }
    arregloP[j] = productoPromocionado[0];
  }

  public static int obtenerPosOrdenado(int[] arregloP, int[] productoPromocionado, int ini, int fin) {
    int pos = ini, posOrdenado = -1;
    while (pos <= fin && arregloP[pos] < productoPromocionado[0]) {
      pos++;
    }
    posOrdenado = pos;
    return posOrdenado;
  }

  public static boolean existeElementoT(int[] arregloP, int[] arregloT, int ini, int fin) {
    boolean seEncontro = false;
    int pos = ini;
    while (pos <= fin && !seEncontro) {
      for (int i = 0; i < MAXT; i++) {
        if (arregloP[pos] == arregloT[i]) {
          seEncontro = true;
        }
      }
      pos++;
    }
    return seEncontro;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAXP && arreglo[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAXP && arreglo[pos] != SEPARADOR) {
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
 * 4. Ventas en supermercado online
 * Un reconocido supermercado de venta online ha decidido incorporar productos a
 * modo de promoción en
 * aquellos pedidos que cumplen con ciertos requisitos. Cada producto está
 * identificado con un valor numérico
 * mayor a 0. Los pedidos recibidos se almacenan en un arreglo P de tamaño MAXP
 * que comienza y finaliza con
 * uno o más 0. Cada pedido está compuesto por una serie de productos y
 * separados entre sí también por uno o
 * más 0. A modo de ejemplo, en el siguiente arreglo P, el primer pedido está
 * compuesto por los productos 12, 9
 * y 18. En total hay 4 pedidos.
 * 0 0 12 9 18 0 15 5 4 7 10 0 8 9 12 0 19 10 9 0 0 0 0 0 0
 * Se pide realizar un programa en Java que permita incorporar un producto
 * promocionado R en aquellos
 * pedidos que posean al menos uno de los productos almacenados en un arreglo T
 * de tamaño MAXT
 * (ordenado en forma ascendente). Debido a que solo se cuenta con una cantidad
 * C del producto
 * promocionado R, sólo serán incorporados en los primeros pedidos que cumplan
 * con el requisito antes
 * mencionado. La incorporación del producto se realiza al final del pedido.
 * Continuando con el ejemplo, dado un arreglo T = {8, 9} con MAXT = 2, un
 * producto promocionado R = 22 y
 * una cantidad C = 2, el arreglo resultante será:
 * 0 0 12 9 18 22 0 15 5 4 7 10 0 8 9 12 22 0 19 10 9 0 0 0 0
 * Por último, se debe indicar cuántos productos R quedaron sin agregar a los
 * pedidos. En dicho ejemplo no
 * quedaron productos por agregar.
 */
