package day4;

import java.io.File;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * 폴더 = 파일 시스템 API (폴더생성, 삭제, 이름변경, 정보...)
 */
public class FileTest {

//	@Test
	@DisplayName("폴더목록조회")
	public void tes1() {
		File file = new File("c:/Temp");
		String[] files = file.list();

		for (String folder : files) {
			System.out.println(folder);
		}
	}

//	@Test
	@DisplayName("파일 삭제")
	public void test2() {
		File file = new File("c:/Temp", "copy3.txt");
		file.delete();
	}

//	@Test
	@DisplayName("파일정보")
	public void test3() {
		File file = new File("c:/Temp", "emp.txt");
		
		// 파일크기 출력
		System.out.println("파일크기: " + file.length());
		System.out.println("파일이름: " + file.getName());
		
		// 확장자 출력 -> txt
		// .의 위치 : indexOf
		int idx = file.getName().indexOf(".");
		String ext = file.getName().substring(idx +1);
		System.out.println(ext);
	}
	
	
}
