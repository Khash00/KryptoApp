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
        CRYPTO_CURRENCY_LIST = list;
    }

    public ArrayList<String> getCRYPTO_CURRENCY_LIST() {
        return CRYPTO_CURRENCY_LIST;
    }
}
