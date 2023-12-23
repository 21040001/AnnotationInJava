package com.Web.language;

import org.springframework.stereotype.Component;

@Component("language")
public class EnglishLan implements ILanguageDal{

	@Override
	public void dil() {
		System.out.println("Change language to English");
		
	}

}
