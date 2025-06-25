public class EJ9 {
  final static int MAXFILA = 4, MAXCOL = 15, SEPARADOR = 0, MAXARR = 3;
  final static double X = 600;

  public static void main(String[] args) {
    int[][] matriz = {
        { 0, 0, 150, 200, 165, 0, 154, 352, 240, 256, 0, 900, 750, 0, 0 },
        { 0, 940, 105, 265, 845, 215, 0, 245, 765, 348, 0, 741, 125, 541, 0 },
        { 0, 851, 543, 625, 845, 914, 0, 754, 184, 452, 637, 917, 0, 0, 0 }
    };

    int[] arr1 = { 1, 2, 0 };
    int[] arr2 = { 3, 0, 0 };
    procesarMatrizPrimeraCondicion(matriz, arr1);
    procesarMatrizSegundaCondicion(matriz, arr2);
  }

  public static void procesarMatrizPrimeraCondicion(int[][] matriz, int[] arr1) {
    int i = 0, mes = 0;
    double promedioMesMayorImporte = 0;
    ;
    while (i < MAXARR && arr1[i] != SEPARADOR) {
      mes = arr1[i] - 1;
      promedioMesMayorImporte = obtenerPromedioMesMayorImporte(matriz[mes]);
      System.out.println("En el mes " + (mes + 1) + " el promedio es " + promedioMesMayorImporte);
      i++;
    }
  }

  public static void procesarMatrizSegundaCondicion(int[][] matriz, int[] arr2) {
    int i = 0;
    while (i < MAXARR && arr2[i] != SEPARADOR) {
      System.out.println("¿Se cumplio? " + obtenerPromedioDiarioVentas(matriz[i]));
      i++;
    }
  }

  public static boolean obtenerPromedioDiarioVentas(int[] arr) {
    int ini = 0, fin = -1;
    double promVentas = 0;
    boolean esMayor = true;
    while (ini < MAXCOL && esMayor) {
      ini = buscarIni(arr, fin + 1);
      if (ini < MAXCOL) {
        // tengo una secuencia
        promVentas = obtenerPromedioVentas(arr, ini, fin);
        if (!(promVentas > X)) {
          esMayor = false;
        }
      }
    }
    return esMayor;
  }

  public static double obtenerPromedioVentas(int[] arr, int ini, int fin) {
    double promedio = 0;
    int cantVentas = fin - ini + 1;
    while (ini <= fin) {
      promedio += arr[ini];
      ini++;
    }
    return promedio / cantVentas;
  }

  public static double obtenerPromedioMesMayorImporte(int[] arr) {
    int ini = 0, fin = -1, cantSecuencias = 0;
    double promedioMesMayorImporte = 0;
    while (ini < MAXCOL) {
      ini = buscarIni(arr, fin + 1);
      if (ini < MAXCOL) {
        fin = buscarFin(arr, ini);
        // tengo una secuencia
        cantSecuencias++;
        promedioMesMayorImporte += obtenerMayorImporte(arr, ini, fin);
      }
    }
    return promedioMesMayorImporte / cantSecuencias;
  }

  public static double obtenerMayorImporte(int[] arr, int ini, int fin) {
    double mayorImporte = 0;
    while (ini <= fin) {
      if (mayorImporte < arr[ini]) {
        mayorImporte = arr[ini];
      }
      ini++;
    }
    return mayorImporte;
  }

  public static int buscarIni(int[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arr, int pos) {
    while (pos < MAXCOL && arr[pos] != SEPARADOR) {
      pos++;
    }
    return pos - 1;
  }
}

/*
 * 9. Ventas supermercado
 * Un supermercado almacena los importes de sus ventas anuales en una matriz de
 * NxM, en donde cada fila
 * representa las ventas de cada mes. Dentro de un mes, la información es
 * almacenada en secuencias
 * separadas por 0 donde cada secuencia representa las ventas realizadas dentro
 * de un día. Por ejemplo, en la
 * siguiente tabla, en el mes 1 se realizaron 3 ventas el primer día por $150,
 * $200 y $165.
 * 0 0 150 200 165 0 154 352 240 256 0 900 750 0 0
 * 0 940 105 265 845 215 0 245 765 348 0 741 125 541 0
 * 0 851 543 625 845 914 0 754 184 452 637 917 0 0 0
 * El gerente desea solicitar distintas estadísticas según el mes que se quiere
 * analizar. En algunos casos le
 * interesa conocer el promedio mensual de las ventas de mayor importe
 * registradas en cada día y en
 * otros casos, necesita saber si el promedio diario de ventas fue todos los
 * días superior a X durante el
 * mes. Para ello informa en un arreglo A1 los meses que desea la primera
 * estadística y en un arreglo A2 los de
 * la segunda. A1 y A2 son de tamaño N, rellenados con 0.
 * Por ejemplo, si A1 = {1,2,0} y A2 = {3,0,0} para los meses 1 y 2 se informará
 * que el promedio es $484 (200 +
 * 352 + 900 / 3) y 815.33 (940 + 765 + 741 / 3), respectivamente. Para el mes
 * 3, dado un X = 600, informará
 * que no se cumplió.
 */
