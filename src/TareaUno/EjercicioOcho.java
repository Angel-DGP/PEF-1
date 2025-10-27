package TareaUno;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tus horas trabajadas por dia: ");
        int horas = sc.nextInt();
        double salarioSemanal = (horas * 12)*5;
        System.out.println("El salario es: $ "+salarioSemanal);
    }
}
