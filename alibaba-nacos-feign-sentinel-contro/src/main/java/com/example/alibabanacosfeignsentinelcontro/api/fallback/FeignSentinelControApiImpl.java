package com.example.alibabanacosfeignsentinelcontro.api.fallback;

import com.example.alibabanacosfeignsentinelcontro.api.FeignSentinelControApi;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author Administrator
 * @date 2021/8/20
 */
@Component
public class FeignSentinelControApiImpl implements FeignSentinelControApi {
    @Override
    public String test(String name) {
        return "失败了 from sentinel-contro";
    }
}
