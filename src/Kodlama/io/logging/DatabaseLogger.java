package Kodlama.io.logging;

public class DatabaseLogger implements IBaseLogger {

	public void log(String data) {
		System.out.println("Veri tabanına loglandı : " + data);	
		
	}

}
