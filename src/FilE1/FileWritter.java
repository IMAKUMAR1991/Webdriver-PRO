package FilE1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWritter {

	public static void main(String[] args) throws FileNotFoundException {
		File fs = new File("E:\\My Programs\\lpg\\WebDriver\\abc.text");
		PrintWriter pw = new PrintWriter(fs);
		pw.write("i m a good boy ");
		pw.println(" i m  ANAND");
        pw.flush();
        pw.close();
	}
}
