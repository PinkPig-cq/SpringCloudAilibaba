package com.hpeu.userprovider.userprovider.configure;

import org.springframework.cache.CacheManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;

import java.time.Duration;

@Configuration
public class RedisConfigure {
    @Bean
    public CacheManager redisCacheManager(RedisConnectionFactory factory){
//      Redis缓存的配置信息
        RedisCacheConfiguration configuration = RedisCacheConfiguration
                                                .defaultCacheConfig() //默认配置
                                                //缓存持续时间
                                                .entryTtl(Duration.ofMillis(30))
                                                .disableCachingNullValues(); //失效缓存设置为null

        //使用builder设计模式构建一个redis缓存
        return RedisCacheManager
                .builder(factory) //连接
                .cacheDefaults(configuration) //使用上面的配置
                .transactionAware()
                .build();
    }
}
