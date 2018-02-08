package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

/**
 * Created by VenD on 2/7/2018.
 */
@Component
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig()
    {
        register(UserResources.class);
    }
}
