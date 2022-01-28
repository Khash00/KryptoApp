package com.company.business;

import com.google.gson.JsonObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class DataManipulation {

    public static void winnersAndLosers24h(CryptoCurrencyRepository cryptoCurrencyRepository)
        {
            HashMap<String, Double> keyAndPercentageMap = new HashMap<>();

            for (JsonObject jsonObject : cryptoCurrencyRepository.getJsonObjectHashMap().values())
            {
                keyAndPercentageMap.put(jsonObject.get("id").getAsString(), jsonObject.get("price_change_percentage_24h").getAsDouble());
            }

            Map<String , Double> sortedByPercentageMap =
                    keyAndPercentageMap.entrySet().stream()
                            .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                            .collect(Collectors.toMap(
                                    Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

            int counter = 1;
            for (String k : sortedByPercentageMap.keySet()) {

                System.out.println(counter + ". " + k + " | " + sortedByPercentageMap.get(k));
                counter++;
            }
        }
}
