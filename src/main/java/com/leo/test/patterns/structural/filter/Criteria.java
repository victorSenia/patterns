package com.leo.test.patterns.structural.filter;

import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
