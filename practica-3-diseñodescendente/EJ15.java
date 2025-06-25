public class EJ15 {
  public static void main(String[] args) {
    int numNatural = obtenerNumeroNatural();
    while (numNatural > 0) {
      System.out.println("La sumatoria de" + numNatural + " es" + sumatoria(numNatural));
      numNatural = obtenerNumeroNatural();
    }
    ;
  }

  public static int sumatoria(int MAX) {
    int contador = 0;
    for (int i = 1; i <= MAX; i++) {
      contador += i;
    }
    return contador;
  }

  public static int obtenerNumeroNatural() {
    int numIngresado = -1;
    while (numIngresado < 1) {
      System.out.println("Ingrese un numero natural valido: ");
      numIngresado = Utils.leerInt();
    }
    return numIngresado;
  }
}
/*
 * 15. Escribir un programa que mientras que el usuario ingrese un
 * número entero natural, llame a un método que calcule la
 * sumatoria desde 1 a dicho número (Ej: si n= 5 sumatoria =
 * 1+2+3+4+5=15) y retorne el resultado.
 *
 */
