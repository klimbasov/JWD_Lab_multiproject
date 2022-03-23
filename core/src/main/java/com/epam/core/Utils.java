package com.epam.core;

import java.util.Arrays;

public class Utils {
    public static boolean isAllPositiveNumbers(String... strArr) {
        return Arrays.stream(strArr).allMatch(com.epam.utils.StringUtils::isPositiveNumber);
    }
}
