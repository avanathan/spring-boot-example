package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class DeployServiceImpl implements DeployService {
    private static final Logger LOGGER = LoggerFactory.getLogger(DeployServiceImpl.class);

    @Autowired
    Environment env;

    @Override
    public void deploy(DeployConfig config) {
        LOGGER.info("Deploying - Hello World! - hello={}, version={}, envKey={}", config.getHello(), config.getVersion(), config.getEnvKey());
    }
}
