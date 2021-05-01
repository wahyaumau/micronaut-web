package com.wahyaumau;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class SampleController {

    @Get("/")
    public ApiResponse hello(){
        return new ApiResponse(200, "Hello");
    }

    @Get("/health")
    public ApiResponse health(){
        return new ApiResponse(200, "on");
    }

}
