package com.lll.url.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ConfigurationProperties(prefix = "user")
@Component
@PropertySource(value={"classpath:/user.properties"})
public class Person {
//    @Value("${person.name}")
    private String name;
//    @Value("${person.age}")
    private String age;

}
