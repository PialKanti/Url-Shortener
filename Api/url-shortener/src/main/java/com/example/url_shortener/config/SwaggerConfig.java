package com.example.url_shortener.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        OpenAPI openAPI = new OpenAPI();
        openAPI.setInfo(apiInfo());
        return openAPI;
    }

    private Info apiInfo() {
        Info info = new Info();
        info.setTitle("Url Shortener");
        info.setDescription("Url Shortener service demo");
        info.setContact(apiContact());
        info.setVersion("0.0.1");
        info.setLicense(apiLicense());
        info.setTermsOfService("Terms of Services");
        return info;
    }

    private Contact apiContact() {
        Contact contact = new Contact();
        contact.setName("Pial Kanti Samadder");
        contact.setEmail("pialkanti2012@gmail.com");
        return contact;
    }

    private License apiLicense() {
        License license = new License();
        license.setName("MIT License");
        license.setUrl("https://opensource.org/license/mit/");
        return license;
    }
}
