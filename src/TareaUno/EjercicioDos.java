package TareaUno;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de euros a pesetas\nIngrese el valor de euros que desea convertir");
        double euro = sc.nextFloat();
        double pesetas = euro * 166.386;
        System.out.println("La peseta es: " +pesetas);

    }
}
