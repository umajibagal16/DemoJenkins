package test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {

		String str = "Java";
		int cnt = 0;
		Map<String, Integer> count = new HashMap<>();
		// String data="";
		try {
			String data = ReadTextFile.getFileData();
			String res[] = data.split(" ");
			for (String s : res) {

				if (s.equals(str)) {
					cnt++;
				}
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("String  : "+str+" and count is "+cnt);
	}

}
