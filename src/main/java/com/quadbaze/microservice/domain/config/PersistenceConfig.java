package com.quadbaze.microservice.domain.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author Olatunji O. Longe: Created on (17/07/2018)
 */
@Configuration
@EnableJpaAuditing
@EnableTransactionManagement
@EntityScan(basePackages = {"com.quadbaze.microservice.domain.entities"})
@EnableJpaRepositories(basePackages = {"com.quadbaze.microservice.domain.repositories"})
public class PersistenceConfig {

}
