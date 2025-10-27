package TareaUno;

import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota del primer examen:");
        double notaPrimerExamen = sc.nextDouble();
        System.out.println("Que nota quieres sacar en el trimestre?:");
        double notaTrimestre = sc.nextDouble();
        double notaSegundoExamen = ((notaTrimestre - (notaPrimerExamen * 0.4))/0.6);
        System.out.printf("Para tener un %.2f en el trimestre necesitas sacar un %.2f en el segundo examen",notaTrimestre,notaSegundoExamen);

    }
}
