    package sn.dev.bankjeel3glg2.metier;

    public class CreditMetierImpl implements ICreditMetier{

        @Override
        public double calculMensualiteCredit(double montant, int duree, double taux) {
            double t = taux/12;
            double t1 = montant * t;
            double t2= 1 - Math.pow((1+t), -duree);
            double result = t1/t2;
            return  result;
        }
    }
