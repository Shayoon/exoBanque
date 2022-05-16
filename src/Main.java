import fr.banque.Client;
import fr.banque.Compte;

public class Main {
    public static void main(String[] args) {
        try {
            Client quentin = new Client("Quentin", "Degorgue", 24, 125);
            Compte compte1 = new Compte(50, 1);
            Compte compte2 = new Compte(60, 2);
            Compte compte3 = new Compte(70, 3);
            Compte compte4 = new Compte(80, 4);
            Compte compte5 = new Compte(90, 5);
            Compte compte6 = new Compte(100, 6);

            quentin.ajouterCompte(compte1);
            quentin.ajouterCompte(compte2);
            quentin.ajouterCompte(compte3);
            quentin.ajouterCompte(compte4);
            quentin.ajouterCompte(compte5);
            quentin.ajouterCompte(compte6);
            System.out.println(quentin);
            quentin.getCompte(4).ajouter(200);
            System.out.println(quentin);

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
