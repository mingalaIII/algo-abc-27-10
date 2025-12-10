public class exosniv1 {
    public static void main(String[] args) {
        scanner clavier = new scanner(System.in);
        boolean a =true;
        boolean b =false;
        System.out.printIn("bonjour,votre commande est avec viande (true) ou vegetarien (false)");
        a=clavier.nextboolean();
        if (a==true){
            System.out.printIn("votre steak vous le voulez saignant (true) ou à poing (false) ?");
            b=clavier.nextboolean();
        }
     
        else{
            System.out.printIn("vous etes vegetarian")
        System.out.printIn("frites (true) ou riz (flase)");
        a=clavier.nextboolean();

        System.out.printIn("soda (true) ou eau gazeuse (false)");
        b=clavier.nextboolean();
        System.out.printIn("merci pour votre commande, ça sera près dans 20min,");

        clavier.close();
        
    }
}
