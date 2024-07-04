package com.untilwed.studyingjpa.config;

import jakarta.persistence.EntityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JpaBookConfig {

    private final EntityManager em;

    public JpaBookConfig(EntityManager em) {
        this.em = em;
    }





}
