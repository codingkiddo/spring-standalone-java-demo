package com.example.profiles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.CacheManager;
import org.springframework.cache.concurrent.ConcurrentMapCacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class CacheConfigDev {

	private static final Logger LOGGER = LoggerFactory.getLogger(CacheConfigDev.class);
	
	@Bean
	public CacheManager cunncurrentCacheManager() {
		LOGGER.debug("Cache manager is concurrentMapCacheManager");
		System.out.println("Cache manager is concurrentMapCacheManager");
        return new ConcurrentMapCacheManager("movieFindCache");

	}
}
