package FilE1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuFFer {

	public static void main(String[] args) throws IOException {
		File fs = new File("E:\\My Programs\\lpg\\WebDriver\\abc.text");
		FileReader fr= new FileReader(fs);
		BufferedReader br = new BufferedReader(fr);
		String line = br.readLine();
		while(line!=null){
			System.out.println(line);
			line=br.readLine();		
		}
     br.close();
	}
}
