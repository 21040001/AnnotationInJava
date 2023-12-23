package com.Web.language;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
        //bu yerdagi ClassPathXml ni AnnotationConfigga almashtridik
    	try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ClassConfig.class)) {
			ILanguageDal language= context.getBean("language", ILanguageDal.class);
			
			language.dil();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
