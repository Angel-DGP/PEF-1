package TareaUno;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor del radio para sacar el volumen del cono: ");
        double r = sc.nextDouble();
        System.out.print("Ingresa el valor de la altura para sacar el volumen del cono: ");
        double h = sc.nextDouble();
        double volumen = (1.0/3.0) * 3.14 * Math.pow(r, 2) * h;
        System.out.printf("El volumen es: %.2f \n",volumen);

    }
}
