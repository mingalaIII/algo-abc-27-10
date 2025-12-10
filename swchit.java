import java.util.Scanner;

public class swchit {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in); //* Initialsiation du scanner */
        int age;
           System.out.println("Donnez votre âge :");
            age = clavier.nextInt();

        switch (age) {
            case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15:
                System.out.println("vous etes un enfant");
                break;
            case 16,17:
                System.out.println("vous etes mineur");
                break;
                case 18,19,20,21,22,23,24:
                    System.out.println("vous etes majeur");
                    break;
                    case 25,26,27,28,29,30:
                        System.out.println("vous etes jeune adulte");
                        break;
                        case 31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49:
                        System.out.println("vous etes adulte");
                        break;
                        case 50,51,52,53,54,55,56,57,58,59:
                            System.out.println("vous etes d'age mur");
                            break;
                            case 60:
                                System.out.println("vous etes senior");
                                break;
                        default:
                            System.out.println("age non reconnu");
        }
    }
}
