package com.camunda.trail;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication("connectidentitymanagement")
public class CamundaApplication {

  public static void main(String... args) {
    
    SpringApplication.run(CamundaApplication.class, args);

  }

}
