package org.mengyun.springcloud.sample1.config;

import org.mengyun.springcloud.sample1.entity.Result;
import org.mengyun.tcctransaction.feign.enhance.FeignResponseHandler;

/**
 * @author xiaobzhou
 * date 2019-03-12 0:50
 */
public class MyFeignResponseHandler implements FeignResponseHandler {

    @Override
    public void handle(Object feignRes) {
        if (feignRes instanceof Result) {
            Result result = (Result) feignRes;
            if (!result.isSuccess()) {
                throw new RuntimeException(result.getMessage());
            }
        }
    }
}