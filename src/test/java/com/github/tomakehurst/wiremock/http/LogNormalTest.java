package com.github.tomakehurst.wiremock.http;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class LogNormalTest {

    @Test
    public void sampleLogNormal() {
        LogNormal distribution = new LogNormal(90.0, 0.39);

        List<Long> values = new ArrayList<Long>();
        for (int i = 0; i < 100; i++) {
            values.add(distribution.sampleMillis());
        }
        // To automate we would need something like a normality test.
        // For our purposes, manual verification is sufficient.
        System.out.println("values = " + values);
    }
}
