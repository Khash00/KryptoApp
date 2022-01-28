package com.company.business;

import java.util.ArrayList;

public class CryptoCurrencyList {

    private ArrayList<String> CRYPTO_CURRENCY_LIST = new ArrayList<>();

    public CryptoCurrencyList()
    {
        ArrayList<String> list = new ArrayList<>();
        list.add("bitcoin");
        list.add("ethereum");
        list.add("solana");
        list.add("dogecoin");
        list.add("shiba-inu");
        list.add("cardano");
        list.add("tether");
        list.add("ripple");
        list.add("helium");
        list.add("axie-infinity");
        CRYPTO_CURRENCY_LIST = list;
    }

    public ArrayList<String> getCRYPTO_CURRENCY_LIST() {
        return CRYPTO_CURRENCY_LIST;
    }
}
