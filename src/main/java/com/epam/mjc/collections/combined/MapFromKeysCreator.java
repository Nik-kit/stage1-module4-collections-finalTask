package com.epam.mjc.collections.combined;

import java.util.*;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {

        Map<Integer, Set<String>> map = new HashMap<>();

        for (Map.Entry<String, Integer> entry : sourceMap.entrySet()) {

            String key = entry.getKey();
            Integer value = entry.getValue();

            if (!map.containsKey(key.length())) {
                Set<String> set = new HashSet<>();
                set.add(key);
                for (Map.Entry<String, Integer> entry2 : sourceMap.entrySet()) {
                    if(!entry2.getValue().equals(value) && entry2.getKey().length() == key.length()){
                        set.add(entry2.getKey());
                    }
                }
                map.put(key.length(), set);
            }
        }
        return map;
    }
}
