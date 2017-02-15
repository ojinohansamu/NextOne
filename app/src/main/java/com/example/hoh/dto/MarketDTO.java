package com.example.hoh.dto;

/**
 * This class represents the attribute that describe a market
 * Created by HOH on 2/12/2017.
 */

public class MarketDTO {
    String market_id;
    String market_description;

    @Override
    public String toString() {
        return market_id + " " + market_description;
    }

    public String getMarket_id() {
        return market_id;
    }

    public void setMarket_id(String market_id) {
        this.market_id = market_id;
    }

    public String getMarket_description() {
        return market_description;
    }

    public void setMarket_description(String market_description) {
        this.market_description = market_description;
    }
}
