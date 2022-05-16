package fr.banque;

import fr.interfaces.Icompte;

public class Compte implements Icompte{

    private double solde;
    private int numero;


    public Compte() {
    }

    public Compte(double solde, int numero) throws Exception {
        this.setSolde(solde);
        setNumero(numero);
    }

    public void setSolde(double solde) throws Exception {
        if (solde < 0) throw new Exception("un solde ne peut etre négatif");
        this.solde=solde;
    }

    public double getSolde() {
        return solde;
    }

    public int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }


    public void ajouter(double montant) {
        this.solde += montant;
    }


    public void retirer(double montant) throws Exception {
        this.solde -= montant;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Compte compte = (Compte) o;
        return Double.compare(compte.solde, solde) == 0 && numero == compte.numero;
    }


    @Override
    public String toString() {
        return "Compte{" +
                "solde=" + solde +
                ", numero=" + numero +
                '}';
    }
}
