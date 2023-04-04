package org.example.service;

import lombok.extern.slf4j.Slf4j;

import java.util.logging.Level;
import java.util.logging.Logger;

@Slf4j
public class TestService {

    private Logger logger;

    public void calculateNumber() {
        try {
            int j = 300;

            int k = 0;
            for (int i = 0; i < 100; i++) {
                k = i + j;

                if (i == 20) {
                    throw new Exception("dd");
                }
            }
        } catch (Exception e) {
            logger.info("a aparut o eroare cand am facut urmatoarele operatii");
            logger.log(Level.SEVERE, "severr!!");
            e.printStackTrace();
        }
    }
}

sealed class Animal permits Caine {

    private String name;
}

final class Caine extends Animal {

    private Integer varsta;
}