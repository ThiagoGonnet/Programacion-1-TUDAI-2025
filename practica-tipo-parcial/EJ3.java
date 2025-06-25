public class EJ3 {
  final static int MAXM = 20, MAXA = 3, SEPARADORES = 0;

  public static void main(String[] args) {
    // secuencias = materias
    // cada elemento = alumno inscripto n°ro legajo
    int[] arregloM = { 0, 0, 34, 2, 12, 25, 0, 32, 55, 12, 3, 88, 14, 0, 0, 17, 36, 19, 0, 0 };

    // aulas
    int[] arregloA = { 2, 3, 6 };

    procesarArreglo(arregloM, arregloA);
    imprimirArreglo(arregloM);
  }

  public static void procesarArreglo(int[] arregloMaterias, int[] arregloAulas) {
    int inicio = 0, fin = -1, numAula = 0, contador = 0;
    while (inicio < MAXM) {
      inicio = buscarIni(arregloMaterias, fin + 1);
      if (inicio < MAXM) {
        fin = buscarFin(arregloMaterias, inicio);
        // Tengo una secuencia
        contador++;
        if (esSecuenciaInteres(arregloMaterias, arregloAulas, inicio, fin)) {
          numAula = obtenerNumeroAula(arregloMaterias, arregloAulas, inicio, fin);
          if (numAula == -1) {
            System.out.println("La materia " + contador + " no se pudo asignar.");
          } else {
            asignarAula(arregloMaterias, arregloAulas, inicio, numAula, contador);
            eliminarSecuencia(arregloMaterias, inicio, fin);
            fin = inicio;
          }
        }
      }
    }
  }

  public static int obtenerNumeroAula(int[] arregloMaterias, int[] arregloAulas, int ini, int fin) {
    int tamanio = fin - ini + 1;
    int j = 0;
    while (j < MAXA && tamanio - arregloAulas[j] > 0) {
      j++;
    }
    if (j >= MAXA) {
      return -1;
    } else {
      return j;
    }
  }

  public static void asignarAula(int[] arregloMaterias, int[] arregloAulas, int ini, int numAula, int contador) {
    System.out.println("La materia " + contador + " se asignó al aula " + numAula);

    arregloAulas[numAula] = -arregloAulas[numAula];
  }

  public static boolean esSecuenciaInteres(int[] arregloMaterias, int[] arregloAulas, int ini, int fin) {
    boolean esInteres = true;
    int tamanio = fin - ini + 1;
    int pos = ini;
    while (pos < MAXA && arregloAulas[pos] > 0 && !esInteres) {
      if (tamanio < arregloAulas[pos]) {
        esInteres = false;
      }
      if (pos >= MAXA) {
        esInteres = false;
      }
    }
    return esInteres;
  }

  public static void eliminarSecuencia(int[] arreglo, int ini, int fin) {
    int pos = ini;
    while (pos < MAXM && pos <= fin) {
      correrIzquierda(arreglo, ini);
      pos++;
    }
  }

  public static void correrIzquierda(int[] arreglo, int pos) {
    while (pos < MAXM - 1) {
      arreglo[pos] = arreglo[pos + 1];
      pos++;
    }
  }

  public static int buscarIni(int[] arreglo, int pos) {
    while (pos < MAXM && arreglo[pos] == SEPARADORES) {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(int[] arreglo, int pos) {
    while (pos < MAXM && arreglo[pos] != SEPARADORES) {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(int[] arreglo) {
    for (int i = 0; i < MAXM; i++) {
      System.out.print("|" + arreglo[i]);
    }
    System.out.println();
  }
}
/*
 * 3. Asignación de aulas
 * La Facultad de Exactas debe asignar aulas para una fecha de examen en la cual
 * hay distintas materias que
 * tomarán finales en el mismo horario. Dicha asignación se realiza en base a la
 * cantidad de alumnos y a la
 * capacidad de las aulas disponibles. Para ello, se almacena en un arreglo M de
 * tamaño MAXM el número de
 * legajo de los inscriptos a cada una de las materias. Para separar cada
 * materia, se utiliza uno o más ceros
 * (dado que ningún alumno posee un cero como número de legajo). Además, el
 * arreglo M siempre comienza y
 * termina también con uno o más ceros. Por ejemplo, el siguiente arreglo M
 * muestra que hay 3 materias que
 * tomarán examen en un mismo horario: en la primera hay 4 inscriptos, en la
 * segunda 6 inscriptos y en la
 * tercera solo 3.
 * 0 0 34 2 12 25 0 32 55 12 3 88 14 0 0 17 36 19 0 0
 * La facultad posee un conjunto de aulas, numeradas desde 0, disponibles para
 * tomar exámenes según su
 * capacidad. La capacidad se almacena en un arreglo A de tamaño MAXA ordenado
 * ascendentemente. En este
 * arreglo, el valor almacenado en la posición i se corresponde con la capacidad
 * del aula número i. Por ejemplo,
 * en el siguiente arreglo A de tamaño 3, el aula nro. 1, posee capacidad para 3
 * alumnos.
 * 2 3 6
 * Se pide implementar un programa en Java que asigne a cada materia almacenada
 * en el arreglo M, un aula
 * del arreglo A. La asignación debe realizarse en el orden en que aparecen las
 * materias en el arreglo M y
 * considerando, una asignación eficiente del espacio, esto es, el aula asignada
 * debe ser aquella que deje
 * menos cantidad de lugares sin ocupar (y que ya no haya sido asignada). Para
 * indicar que un aula ya ha sido
 * asignada, la capacidad debe ser cambiada por el valor original pero negativo.
 * Una vez realizada la asignación
 * se debe eliminar la secuencia del arreglo M. En caso de no existir un aula
 * disponible con la capacidad
 * necesaria, se debe informar que no se pudo asignar y se debe conservar la
 * secuencia.
 * Si la cantidad de materias fuera superior a la cantidad de aulas disponibles,
 * se debe informar que no quedan
 * más aulas cuando éstas hayan sido todas asignadas. Siguiendo el ejemplo, el
 * arreglo A resultante sería:
 * 2 -3 -6
 * Las asignaciones deben ser impresas por consola. En este ejemplo, las
 * asignaciones serían: “La materia 1 se
 * asignó al aula 2”, “La materia 2 no se puede asignar” y “La materia 3 se
 * asignó al aula 1.
 * El arreglo M resultante sería:
 * 0 0 0 32 55 12 3 88 14 0 0 0 0 0 0 0 0 0 0 0
 */
