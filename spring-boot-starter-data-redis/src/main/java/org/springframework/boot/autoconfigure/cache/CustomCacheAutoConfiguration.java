/*
 * Copyright 2017-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.boot.autoconfigure.cache;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.data.redis.CustomRedisAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

/**
 * Custom {@link CacheAutoConfiguration}
 */
@Configuration
@EnableConfigurationProperties(CustomCacheProperties.class)
@AutoConfigureBefore(CacheAutoConfiguration.class)
@AutoConfigureAfter(CustomRedisAutoConfiguration.class)
@Import(CustomRedisCacheConfiguration.class)
public class CustomCacheAutoConfiguration extends CacheAutoConfiguration {
	
	/**
	 * {@link CustomCacheProperties}
	 * 
	 * @return {@link CustomCacheProperties}
	 */
	@Bean
	@Primary
	public CustomCacheProperties cacheProperties() {
		
		return new CustomCacheProperties();
	}
}