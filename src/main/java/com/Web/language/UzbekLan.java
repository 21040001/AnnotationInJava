package com.Web.language;

import org.springframework.beans.factory.annotation.Value;

public class UzbekLan implements ILanguageDal{
	@Value("${language}")
	String language ; 
	@Override
	public void dil() {
		System.out.println("O'zbek tiliga otkazildi "+language);		
	}

}
