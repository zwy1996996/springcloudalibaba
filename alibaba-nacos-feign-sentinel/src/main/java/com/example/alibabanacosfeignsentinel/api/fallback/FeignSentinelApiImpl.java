package com.example.alibabanacosfeignsentinel.api.fallback;

import com.example.alibabanacosfeignsentinel.api.FeignSentinelApi;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@Component
public class FeignSentinelApiImpl implements FeignSentinelApi {
    @Override
    public String test(String name) {
        return "失败了 from sentinel";
    }
}
