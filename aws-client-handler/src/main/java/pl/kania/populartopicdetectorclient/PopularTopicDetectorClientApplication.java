package pl.kania.populartopicdetectorclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication
public class PopularTopicDetectorClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(PopularTopicDetectorClientApplication.class, args);
    }

}