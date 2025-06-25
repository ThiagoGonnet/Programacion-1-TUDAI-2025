import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EJ2 {
  public static void main(String[] args) {
    try {
      BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Ingrese un numero de mes por favor: ");
      int numeroMes = Integer.parseInt(entrada.readLine());

      if (numeroMes > 0 && numeroMes <= 12) {
        switch (numeroMes) {
          case 1:
            System.out.print("Enero tiene 31 dias");
            break;
          case 2:
            System.out.print("Ingrese el numero del año por favor: ");
            int anio = Integer.parseInt(entrada.readLine());
            if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
              System.out.println(anio + " es bisiesto.");
              System.out.print("Febrero tiene 29 dias.");
            } else {
              System.out.println(anio + " no es bisiesto.");
              System.out.print("Febrero tiene 28 dias.");
            }
            break;
          case 3:
            System.out.print("Marzo tiene 31 dias.");
            break;
          case 4:
            System.out.print("Abril tiene 30 dias.");
            break;
          case 5:
            System.out.print("Mayo tiene 31 dias.");
            break;
          case 6:
            System.out.print("Junio tiene 30 dias.");
            break;
          case 7:
            System.out.print("Julio tiene 31 dias.");
            break;
          case 8:
            System.out.print("Agosto tiene 31 dias.");
            break;
          case 9:
            System.out.print("Septiembre tiene 30 dias");
            break;
          case 10:
            System.out.println("Octubre tiene 31 dias.");
            break;
          case 11:
            System.out.println("Noviembre tiene 30 dias.");
            break;
          case 12:
            System.out.println("Diciembre tiene 31.");
            break;
        }
      } else {
        System.out.println("El numero no esta en el rango del 1 al 12, por favor ingrese nuevamente un numero.");
      }
    } catch (Exception err) {
      System.out.print("Ha ocurrido un error " + err);
    }
  }
}

/*
 * 2. Construir un programa que solicite desde teclado un número de
 * mes y posteriormente notifique por pantalla la cantidad de días de
 * ese mes. En el caso de que ingrese 2 como número de mes
 * (febrero) deberá además solicitar ingresar un número de año y,
 * dependiendo si es bisiesto o no con la siguiente sentencia:
 * ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
 * imprimir la cantidad de días correspondiente.
 */
