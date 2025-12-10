import java.util.Scanner;

public class exos6 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        String prenom;
        int age;
        System.out.println ("quel est votre prénom ?");
        prenom= clavier.nextLine();
        System.out.println ("quel est votre âge ?");
        age= clavier.nextInt();
        System.out.println ("bonjour, je m'appelle "+prenom+" j'ai "+age+" ans");
        clavier.close();

    }
}