package tyss_JAVA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class VerifyText {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new FileReader("./A.txt"));
		String s = "Rajesh";
//		String s1[];
		String line = null;
		while ((line = b.readLine()) != null) {
//			s1=line.split(" ");
			if (line.indexOf(s)!=-1) {
				System.out.println("pass");
			}
		}
		b.close();
	}
}