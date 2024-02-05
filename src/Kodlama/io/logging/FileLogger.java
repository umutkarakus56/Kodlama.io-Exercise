package Kodlama.io.logging;

public class FileLogger implements IBaseLogger{

	public void log(String data) {
			System.out.println("Dosyaya loglandı : " + data);	
		
	}

}
