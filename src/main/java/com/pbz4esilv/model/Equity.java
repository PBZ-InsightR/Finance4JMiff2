package com.pbz4esilv.model;

import java.util.Date;

public class Equity {

    private String name;
    private String ticker;
    private double price;
    private double volatility;
    private Date dateValuation ;
    private double dividend;
    private double weight;

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
    }
    public double getPrice() {
        return this.price;
    }
    public String getTicker() {
        return this.ticker;
    }
    public double getVolatility() {
        return this.volatility;
    }
    public Date getDateValuation() {
        return this.dateValuation;
    }
    public double getDividend() {
        return this.dividend;
    }
    public double getWeight() {return this.weight;}


public int blackScholes(double price,double volatility,double weight,double X,double maturity)//pricer blacksholes
{
   // int d1 = (Math.log(price/exercisePrice) +
          //  (interest + Math.pow(volatility, 2)/2)*maturity)/(volatility*Math.sqrt(maturity));
   // int  d2 = (Math.log(price/exercisePrice) +
         //   (interest - Math.pow(volatility, 2)/2)*maturity)/(volatility*Math.sqrt(maturity));

   // if(callSelected)
       // result = (stockPrice*BlackScholes.normalCdf(d1)) -
        //        (exercisePrice*Math.exp(-interest*maturity)*BlackScholes.normalCdf(d2));
  //  else
       // result = (exercisePrice*Math.exp(-interest*maturity)*BlackScholes.normalCdf(-d2))
              //  - (stockPrice*BlackScholes.normalCdf(-d1));
return 0;
}