package com.leo.test.patterns.J2EE.interceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<>();

    private Target target;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void execute(String request) {
        for (Filter filter : filters)
            filter.execute(request);
        target.execute(request);
    }

    public void setTarget(Target target) {
        this.target = target;
    }
}