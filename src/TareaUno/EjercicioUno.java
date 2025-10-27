package TareaUno;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EjercicioUno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor ingresa el primer numero: ");
        double n1 = sc.nextFloat();
        System.out.println("Por favor ingresa el segundo numero: ");
        double n2 = sc.nextFloat();
        double mul = n1 * n2;
        System.out.println("La multiplicacion de estos valores es: "+ mul);
    }
}