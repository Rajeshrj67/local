package tyss_JAVA;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {

	public static void main(String[] args) throws IOException {

		File f=new File("./A.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("first");
		bw.newLine();
		bw.write("second");
		bw.newLine();
		bw.write("third");
		bw.close();
		System.out.println("done");
	}

}
