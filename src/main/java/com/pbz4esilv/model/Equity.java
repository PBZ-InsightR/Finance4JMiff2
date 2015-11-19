package com.pbz4esilv.model;

import java.util.Date;

public class Equity {

    //Attribut classe Equity
    private String name;
    private String ticker;
    private double price;
    private double volatility;
    private Date dateValuation ;
    private double dividend;
    private double weight;

    //Constructeur de la classe Equity
    public Equity(String name,String ticker, double price,double volatility, Date dateValuation, double dividend , double weight) {
        this.name = name ;
        this.ticker = ticker;
        this.price = price ;
        this.volatility = volatility ;
        this.dateValuation = dateValuation;
        this.dividend = dividend;
        this.weight=weight;
    }

    //Methode classe Equity
    public String getName() {
        return this.name;
    }                                //Retourne le nom de l'action
    public double getPrice() {
        return this.price;
    }                              //Retourne le prix de l'action
    public String getTicker() {
        return this.ticker;
    }                            //Retourne le symbole de l'action
    public double getVolatility() {
        return this.volatility;
    }                    //Retourne la volatility de l'action
    public Date getDateValuation() {
        return this.dateValuation;
    }
    public double getDividend() {
        return this.dividend;
    }                 //Retourne le nombre de dividende de l'action
    public double getWeight() {return this.weight;}                       //Retourne le volume de l'action
}
