package com.company;

import com.company.business.CryptoCurrencyRepository;
import com.company.business.DataManipulation;

import java.io.IOException;
//Doku-Link: https://www.coingecko.com/api/documentations/v3#/
//API-Link: api.coingecko.com/api/v3
public class Main {

    public static void main(String[] args) throws IOException {
        CryptoCurrencyRepository cryptoCurrencyRepository = new CryptoCurrencyRepository();
        //cryptoCurrencyRepository.filterInformation();

        DataManipulation.winnersAndLosers24h(cryptoCurrencyRepository);

    }
}
