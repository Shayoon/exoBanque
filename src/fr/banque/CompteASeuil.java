package fr.banque;

import fr.interfaces.ICompteASeuil;

public class CompteASeuil extends Compte implements ICompteASeuil {

    private double seuil;

    public CompteASeuil() {
    }

    public CompteASeuil(double solde, int numero, double seuil) throws Exception {
        super(solde, numero);
        this.seuil = seuil;
    }

    public double getSeuil() {
        return seuil;
    }

    public void setSeuil(double seuil) {
        this.seuil = seuil;
    }

    public void retirer(double montant) throws Exception {
        if (getSolde() - montant < 0 - seuil) throw new Exception("Solde insuffisant");
        super.retirer(montant);
    }

    @Override
    public String toString() {
        return "CompteASeuil{" +
                "solde=" + getSolde() +
                ", numero=" + getNumero() +
                ", seuil=" + seuil +
                '}';
    }

}
