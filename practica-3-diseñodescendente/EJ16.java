public class EJ16 {
  public static void main(String[] args) {
    int numMes = -1;
    while (numMes != 0) {
      while (numMes < 1 || numMes > 12) {
        System.out.println("Ingrese un numero de mes (entre 1 y 12 inclusive):");
        numMes = obtenerNumero();
      }
      obtenerDiasMeses(numMes);
      System.out.print("Ingrese otro numero o ingrese 0(cero) para salir: ");
      numMes = obtenerNumero();
    }
  }

  public static void obtenerDiasMeses(int numMes) {
    switch (numMes) {
      case 1, 3, 5, 7, 8, 10, 12:
        System.out.println("Tiene 31 dias");
        break;
      case 2:
        System.out.println("Tiene 28 dias.");
        break;
      default:
        System.out.println("Tiene 30 dias.");
        break;
    }
  }

  public static int obtenerNumero() {
    int num = Utils.leerInt();
    return num;
  }
}
/*
 * 16. Escribir un programa que mientras el usuario ingresa un
 * número de mes (entero) entre 1 y 12 inclusive, muestre por
 * pantalla la cantidad de días del mes ingresado (suponer febrero
 * de 28 días) (Mostrar por pantalla la cantidad de días del mes
 * debería realizarse con un método).
 *
 */
