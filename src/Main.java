import fr.banque.*;

public class Main {
    public static void main(String[] args) {
        try {
            Client quentin = new Client("Quentin", "Degorgue", 24, 125);
            Compte compte1 = new Compte(50, 1);
            CompteASeuilRemunerer compteASeuilRemunerer = new CompteASeuilRemunerer(150, 145,0.25,150);
            quentin.ajouterCompte(compteASeuilRemunerer);
            compteASeuilRemunerer.verserInterets();
            quentin.getCompte(1555);
            System.out.println(compteASeuilRemunerer);
            compteASeuilRemunerer.retirer(200);
            System.out.println(compteASeuilRemunerer);
            compteASeuilRemunerer.retirer(200);
            System.out.println(compteASeuilRemunerer);



//            Compte compte2 = new Compte(60, 2);
//            Compte compte3 = new Compte(70, 3);
//            Compte compte4 = new Compte(80, 4);
//            Compte compte5 = new Compte(90, 5);
//            Compte compte6 = new Compte(100, 6);
//
//            quentin.ajouterCompte(compte1);
//            quentin.ajouterCompte(compte2);
//            quentin.ajouterCompte(compte3);
//
//            System.out.println(quentin);
//            CompteRemunere cr = new CompteRemunere(50,122,0.2);
//            quentin.ajouterCompte(cr);
//            System.out.println(quentin);
//            cr.verserInterets();
//            cr.verserInterets();
//            System.out.println(quentin.getCompte(122));
//
//            CompteASeuil cas = new CompteASeuil(100,155,100);
//            quentin.ajouterCompte(cas);
//            cas.retirer(120);
//            System.out.println(cas);
//            cas.retirer(120);

        } catch (Exception e){
            System.out.println(e);
        }

    }
}
