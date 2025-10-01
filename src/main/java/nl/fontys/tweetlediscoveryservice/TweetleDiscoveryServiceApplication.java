package nl.fontys.tweetlediscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class TweetleDiscoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(TweetleDiscoveryServiceApplication.class, args);
    }

}
