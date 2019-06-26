package com.idea.inspections.excludedfieldannotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.Clock;
import java.time.ZoneId;

@SpringBootApplication
public class ExcludedFieldAnnotationsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(ExcludedFieldAnnotationsApplication.class, args);
    }

    @Bean
    public Clock systemDefaultZoneClock()
    {
        return Clock.system(ZoneId.systemDefault());
    }

}
