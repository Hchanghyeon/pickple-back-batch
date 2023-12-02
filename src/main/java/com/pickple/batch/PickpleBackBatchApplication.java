package com.pickple.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class PickpleBackBatchApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(PickpleBackBatchApplication.class, args);
        } catch (Exception e) {
            log.error("[batch] error: ", e);
        }
    }
}
