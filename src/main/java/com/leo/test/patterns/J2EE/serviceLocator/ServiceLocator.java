package com.leo.test.patterns.J2EE.serviceLocator;

/**
 * Created by Senchenko Victor on 01.11.2017.
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }

        InitialContext context = new InitialContext();
        service = (Service) context.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
