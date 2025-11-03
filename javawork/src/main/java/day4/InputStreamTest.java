package day4;

import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamTest {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fw = new FileOutputStream("c:/Temp/data.txt");
		
		int readByte;
		while((readByte = System.in.read()) != -1 ) { // 컨트롤 + z(입력 후 마무리)
			fw.write(readByte);
		}
		fw.close();
	}
}
