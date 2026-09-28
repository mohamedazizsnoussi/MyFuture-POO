
import java.util.Scanner;

public class Appbanque {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int cin;
        String Nom;
        String Prenom;
        int NCompte;
        final double plafond_retrait = 500.000;
        System.out.println("Veuillez saisir le CIN :");
        cin = scanner.nextInt();
        scanner.nextLine();
        System.out.println("CIN : " + cin);
        System.out.println("Veuillez saisir le Nom :");
        Nom = scanner.nextLine();
        System.out.println("Nom : " + Nom);
        System.out.println("Veuillez saisir le Prenom :");
        Prenom = scanner.nextLine();
        System.out.println("Prenom : " + Prenom);
        System.out.println("Veuillez saisir le Numero de Compte :");
        NCompte = scanner.nextInt();
        System.out.println("Numero de Compte : " + NCompte);
    }
}


