package com.localizationpoc.javalocalizationpoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class LocaleDemoController {

    @Autowired
    private MessageSource messageSource;


    @GetMapping("/greeting")
    public String sayHello(
            @RequestHeader(name = "Accept-Language", required = false) Locale locale
            ) {
        System.out.println("Locale:" + locale);

//      Setting Default Locale if Header is absent
        if(locale == null){
            locale = Locale.FRANCE;
        }
        return messageSource.getMessage("greeting", null, locale);
    }
}
