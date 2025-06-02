package com.example.url_shortener.util;

import com.newrelic.api.agent.Trace;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = lombok.AccessLevel.PRIVATE)
public class Base62Encoder {
    private static final char[] encodingCharSet = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    @Trace
    public static String encode(long number){
        if (number == 0) {
            return String.valueOf(encodingCharSet[0]);
        }

        StringBuilder stringBuilder = new StringBuilder();

        while(number > 0){
            long remainder = number % 62;
            number /= 62;
            stringBuilder.append(encodingCharSet[(int)remainder]);
        }

        return stringBuilder.reverse().toString();
    }
}
