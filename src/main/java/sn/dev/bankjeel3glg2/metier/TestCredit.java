package sn.dev.bankjeel3glg2.metier;

public class TestCredit {
    public static void main(String[] args) {
        ICreditMetier metier = new CreditMetierImpl();
        double montant = 200000;
        double taux = 4.5;
        int duree = 240;

        double result = metier.calculMensualiteCredit(montant,duree,taux);
        System.out.println("result =" + result);
    }
}
