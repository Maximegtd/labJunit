package org.lab;

public class CompteBancaire {
    private double solde;

    private Calculatrice c = new Calculatrice();

    public CompteBancaire(double solde) {
        this.solde = solde;
    }

    public double debiter(double montant) {
        if (montant > solde) {
            throw new IllegalArgumentException("Solde insuffisant");
        }
        solde = c.soustraction(solde, montant);
        return solde;
    }

    public double crediter(double montant) {
        if (montant < 0) {
            throw new IllegalArgumentException("Montant négatif");
        }
        solde = c.somme(solde, montant);
        return solde;
    }
}
