public class EJ12 {
  public final static int MAX = 3;
  public final static int MAXB = 2;

  public static void main(String[] args) {
    int[] arregloA = { 3, 6, 31, 9 };
    int[] arregloB = { 0, 2 };

    int suma = sumaElementosA_posicionesIndicadasB(arregloA, arregloB);
    System.out.println(suma);
  }

  public static int sumaElementosA_posicionesIndicadasB(int[] arregloA, int[] arregloB) {
    int suma = 0;
    if (MAXB <= MAX) {
      for (int pos = 0; pos < MAXB; pos++) {
        suma += arregloA[arregloB[pos]];
      }
    } // else {
      // System.out.println("El indice de MAXB" + MAXB + " es mayor al de MAX: " +
      // MAX);
    // }
    return suma;
  }
}
/*
 * 12. Dado dos arreglos de números enteros: un arreglo A de tamaño
 * MAXA y un arreglo B de tamaño MAXB con números entre 0 y
 * MAXA-1, determinar la suma de los elementos del arreglo A cuyas
 * posiciones son indicadas por el arreglo B. Por ejemplo, dado
 * A={3,6,31,9}, MAXA=3 y B={0,2} con MAXB=2 el sistema deberá
 * informar: 34 (lo cual es el resultado de sumar el 3 de la posición 0
 * y el 31 de la posición 2 del arreglo A).
 */
