

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class demoAnotaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		InstrumentoMusical instrumento = context.getBean("miGuitarra",InstrumentoMusical.class);
		
		System.out.println(instrumento.obtenerSonido());
		
		context.close();
	}

}
