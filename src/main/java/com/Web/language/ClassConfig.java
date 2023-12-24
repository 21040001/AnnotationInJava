package com.Web.language;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.Web")


public class ClassConfig {

	//Annotationlarda ham xmlda bo'lgani kabi classlarimizni beanlar orqali boshqara olamiz:
	@Bean
	public ILanguageDal language() {
		return new UzbekLan();
	}
	@Bean
	public ILanguageMeneger iLanMen() {
		return new LanguageMeneger(language());
	}
	
	
	
}
