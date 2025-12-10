import java.util.Scanner;

public class exos7 {
    public static void main(String[] args) {
        Scanner clavier = new Scanner (System.in);
        String response;
        System.out.println ("do you speak english ?");
        response= clavier.nextLine ();
        if (response.equalsIgnoreCase("y")){
            System.out.println ("nice to meet you");
        }
        else if (response.equalsIgnoreCase("n")){
            System.out.println ("so learn english !");
        }
        else{
            System.out.println ("erreur : veuiller répondre par y (oui) ou n (non)");
        }
    }
}
