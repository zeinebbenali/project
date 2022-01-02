package com.boot.demo.jobs;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SchedulerRdv {

    @Value("${url_connect}")
    public String url_connect;
    @Scheduled(fixedDelay = 900000)
    public void test() throws Exception {
        /* Start of Fix */
        System.out.println("Start scheduler" + url_connect);

    }

}
