package TareaUno;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Conversor de pesetas a euros \nIngrese el valor de pesetas que desea convertir");
        double pesetas = sc.nextFloat();
        double euro = pesetas / 166.386;
        System.out.printf("En euros es: %.2f", euro);

    }
}
