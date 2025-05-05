package com.example.url_shortener.util;

import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class DateUtil {
    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }
}
