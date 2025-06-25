public class EJ13 {
  public static void main(String[] args) {
    int r1, r2, r3;
    int opcion = devolverOpcion();

    r1 = obtenerNumero();
    r2 = obtenerNumero();
    r3 = obtenerNumero();

    switch (opcion) {
      case 1: // calcular raiz cuadrada de (r1-r3)
        double raiz1;
        if (r1 - r3 >= 0) {
          raiz1 = (double) Math.sqrt(r1 - r3);
          System.out.println("Raiz cuadrada de (r1-r3) " + raiz1);
        } else {
          System.out.println("Error: no se puede calcular la raíz cuadrada de un número negativo.");
        }
        break;
      case 2: // calcular el promedio de r1-r2-r3
        System.out.println("Promedio de " + r1 + "-" + r2 + "-" + r3 + " es:" + calcularPromedio(r1, r2, r3));
        break;
      case 3: // calculcar cociente de la raiz cuadrada de (r3-r2) dividida por r1
        double raiz2 = (double) Math.sqrt(r3 - r2);
        while (r1 == 0) {
          System.out.println("No se puede dividir por cero, vuelva a ingresar R1");
          r1 = Utils.leerInt();
        }
        System.out
            .println("Cociente de la raiz cuadrada de " + r3 + "-" + r2 + " dividida por " + r1 + ": " + (raiz2 / r1));
        break;
      case 4: // calcular el cociente del promedio de los tres valores dividido por la raiz
              // cuadrada de r2
        double promedioCaseFour = calcularPromedio(r1, r2, r3);
        double raizR2 = Math.sqrt(r2);
        while (raizR2 == 0) {
          System.out.println("Vuelva a ingresar un valor distinto de cero para R2:");
          r2 = Utils.leerInt(); // o leerDouble si lo cambias
          raizR2 = Math.sqrt(r2);
        }

        System.out.println("Cociente del promedio de " + r1 + "-" + r2 + "-" + r3 + " divido por la raiz cuadrada de "
            + r2 + " \n El resultado es: " + promedioCaseFour / raizR2);
        break;
    }
  }

  public static double calcularPromedio(int num1, int num2, int num3) {
    double promedio = (double) (num1 + num2 + num3) / 3;
    return promedio;
  }

  public static int obtenerNumero() {
    int num = 0;
    System.out.print("Ingrese un numero entero por favor: ");
    num = Utils.leerInt();
    return num;
  }

  public static int devolverOpcion() {
    int num = 5;
    while (num < 1 || num > 4) {
      System.out.print("Ingrese una opcion valida (entre 1 y 4): ");
      num = Utils.leerInt();
    }
    return num;
  }
}
/*
 * Realizar un programa que, dada una opción entera (1,2,3,4),
 * permita realizar operaciones entre tres números reales (r1,r2,r3)
 * ingresados desde teclado. Para la opción:
 * 1. Calcular la raíz cuadrada de (r1-r3)
 * 2. Calcular el promedio de r1, r2 y r3
 * 3. Calcular cociente de la raíz cuadrada de (r3 - r2) dividida por
 * r1
 * 4. Calcular el cociente del promedio de los tres valores dividido
 * por la raíz cuadrada de r2
 * Observación: La raíz cuadrada de un número se calcula con la
 * sentencia: Math.sqrt(numero). Hacer uso del diseño descendente
 * y de la modularización para la solución. Tener en cuenta posibles
 * errores o excepciones como la división por cero.
 */
