package fr.banque;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Client {
    private String nom;
    private String prenom;
    private int age;
    private int numero;

    private List<Compte> listComptes;


    public Client() {
    }

    public Client(String nom, String prenom, int age, int numero) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.numero = numero;
        this.listComptes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public int getNumero() {
        return numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Compte> getListComptes() {
        return listComptes;
    }

    public Compte getCompte(int numeroCompte) {
        for (Compte compte : listComptes) {
            if (compte.getNumero() == numeroCompte)
                return compte;
        }
        System.out.println("Aucun compte correspondant");
        return null;
    }


    public void ajouterCompte(Compte compte) {
        if (listComptes.size() < 5)
            listComptes.add(compte);
        else System.out.println("Trop de compte");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return age == client.age && numero == client.numero && Objects.equals(nom, client.nom) && Objects.equals(prenom, client.prenom) && Objects.equals(listComptes, client.listComptes);
    }

    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                ", numero=" + numero +
                ", listComptes=" + listComptes +
                '}';
    }
}
