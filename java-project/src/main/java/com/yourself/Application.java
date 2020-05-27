package com.yourself;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by charlotte on 06/06/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        Boolean success = true;
        System.out.println(String.format("TECHIO> success %s", success));
        //SpringApplication.run(Application.class, args);
    }
}
