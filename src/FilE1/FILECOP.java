package FilE1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FILECOP {
	public static void main(String[] args) throws IOException {
		File fs = new File("E:\\My Programs\\lpg\\WebDriver\\abc.text");
		fs.createNewFile();
		System.out.println(fs.exists());
		FileWriter fw = new FileWriter(fs);
		fw.write("i m a boy");
		fw.close();
		FileReader fr= new FileReader(fs);
		char[] ch = new char[(int) (fs.length())];
		fr.read(ch);
		for(char ch1:ch)
		{
			System.out.print(ch1);
		}	
	}
}
