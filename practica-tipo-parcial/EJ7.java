public class EJ7 {
  final static int MAXA = 25;

  public static void main(String[] args) {
    char[] ArrI = { ' ', 'A', 'A', '1', '2', '3', 'Z', 'Z', ' ', 'P', 'R', 'G', '0', '1', '0', ' ', 'A', 'B', '9', '8',
        '7', 'E', 'X', };
    char[] ArrE = { ' ', ' ', 'A', 'B', '9', '8', '7', 'E', 'X', ' ', 'A', 'A', '1', '2', '3', 'Z', 'Z', ' ', 'F', 'O',
        'R', '0', '0', '1', ' ' };

    char[] ArrNoE = new char[MAXA];
    char[] ArrNoI = new char[MAXA];

    imprimirArreglo(ArrNoE, MAXA);
  }

  public static int buscarIni(char[] arreglo, int pos, int MAX) {
    while (pos < MAX && arreglo[pos] == ' ') {
      pos++;
    }
    return pos;
  }

  public static int buscarFin(char[] arreglo, int pos, int MAX) {
    while (pos < MAX && arreglo[pos] != ' ') {
      pos++;
    }
    return pos - 1;
  }

  public static void imprimirArreglo(char[] arreglo, int MAX) {
    for (int i = 0; i < MAX; i++) {
      System.out.print(arreglo[i] + "|");
    }
    System.out.println();
  }
}
/*
 * La reserva natural Sierra del Tigre desea controlar el ingreso y egreso de
 * vehículos. Para ello, dispone de
 * cámaras que identifican las patentes de los vehículos que ingresan y egresan
 * del predio. Los ingresos y
 * egresos se registran en dos arreglos arrI y arrE respectivamente. Ambos
 * arreglos son de tamaño MAXA y
 * almacenan las patentes como secuencias de caracteres separados por uno o más
 * espacios.
 * Por ejemplo, en los siguientes arreglos la patente del primer vehículo en
 * ingresar al predio fue AA 123 ZZ, y el
 * primero en egresar fue AB 987 EX.
 * ArrI:
 * A A 1 2 3 Z Z P R G 0 1 0 A B 9 8 7 E X
 * ArrE:
 * A B 9 8 7 E X A A 1 2 3 Z Z F O R 0 0 1
 * Se debe implementar un programa que verifique, al finalizar el día, que todos
 * los autos que ingresaron hayan
 * también egresado del predio. En caso de detectar algún vehículo que no haya
 * egresado se debe almacenar la
 * patente en un arreglo arrNoE.
 * De igual manera, puede ocurrir que al ingreso del vehículo la patente no
 * quede registrada pero si al egresar.
 * En estos casos, se debe almacenar las patentes de los autos que no hayan
 * quedado registrados en el arreglo
 * arrI pero si en el arrE, en un arreglo arrNoI.
 * Nota: los arreglos arrNoE y arrNoI son de tamaño MAXA y deben almacenar las
 * patentes separadas por uno
 * o más espacios.
 * Siguiendo con el ejemplo anterior, los arreglos resultantes quedarían de la
 * siguiente forma:
 * ArrNoE
 * P R G 0 1 0
 * ArrNoI:
 * F O R 0 0 1
 * Aclaración: Asumir que cada vehículo puede ingresar o egresar una vez al día.
 *
 */
