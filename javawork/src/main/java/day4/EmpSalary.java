package day4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import day3.emp.Employee;

public class EmpSalary {

	String filename;
	List<Employee> list = new ArrayList<>();
	private long sum;
	
	public long getSum() {
		return sum;
	}
	
	public EmpSalary(String filename) {
		super();
		this.filename = filename;
	}

	// 초기화
	public void init() {
		Scanner scanner = null;
		
		
		try {
			scanner = new Scanner(new File(filename));

			// 2. 라인만큼 반복문
			while (scanner.hasNext()) {
				// 3. 사번 이름 급여 출력
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
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	// 급여계산
	public void cal() {
		// 명령형 프로그래밍( 절차지향, 객체지향) why
		for(Employee e : list) {
			sum += e.getSalary();
		}
		list.stream()
			.mapToLong(Employee::getSalary)
			.sum();
	}

	// 정렬
	public void sort() {
		Comparator<Employee> compare = (o1, o2) -> (int)(o1.getSalary() - o2.getSalary());
		list.sort(compare);
	}

	// 출력
	public void print() {
		for(Employee emp : list) {
			System.out.println(emp);
		}
	}
}
