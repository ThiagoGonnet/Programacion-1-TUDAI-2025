public class EJ8 {
  final static int MAX = 20, SEPARADOR = 0, N = 2;
  final static double M = 2.6;

  public static void main(String[] args) {
    double[] arregloSismico = { 0, 2.1, 1.5, 4.1, 0, 3.4, 0, 2.5, 3.0, 0, 3.8, 0, 2.7, 2.7, 3.9, 2.5, 0, 4.2, 2.0, 0,
        0 };

    procesarArreglo(arregloSismico);
  }

  public static void procesarArreglo(double[] arreglo) {
    int ini = 0, fin = -1;
    boolean existioDia = false;
    while (ini < MAX && !existioDia) {
      ini = buscarIni(arreglo, fin + 1);
      if (ini < MAX) {
        fin = buscarFin(arreglo, ini);
        // Tengo una secuencia
        if (fin - ini + 1 >= N && esPromedioValido(arreglo, ini, fin)) {
          System.out.println("La secuencia entre " + ini + " y " + fin + " hubo un minimo de " + N
              + " temblores. Y su promedio de Ritcher fue mayor que " + M);
          existioDia = true;
        }
      }
    }
  }

  public static boolean esPromedioValido(double[] arreglo, int ini, int fin) {
    int suma = 0;
    for (int i = 0; i <= fin; i++) {
      suma += arreglo[i];
    }
    return (suma / (fin - ini + 1)) > M;
  }

  public static int buscarIni(double[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] == SEPARADOR) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(double[] arreglo, int pos) {
    while (pos < MAX && arreglo[pos] != SEPARADOR) {
      pos++;
    }
    return pos - 1;
  }

}
/*
 * 8. Análisis de Sismos
 * Un sismógrafo ubicado en la ciudad de Mendoza, Argentina, registró una fuerte
 * actividad sísmica en los
 * últimos días. Los datos están en escala de Richter, y están representados en
 * el siguiente arreglo:
 * 0 2.1 1.5 4.1 0 3.4 0 2.5 3.0 0 3.8 0 2.7 2.7 3.9 2.5 0 4.2 2.0 0 0
 * Cada día de actividad sísmica está separado por un cero. Cada secuencia
 * representa qué sismos hubo en
 * esa jornada. Entonces, con la información provista, se pide:
 * Determinar si en periodo registrado, existió un día donde hubo un número N
 * mínimo de temblores y cuyo
 * promedio diario fuese superior a M en la escala de Richter. Por ejemplo, si
 * N=2 y M=2.6, existió dicho día
 * dado que la 3ra secuencia (2.5, 3.0) cumple con lo buscado.
 */
