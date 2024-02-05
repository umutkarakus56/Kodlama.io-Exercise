package Kodlama.io.logging;

public class MailLogger implements IBaseLogger{

	public void log(String data) {
		System.out.println("Mail gönderildi : " + data);	
	
		
	}

}
