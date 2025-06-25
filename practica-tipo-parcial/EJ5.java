public class EJ5 {
  final static int MAXE = 16;

  public static void main(String[] args) {
    int[] arregloE = { -1, 5, 5, 7, 7, -6, 4, 9, 10, -4, 1, 1, 2, 7, -9, -8 };

    int idPedido = obtenerNumeroIdPedido();
    int gustoEmpanada = obtenerGustoEmpanada();

    imprimirArreglo(arregloE);
    procesarArreglo(arregloE, idPedido, gustoEmpanada);
    imprimirArreglo(arregloE);
  }

  public static void procesarArreglo(int[] arreglo, int idPedido, int gustoEmpanada) {
    int ini = 0, fin = -1, contador = 0;
    while (ini < MAXE && contador < idPedido) {
      ini = buscarIni(arreglo, fin + 1);
      if (ini < MAXE) {
        fin = buscarFin(arreglo, ini);
        // Tengo una secuencia
        contador++;
        if (contador == idPedido) {
          int posOrdenado = buscarPosOrdenado(arreglo, ini, fin, gustoEmpanada);
          correrDerecha(arreglo, posOrdenado, gustoEmpanada);
        }

      }
    }
  }

  public static void correrDerecha(int[] arreglo, int pos, int gustoEmpanada) {
    int i = MAXE - 1;
    while (i > pos) {
      arreglo[i] = arreglo[i - 1];
      i--;
    }
    arreglo[i] = gustoEmpanada;
  }

  public static int buscarPosOrdenado(int[] arreglo, int inicio, int fin, int gustoEmpanada) {
    int j = inicio;
    while (j <= fin && arreglo[j] < gustoEmpanada) {
      j++;
    }
    return j;
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAXE && esSeparador(arreglo[pos])) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAXE && !esSeparador(arreglo[pos])) {
      pos++;
    }
    return pos - 1;
  }

  public static boolean esSeparador(int elementoArreglo) {
    return elementoArreglo < 0;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < MAXE; i++) {
      System.out.print(arreglo[i] + "|");
    }
    System.out.println();
  }

  public static int obtenerGustoEmpanada() {
    int gustoEmpanada = -1;
    while (gustoEmpanada < 0 || gustoEmpanada > 10) {
      System.out.print("Ingrese un gusto válido por favor: ");
      gustoEmpanada = Utils.leerInt();
    }
    return gustoEmpanada;
  }

  public static int obtenerNumeroIdPedido() {
    int idPedido = -1;
    while (idPedido < 0 || idPedido > 3) {
      System.out.print("Ingrese un id válido por favor: ");
      idPedido = Utils.leerInt();
    }
    return idPedido;
  }
}
/*
 * 5. Casa de empanadas
 * Los pedidos que recibe una casa de empanadas se almacenan en un arreglo E de
 * tamaño MAXE. Cada tipo
 * de empanada se almacena con un número diferente, por ejemplo, el 5 representa
 * la empanada de carne
 * cortada a cuchillo mientras que el 7 representa la empanada de roquefort.
 * Cada pedido está separado por
 * uno o más números negativos (ya que los códigos son todos valores positivos
 * incluyendo el 0). Para facilitar
 * el proceso de producción los códigos de las empanadas están almacenadas en
 * forma ascendente. En el
 * siguiente ejemplo, tenemos 3 pedidos. El primero incluye 2 empanadas de carne
 * cortada a cuchillo (5) y 2 de roquefort (7).
 * -1 5 5 7 7 -6 4 9 10 -4 1 1 2 7 -9 -8
 * Si un cliente se olvida de alguna empanada, puede agregarla luego de
 * realizado el pedido. Para ellos debe
 * indicar el número de pedido (es el orden del pedido dentro del arreglo) y el
 * gusto de la empanada que quiere
 * agregar.
 * Se pide implementar un programa en Java que permita incorporar la empanada
 * faltante al pedido del cliente.
 * Siguiendo con el ejemplo, si el cliente quiere agregar una empanada de
 * roquefort en el pedido 2. El arreglo
 * resultante debería ser: -1 5 5 7 7 -6 4 7 9 10 -4 1 1 2 7 -9.
 */
