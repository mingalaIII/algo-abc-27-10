import java.util.Scanner;

public class exos5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a ;
        int b;
        int c;
        System.out.println("entrer le chiffre a");
        a = sc.nextInt();
        System.out.println("entrer le chiffre b");
        b = sc.nextInt();
        System.out.println("entrer le chiffre c");
        c = sc.nextInt();
        int division = a * b / c;
        System.out.println("l'equation est superieur ");
        System.out.println("le resultat de la division est " + division);

        sc.close();

    }
    
}