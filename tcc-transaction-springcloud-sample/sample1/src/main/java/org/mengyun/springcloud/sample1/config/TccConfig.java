package org.mengyun.springcloud.sample1.config;

import org.mengyun.tcctransaction.feign.enhance.FeignResponseHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author xiaobzhou
 * date 2019-03-12 0:49
 */
@Configuration
public class TccConfig {

    @Bean
    public FeignResponseHandler feignResponseHandler() {
        return new MyFeignResponseHandler();
    }
}