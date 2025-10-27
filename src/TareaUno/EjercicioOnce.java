package TareaUno;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor en mb para convertirlo a kb: ");
        double mb = sc.nextDouble();
        double kb = mb*1024;
        System.out.printf("El kb es: %.2f \n",kb);

    }
}
