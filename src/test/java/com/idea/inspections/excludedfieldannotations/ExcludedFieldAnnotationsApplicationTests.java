package com.idea.inspections.excludedfieldannotations;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Clock;
import java.time.LocalDate;

@SpringBootTest
class ExcludedFieldAnnotationsApplicationTests
{

    @Autowired
    private Clock clock;

    @Test
    public void testTime()
    {
        Assert.assertTrue(LocalDate.now(clock).isAfter(LocalDate.of(2019, 6, 1)));
    }

}
