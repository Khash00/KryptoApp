package com.company.business;

import com.company.dataAccess.GetJsonData;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

import java.util.HashMap;

public class CryptoCurrencyRepository
{
   private HashMap<String, JsonObject> jsonObjectHashMap = new HashMap<>();

   public HashMap<String, JsonObject> getJsonObjectHashMap() {
        return jsonObjectHashMap;
    }

    public CryptoCurrencyRepository() {
        saveCoinJsonObjects();
    }

    private void saveCoinJsonObjects()
    {
        CryptoCurrencyList cryptoCurrencyList = new CryptoCurrencyList();
            // %2 = "," in http request
        String commaSeparatedList = String.join("%2C", cryptoCurrencyList.getCRYPTO_CURRENCY_LIST());
        JsonArray jsonArray = GetJsonData.getJsonArray(commaSeparatedList);

        for (JsonElement e: jsonArray)
        {
            JsonObject jsonObject = e.getAsJsonObject();
            jsonObjectHashMap.put(jsonObject.get("id").getAsString(), jsonObject);
        }
    }

    public void filterInformation()
    {
        for (JsonObject jsonObject : jsonObjectHashMap.values())
        {
            String coinName = jsonObject.get("name").getAsString();
            String currentPriceUSD = jsonObject.get("current_price").getAsString();
            String volume = jsonObject.get("total_volume").getAsString();

            System.out.println(coinName + " | " + currentPriceUSD + " | " + volume);
        }
    }


}
