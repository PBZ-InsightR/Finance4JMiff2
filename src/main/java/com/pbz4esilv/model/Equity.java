package com.pbz4esilv.model;

import java.util.Date;

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
    }           //retourne la volatilité
    public Date getDateValuation() {
        return this.dateValuation;
    }       //retourne la date
    public double getDividend() {
        return this.dividend;
    }               //retourne le nombre de dividendes
    public double getWeight() {return this.weight;}                     //retourne le volume
}
