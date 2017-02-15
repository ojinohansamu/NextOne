package com.example.hoh.dao;

import com.example.hoh.dto.MarketDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by HOH on 2/12/2017.
 */

public class MarketDAOStub implements IMarketDAO {
    @Override
    public List<MarketDTO> fetchMarkets(String searchTerm) {
        //declare our return type
        List<MarketDTO> allMarkets = new ArrayList<MarketDTO>();

        //Populate for prototyping
        MarketDTO albany = new MarketDTO();
        albany.setMarket_id("AL");
        albany.setMarket_description("Albany");
        allMarkets.add(albany);

        MarketDTO bayShore = new MarketDTO();
        bayShore.setMarket_id("BS");
        bayShore.setMarket_description("Bay Shore");
        allMarkets.add(bayShore);

        MarketDTO greenwich = new MarketDTO();
        greenwich.setMarket_id("GR");
        greenwich.setMarket_description("Greenwich");
        allMarkets.add(greenwich);

        return allMarkets;
    }
}
