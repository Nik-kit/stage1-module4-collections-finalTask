package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Set<String>> entry : projects.entrySet()) {
            for(String element : entry.getValue()){
                if (element.equals(developer)) {
                    list.add(entry.getKey());
                }
            }
        }

        list.sort(Comparator.comparingInt(String::length));
        Collections.reverse(list);

        return list;
    }
}

