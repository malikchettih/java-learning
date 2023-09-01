package com.gmail.malikchettih.java_learning.java_8.java_8_lambda;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class SortWithLambdaTestCase {

    private final static Logger LOGGER = LoggerFactory.getLogger(SortWithLambdaTestCase.class);

    @Test
    public void testSortingWithLambda(){

        List<Integer> values = new ArrayList<>();
        values.add(100);
        values.add(1);
        values.add(123);
        values.add(87);

        LOGGER.info("Unsorted List is ["+values+"]");
        values.sort((v1, v2) -> v1 - v2);
        LOGGER.info("Sorted List is ["+values+"]");
    }
}
