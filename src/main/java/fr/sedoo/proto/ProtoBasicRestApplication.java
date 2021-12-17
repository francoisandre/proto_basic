package fr.sedoo.proto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.github.lalyos.jfiglet.FigletFont;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableScheduling
@EnableAsync
@Slf4j
@EnableEurekaClient
@ComponentScan(basePackages = { "fr.sedoo" })
public class ProtoBasicRestApplication {
	public static void main(String[] args) {
		log.info("\n"+FigletFont.convertOneLine("<<< Proto Basic >>>"));
		SpringApplication.run(ProtoBasicRestApplication.class, args);
	}
}