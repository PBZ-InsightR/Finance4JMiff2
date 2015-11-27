package com.pbz4esilv.model;

import java.util.Date;
import java.util.Random;

public class Equity {

    //Attribut
    private String name;
    private String ticker;
    private double price;
    private double volatility;
    private Date dateValuation ;
    private double dividend;
    private double weight;
    private double nextNextGaussian;
    private boolean haveNextNextGaussian = false;

    //Constructeur
    public Equity(String name,String ticker, double price,double volatility, Date dateValuation, double dividend , double weight) {
        this.name = name ;
        this.ticker = ticker;
        this.price = price ;
        this.volatility = volatility ;
        this.dateValuation = dateValuation;
        this.dividend = dividend;
        this.weight=weight;
    }

    // LOI NORMALE
    public double loi_normale(double m, double s){
        double x1,x2,y;
        x1 = loi_uniforme();
        x2 = loi_uniforme();

        // methode de Boc-Muller
        y = Math.pow(-2*Math.log(x1),0.5)*Math.cos(2.* 3.*x2);
        return m + s*y;
    }

    public double  blackScholes(double s0,double dateValuation,double k,double r,double volatility,char choix)
    {
        //s0 la valeur actuelle de l'action sous-jacente
        // dateValuation le temps qu'il reste à l'option avant son echeance (exprimee en annees)
        // k prix de l'exercice fixe par l'option
        //r le taux d'interet sans risque
        // volatility est la volatitile de l'action
        //Calculates d1 and d2
       double d1 = (Math.log(s0/k) +
                (r + Math.pow(volatility, 2)/2)*dateValuation)/(volatility*Math.sqrt(dateValuation));
       double d2 = (Math.log(s0/k) +
                (r - Math.pow(volatility, 2)/2)*dateValuation)/(volatility*Math.sqrt(dateValuation));

//Checks if the option is a call or put option and hence, calculates the value of the
//option using the Black-Scholes formula
        double result;
        if(choix=='c')

         return  result = (s0*loi_normale(0, d1)) -
                    (k*Math.exp(-r*dateValuation)*loi_normale(0,d2));
        else
            result = (s0*Math.exp(-r*dateValuation)*loi_normale(0,-d2))
                    - (k*loi_normale(0,-d1));

        return 0;
    }

    public String getName() {
        return this.name;
    }                       //retourne le nom
    public double getPrice() {
        return this.price;
    }                     //retourne le prix
    public String getTicker() {
        return this.ticker;
    }                   //retourne le symbole
    public double getVolatility() {
        return this.volatility;
    }           //retourne la volatilite
    public Date getDateValuation() {
        return this.dateValuation;
    }       //retourne la date
    public double getDividend() {
        return this.dividend;
    }               //retourne le nombre de dividendes
    public double getWeight() {return this.weight;}                     //retourne le volume


    //loi gaussienne
    synchronized public double nextGaussian() {
        Random randomno = new Random();
        if (haveNextNextGaussian) {
            haveNextNextGaussian = false;
            return nextNextGaussian;
        } else {
            double v1, v2, s;
            do {
                v1 = 2 * randomno.nextDouble() - 1; // between -1 and 1
                v2 = 2 * randomno.nextDouble() - 1; // between -1 and 1
                s = v1 * v1 + v2 * v2;
            } while (s >= 1 || s == 0);
            double multiplier = StrictMath.sqrt(-2 * StrictMath.log(s)/s);
            nextNextGaussian = v2 * multiplier;
            haveNextNextGaussian = true;
            return v1 * multiplier;
        }
    }

    // LOI UNIFORME
    public double loi_uniforme() {
        Random r = new Random();
        double s = r.nextInt(100);
        return s;
    }

    //Monte Carlo
    public double call(double S, double X, double r, double sigma, double T) {
        int N = 10000;
        double sum = 0.0;
        for (int i = 0; i < N; i++) {
            double eps = nextGaussian();
            double price = S * Math.exp(r*T - 0.5*sigma*sigma*T + sigma*eps*Math.sqrt(T));
            double value = Math.max(price - X, 0);
            sum += value;
        }
        double mean = sum / N;
        return Math.exp(-r*T) * mean;
    }


}

