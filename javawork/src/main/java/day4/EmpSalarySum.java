package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

/*
 *  사원 급여 합계 계산
 *  클래스
 *  data(필드)
 *  	List
 *  	filename
 *  
 *  기능(메서드)
 *  	List 초기화
 *  	급여계산
 *  	정렬
 *  	출력
 */
public class EmpSalarySum {

	public static void main(String[] args) {
		// emp.txt
		// 1. scanner
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("c:/Temp/emp.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		List<Employee> list = new ArrayList<>();
		
		
		int sum = 0;
		// 2. 라인만큼 반복문 실행
		while (scanner.hasNext()) {
			String emp = scanner.nextLine();
			
			String[] sal = emp.split(",");
			
			int id = Integer.parseInt(sal[0]);
			String name = sal[1];
			long salary = Long.parseLong(sal[7]);
			
			list.add(new Employee(id, name, salary));
			
			
			// 3. 사번, 이름, 급여출력
//			System.out.println(sal[0] + sal[1] + sal[7]);
			
			// 4. 급여합계 출력
//			sum += Integer.parseInt(sal[7]);
		}
//		System.out.println("급여의 합계는 : " + sum);
		
		// 급여순으로 정렬해서 출력
		Comparator<Employee> compare = (o1, o2) -> (int)(o1.getSalary() - o2.getSalary());
		list.sort(compare);
		for( Employee s : list) {
		System.out.println(s);
		}
		System.out.println("====================");
		// 스트림
		list.stream()
			.sorted(compare)
//			.collect(Collectors.toList());
			.forEach(e -> {System.out.println(e);});
//			.forEach(System.out::println);
		
		
	}
}
