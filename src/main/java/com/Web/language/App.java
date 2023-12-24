package com.Web.language;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
        //bu yerdagi ClassPathXml ni AnnotationConfigga almashtridik
    	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class)) {
			
    		//1-yol --->
    		//bu yerda to'gridan LanguageMeneger bilan ishlayabmiz
    		LanguageMeneger language= new LanguageMeneger(context.getBean("language", ILanguageDal.class));
    		
			//2-yol
    	    // Bu yerda ILanguageMeneger interface orqali ham ILanguageMenegerni boshqarayabmiz
    		//ILanguageMeneger language= context.getBean("iLanMen", ILanguageMeneger.class);
    		
			language.dil();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
