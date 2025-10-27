package TareaUno;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        double n1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero:");
        double n2 = sc.nextDouble();
        System.out.printf("La suma es: %.2f \n",n1+n2);
        System.out.printf("La resta es: %.2f \n",n1-n2);
        System.out.printf("La multiplicacion es: %.2f \n",n1*n2);
        System.out.printf("La division es: %.2f \n",n1/n2);

    }
}
