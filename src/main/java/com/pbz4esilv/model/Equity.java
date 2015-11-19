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
    }           //retourne la volatilit�
    public Date getDateValuation() {
        return this.dateValuation;
    }       //retourne la date
    public double getDividend() {
        return this.dividend;
    }               //retourne le nombre de dividendes
    public double getWeight() {return this.weight;}                     //retourne le volume


    //loi gaussienne
    private double nextNextGaussian;
    private boolean haveNextNextGaussian = false;
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
        double i = r.nextInt(100);
        return i;
    }
    // LOI NORMALE
    public double _loi_normale(double m, double s){
        double x1,x2,y;
        x1 = loi_uniforme();
        x2 = loi_uniforme();

        // methode de Boc-Muller
        y = Math.pow(-2*Math.log(x1),0.5)*Math.cos(2.* 3.*x2);
        return m + s*y;
    }
}
