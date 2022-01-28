package com.company.business;

import com.company.dataAccess.GetJsonData;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.ArrayList;

public class CryptoCurrencyRepository
{
    ArrayList<JsonObject> jsonObjectArrayList = new ArrayList<>();

    public CryptoCurrencyRepository() {
        saveCoinJsonObjects();
    }

    private void saveCoinJsonObjects()
    {
        CryptoCurrencyList cryptoCurrencyList = new CryptoCurrencyList();
            // %2 = "," in http request
        String commaSeparatedList = String.join("%2", cryptoCurrencyList.getCRYPTO_CURRENCY_LIST());
        JsonArray jsonArray = GetJsonData.getJsonArray(commaSeparatedList);
        for (JsonElement e: jsonArray)
        {
            jsonObjectArrayList.add(e.getAsJsonObject());
        }
    }

    public void filterInformation()
    {
        for (JsonObject jsonObject : jsonObjectArrayList )
        {
            String coinName = jsonObject.get("name").getAsString();
            String currentPriceUSD = jsonObject.get("current_price").getAsString();
            String volume = jsonObject.get("total_volume").getAsString();

            System.out.println(coinName + " | " + currentPriceUSD + " | " + volume);
        }
    }

}
