package com.javastream.optinal;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {

    public PhoneBook() {

    }
    public HashMap<String, String> getPhoneBookEntries(){
        return phoneBookEntries;
    }

    private static final HashMap<String, String> PHONE_NUMBERS = new HashMap<String, String>(){
        {
            put("Ahmet","05555568900"); //null NullPointerException
            put("Mehmet","05555568900");
            put("Ali","05545568900");
            put("Fatma","05315568900");
        }
    };
    private HashMap<String, String> phoneBookEntries = PHONE_NUMBERS;

    @Override
    public String toString() {
        return "PhoneBook{" +
                "phoneBookEntries=" + phoneBookEntries +
                '}';
    }

    public Optional<String> findPhoneByName(String name){
        return Optional.ofNullable(PHONE_NUMBERS.get(name));
    }

    public Optional<String> findNameByPhoneNumber(String phoneNumber){
        return PHONE_NUMBERS.entrySet()
                .stream()
                .filter(entry -> entry.getValue().equals(phoneNumber))
                .map(Map.Entry::getKey)
                .findFirst();

    }
}



