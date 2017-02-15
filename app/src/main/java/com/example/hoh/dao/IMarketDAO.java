package com.example.hoh.dao;

import com.example.hoh.dto.MarketDTO;

import java.util.List;

/**
 * Created by HOH on 2/12/2017.
 */
public interface IMarketDAO {
    List<MarketDTO> fetchMarkets(String searchTerm);
}
