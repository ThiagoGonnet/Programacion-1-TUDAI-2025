public class EJ10 {
  public final static int MAX = 10;

  public static void main(String[] args) {
    int[] arrEntero = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

    int numero;
    System.out.print("Ingrese un numero N: ");
    numero = obtenerNumero();
    int numerosPrimosArreglo = cantPrimos(arrEntero);
    System.out.println("¿Hay por lo menos " + numero + " numeros primos en el arreglo?");
    if (numerosPrimosArreglo >= numero) {
      System.out.println("Si, ya que hay " + numerosPrimosArreglo + " numeros primos en el arreglo.");
    } else {
      System.out.println("No, ya que hay: " + numerosPrimosArreglo + " numeros primos en el arreglo.");
    }
  }

  public static int cantPrimos(int[] arreglo) {
    int cantDivisores = 0;
    boolean esPrimo = false;
    int contador = 0;
    for (int pos = 0; pos < MAX; pos++) {
      if (arreglo[pos] <= 1) {
        esPrimo = false;
      } else {
        for (int j = 1; j <= arreglo[pos]; j++) {
          if (arreglo[pos] % j == 0) {
            cantDivisores++;
          }
        }
        if (cantDivisores > 2) {
          esPrimo = false;
        } else {
          esPrimo = true;
        }
        if (esPrimo) {
          contador++;
        }
        cantDivisores = 0;
      }
    }
    return contador;
  }

  public static int obtenerNumero() {
    int numero;
    System.out.print("Ingrese un numero entero por favor: ");
    numero = Utils.leerInt();
    return numero;
  }
}
/*
 * 10. Hacer un programa que verifique en un arreglo si tiene al
 * menos N números primos. N debe ser ingresado por el usuario.
 * Reutilizar los métodos ya desarrollados
 */
