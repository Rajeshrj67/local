package tyss_JAVA;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {

	public static void main(String[] args) throws IOException {

//		File f=new File("./A.txt");
//		FileReader fr=new FileReader(f);
		BufferedReader b=new BufferedReader(new FileReader("./A.txt"));
		//System.out.println(b.readLine());
		String s=null;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		b.close();
	}
}