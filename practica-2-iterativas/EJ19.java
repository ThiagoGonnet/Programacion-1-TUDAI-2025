import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ19 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero de mes valido por favor: ");
      int numeroMes = Integer.parseInt(entrada.readLine());
      while (numeroMes >= 1 && numeroMes <= 12) {
        switch (numeroMes) {
          case 1:
            System.out.println("Enero tiene 31 dias");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            ;
            break;
          case 2:
            System.out.println("Ingrese un número de año entre 2000 y 2025 por favor: ");
            int numeroAño = Integer.parseInt(entrada.readLine());
            if (numeroAño >= 2000 && numeroAño <= 2025) {
              if ((numeroAño % 4 == 0 && numeroAño % 100 != 0) || (numeroAño % 400 == 0)) {
                System.out.println("Es bisiesto.");
                System.out.println("Cantidad de dias: ");
                for (int i = 1; i <= 29; i++) {
                  System.out.println("Dia: " + i);
                }
              }
            } else {
              System.out.println("El año que se ingresó no esta entre 2000 y 2025");
            }
            break;
          case 3:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 4:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 30; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 5:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 6:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 30; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 7:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 8:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 9:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 30; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 10:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 11:
            System.out.print("Cantidad de dias:");
            for (int i = 1; i <= 30; i++) {
              System.out.println("Dia " + i);
            }
            break;
          case 12:
            System.out.println("Cantidad de dias: ");
            for (int i = 1; i <= 31; i++) {
              System.out.println("Dia " + i);
            }
        }
        System.out.println(
            "Ingrese otro numero de mes por favor (o ingrese un numero fuera del rango para finalizar el programa): ");
        numeroMes = Integer.parseInt(entrada.readLine());
      }
    } catch (Exception err) {
      System.out.print(err);
    }
  }
}
/*
 * Construir un programa que solicite desde teclado un número de
 * mes válido y posteriormente notifique por pantalla la cantidad de
 * días de ese mes. En el caso de que ingrese 2 como número de
 * mes (febrero) deberá además solicitar ingresar un número de año
 * entre 2000 y 2025 inclusive (no debe seguir si no está en ese
 * rango), y dependiendo de si es bisiesto o no imprimir la cantidad
 * de días correspondiente.
 */
