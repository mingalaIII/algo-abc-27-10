import java.util.Scanner;

public class exos1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); /*je fais le scanner */
        /*j'entre mes valeur */
        int a;
        int b;
        /*je fais le systeme print */
        System.out.println("entre le chiffre a :");
        a = sc.nextInt();
        System.out.println("entre le chiffre b :");
        b = sc.nextInt();
        /*j'additionne mes valeur */
        int addition = a + b;
        String operation="calcul de l'addition";
         operation = sc.nextLine();
        System.out.println("le resultat de l'addition est "+ addition);
        System.out.println("calcal de l'addition");
        sc.close();/* je ferme mon scanner */
    }
}
