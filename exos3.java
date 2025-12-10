import java.util.Scanner;

public class exos3 {

    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int addition;
        Scanner clavier = new Scanner(System.in);
        System.out.println("La valeur de a");
          a = clavier.nextInt(); 
          System.out.println("La valeur de b");
          b = clavier.nextInt();
        addition = a + b;
        System.out.println("le resultat de l'addition est :" + addition);
        if (addition % 2 == 0) {
            System.out.println("le resultat est pair");
        }
        else {
            System.out.println("le resultat est impair");
        }
        clavier.close();
    }
}
