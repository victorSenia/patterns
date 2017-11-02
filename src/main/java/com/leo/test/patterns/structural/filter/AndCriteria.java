package com.leo.test.patterns.structural.filter;

import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class AndCriteria implements Criteria {

    private final Criteria criteria;

    private final Criteria otherCriteria;

    public AndCriteria(Criteria criteria, Criteria otherCriteria) {
        this.criteria = criteria;
        this.otherCriteria = otherCriteria;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        return otherCriteria.meetCriteria(criteria.meetCriteria(persons));
    }
}