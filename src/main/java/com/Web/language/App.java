package com.Web.language;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {
			ILanguageDal language= context.getBean("language", ILanguageDal.class);
			
			language.dil();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    }
}
