package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.willbrom.javalib.JokeTeller;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /** A simple endpoint method that gets a joke from javalib.JokeTeller and returns it */
    @ApiMethod(name = "getJokeFromServer")
    public MyBean getJokeFromServer() {
        MyBean response = new MyBean();
        response.setData(JokeTeller.getJoke());

        return response;
    }

}
