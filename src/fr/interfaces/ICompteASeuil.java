package fr.interfaces;

public interface ICompteASeuil {
    public void retirer(double valeur) throws Exception;
    public double getSeuil();
    public void setSeuil(double seuil);
}
