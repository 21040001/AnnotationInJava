package com.Web.language;

import org.springframework.beans.factory.annotation.Value;

public class EnglishLan implements ILanguageDal{

	@Value("${language2}")
	String language;
	@Override
	public void dil() {
		System.out.println("Change language to English "+language);
		
	}

}
