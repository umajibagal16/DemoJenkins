package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadTextFile {
	public static String getFileData() throws IOException {
		String path="C:\\eclipse-workspace-yash\\Demo\\src\\test\\test.txt";
		File file = new File(path);
		
		FileInputStream fis = new FileInputStream(file);
		byte data[]=fis.readAllBytes();
		String res = new String (data);
		return res;
	}

}
