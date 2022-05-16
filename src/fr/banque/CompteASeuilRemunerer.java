package fr.banque;

import fr.interfaces.ICompteASeuil;
import fr.interfaces.ICompteRemunere;

public class CompteASeuilRemunerer extends CompteRemunere implements ICompteASeuil {
    private double seuil;

    public CompteASeuilRemunerer() {
    }

    public CompteASeuilRemunerer(double solde, int numero, double taux, double seuil) throws Exception {
        super(solde, numero, taux);
        this.seuil = seuil;
    }


    public void retirer(double montant) throws Exception {
        if (getSolde() - montant < 0 - seuil) throw new Exception("Solde insuffisant");
        super.retirer(montant);
    }

    @Override
    public double getSeuil() {
        return seuil;
    }

    @Override
    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    @Override
    public String toString() {
        return "CompteASeuilRemunerer{" +
                "solde=" + getSolde() +
                ", numero=" + getNumero() +
                ", taux=" + getTaux() +
                ", seuil=" + seuil +
                '}';
    }
}
