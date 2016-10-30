package com.github.greenmarker.exchange;

import java.util.Date;

/**
 * Created by Kamil on 2016-10-29.
 */
public class Quote {

    private int price;
    private int change;
    private Date date;
    private Stock stock;

    public Quote() {
    }

    public Quote(int price) {
        this.price = price;
        this.change = 0;
        this.date = new Date();
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }
}
