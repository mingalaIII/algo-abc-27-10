import java.util.Scanner;

public class exos2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 2;
        int b = 3;

        System.out.println("entre le chiffre a :");
        a = sc.nextInt();
        System.out.println("entre le chiffre b :");
        b = sc.nextInt();
        int soustraction = a - b;



        String opération="calcul de la soustraction";
        opération = sc.nextLine();
        System.out.println("le resultat de la soustration est " + soustraction);
                if (soustraction < 0) {
            System.out.println("le resultat est inferieur a 0");
            
        }
        else {
            System.out.println("le resultat est superieur ou egale a 0");
        }
        sc.close();/* je ferme mon scanner */
    }
}
