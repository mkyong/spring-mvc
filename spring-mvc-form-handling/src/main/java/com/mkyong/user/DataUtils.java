package com.mkyong.user;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DataUtils {

    public static final List<String> FRAMEWORKS_LIST = Arrays.asList("Spring", "Struts 2", "JSF", "GWT");
    public static final List<Integer> NUMBERS = Arrays.asList(1, 2, 3, 4, 5);
    public static final Map<String, String> SKILLS = createListOfSkills();
    public static final Map<String, String> COUNTRY = createListOfCountry();

    private static Map<String, String> createListOfSkills() {
        Map<String, String> skills = new LinkedHashMap<>();
        skills.put("Hibernate", "Hibernate");
        skills.put("Spring", "Spring");
        skills.put("Struts", "Struts");
        skills.put("Groovy", "Groovy");
        skills.put("Grails", "Grails");
        return skills;
    }

    private static Map<String, String> createListOfCountry() {
        Map<String, String> country = new LinkedHashMap<>();
        country.put("US", "United Stated");
        country.put("CN", "China");
        country.put("SG", "Singapore");
        country.put("MY", "Malaysia");
        return country;
    }

}
