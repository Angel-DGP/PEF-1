package TareaUno;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor en kb para convertirlo a mb: ");
        double kb = sc.nextDouble();
        double mb = kb/1024;
        System.out.printf("El mb es: %.2f \n",mb);
    }
}
