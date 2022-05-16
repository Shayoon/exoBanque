package fr.banque;

import fr.interfaces.ICompteRemunere;

public class CompteRemunere extends Compte implements ICompteRemunere {
    private double taux;

    public CompteRemunere() {
    }

    public CompteRemunere(double solde, int numero, double taux) throws Exception {
        super(solde, numero);
        this.setTaux(taux);
    }

    public double getTaux() {
        return taux;
    }

    public void setTaux(double taux) throws Exception {
        if (taux > 1 || taux < 0) throw new Exception ("Le taux n'est pas entre 1 et 0");
        this.taux = taux;
    }

    @Override
    public String toString() {
        return "CompteRemunere{" +
                "solde=" + getSolde() +
                ", numero=" + getNumero() +
                ", taux=" + taux +
                '}';
    }

    public double calculerInterets(){
        return getSolde()*taux;
    }

    public void verserInterets(){
        ajouter(calculerInterets());
    }


}
