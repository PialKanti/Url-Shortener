package com.example.url_shortener.util;

import com.newrelic.api.agent.Trace;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class DateUtil {
    @Trace
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }
}
