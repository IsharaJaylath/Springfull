package com.springhello.springhello;

import com.springhello.springhello.web.i18n.I18NService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

@SpringBootTest
class SpringhelloApplicationTests {

    @Test
    void contextLoads() {
    }
    @Autowired
    private I18NService i18NService;
    @Test
    public void testMessageByLocaleService() throws Exception{
        String expextedResult ="Bootstrap Starter Template";
        String messageId ="index.main.callout";
        String actual=i18NService.getMessage(messageId);
        Assertions.assertEquals("Bootstrap Starter Template",expextedResult,actual);
    }

}
