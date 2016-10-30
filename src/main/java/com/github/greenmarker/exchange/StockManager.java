package com.github.greenmarker.exchange;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kamil on 2016-10-29.
 */
public class StockManager {

    public List<Stock> stocks = createSampleStocks();

    public List<Stock> getStocks() {
        return stocks;
    }

    private List<Stock> createSampleStocks() {
        List<Stock> list = new ArrayList<>();
        list.add(new Stock("Name", "Symbol", "Sector", 100));
        return list;
    }
}
