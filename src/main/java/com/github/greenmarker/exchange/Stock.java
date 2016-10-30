package com.github.greenmarker.exchange;

import java.util.List;

/**
 * Created by Kamil on 2016-10-29.
 */
public class Stock {

    private String name;
    private String symbol;
    private String sector;
    private List<Quote> quotes;
    private Quote lastQuote;

    public Stock() {
    }

    public Stock(String name, String symbol, String sector, int price) {
        this.name = name;
        this.symbol = symbol;
        this.sector = sector;
        this.lastQuote = new Quote(price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public List<Quote> getQuotes() {
        return quotes;
    }

    public void setQuotes(List<Quote> quotes) {
        this.quotes = quotes;
    }

    public Quote getLastQuote() {
        return lastQuote;
    }

    public void setLastQuote(Quote lastQuote) {
        this.lastQuote = lastQuote;
    }
}
