package demoException;

public class Compte {

    private String numero;
    private double solde;

    public Compte(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSolde() {
        return solde;
    }

    private void setSolde(double solde) {
        this.solde = solde;
    }

    public void depot(double montant) throws Exception {
        if(montant < 0){
            throw new RuntimeException("Le montant doit etre positif");
        }
        setSolde(getSolde() + montant);
    }

    public void retrait(double montant){
        if(montant < 0){
            throw new IllegalArgumentException("Le montant doit etre positif");
        }
        if(montant > this.solde){
            throw new SoldeInsufisantException();
        }
        setSolde(getSolde() - montant);
    }
}
