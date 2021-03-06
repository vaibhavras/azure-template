package com.azure.azuretemplate;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@Slf4j
public class AzureTemplateApplication {




	public static void main(String[] args) {
		SpringApplication.run(AzureTemplateApplication.class, args);
	}

}
