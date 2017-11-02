package com.leo.test.patterns.structural.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return persons.stream().filter(person1 -> person1.getMaritalStatus().equalsIgnoreCase("SINGLE")).collect(Collectors.toList());
    }
}