package com.Web.language;

/*import org.springframework.stereotype.Component;

@Component("language")*/ // bu yerda Componetni ochirib tashladik chunki ortiq sinflarimizni Beanlar bilan boshqarayabmiz
public class EnglishLan implements ILanguageDal{

	@Override
	public void dil() {
		System.out.println("Change language to English");
		
	}

}
