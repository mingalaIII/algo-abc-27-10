import java.util.Scanner;

public class exos4 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        int a;
        int b;
        System.out.println("veuillez saisir un entier a :");
        a= clavier. nextInt();
        if (a%2==0){
            System.out.println(a+" est bien divisible par 2");

        }
        else{
            System.out.println(a+" n'est pas divisible par 2");
        }
    }
}
