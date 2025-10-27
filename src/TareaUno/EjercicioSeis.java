package TareaUno;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de la base: ");
        double base = sc.nextDouble();
        System.out.print("Ingresa el valor de la altura: ");
        double altura = sc.nextDouble();
        double area = (base*altura)/2;
        System.out.printf("El area es: %.2f \n",area);
    }

}
