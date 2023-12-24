package com.Web.language;

public class LanguageMeneger implements ILanguageMeneger{

	private ILanguageDal iLanguageDal;

	public LanguageMeneger(ILanguageDal iLanguageDal) {
	
		this.iLanguageDal = iLanguageDal;
	}
	
	public void dil() {
		iLanguageDal.dil();
		//bu yerda dil() fonksiyonimiz ILanguageDal interface ichidagi qaysi Fonksiyon ekanligini ko'rsatayabmiz
	}
	
}
