package com.bolsadeidas.springboot.web.app;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:messages.properties")             //aqui se pueden agregar mas archivos properties
})
public class MessagesPropertiesConfig {
}
