import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
public class TestResourcebundling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		int choice=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Hindi\n2.US english\nUk English\n4. France\n choice: ");
		choice=sc.nextInt();
		MessageSource ms=(MessageSource)ctx.getBean("messageSource");
		String m=null,w=null,d=null,c=null;
		Locale locale=null;
		switch(choice) {
		case 1:
			locale=new Locale("hindi","IN");
			System.out.println("Language : "+locale.getLanguage()+"----country: "+locale.getCountry());
			break;
		case 2:
			locale=Locale.US;
			System.out.println("language : "+locale.getLanguage()+"----country: "+locale.getCountry());
			break;
		case 3: 
			locale=Locale.UK; 
			System.out.println("language : "+locale.getLanguage()+"----country: "+locale.getCountry());
			break;
		case 4:
			locale=Locale.FRANCE;
			System.out.println("language : "+locale.getLanguage()+"----country: "+locale.getCountry());
		default:
			System.out.println("wrong choice");
		}
		m=ms.getMessage("msg.pay",null, locale);
		w=ms.getMessage("msg.welcome",new Object[]{"Dhruv"}, locale);
		d=ms.getMessage("msg.data",null, locale);
		c=ms.getMessage("msg.currency",null, locale);
		System.out.println("pay: "+m);
		System.out.println("welcome: "+w);
		System.out.println("data : "+d);
		System.out.println("currency: "+ c);
	}

}
