package TareaUno;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base imponible: ");
        double baseImponible = sc.nextDouble();
        double total = baseImponible+ (baseImponible*0.13);
        System.out.printf("El total es: %.2f \n",total);
    }
}
