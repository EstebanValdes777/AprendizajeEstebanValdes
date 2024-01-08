

import org.springframework.stereotype.Component;

@Component("miGuitarra")
public class Guitarra implements InstrumentoMusical {

	public String obtenerSonido(){
		// TODO Auto-generated method stub
		return "sonido de guitarra";
	}

	

}
