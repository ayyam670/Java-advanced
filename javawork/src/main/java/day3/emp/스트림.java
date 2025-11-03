package day3.emp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class 스트림 {

	public static void main(String[] args) {
		String[] strArr = {"키위","포도","바나나","사과","감","사과"};
		Stream.of(strArr)
			.sorted()
			.limit(3)
			.forEach(System.out::println);
		
		// 사과가 몇개 있나?
		long cnt = Stream.of(strArr).filter((word) -> word.equals("사과")).count();
		System.out.println(cnt);
		
		List<Employee> list = Arrays.asList(new Employee(100, "고길동", 2000),
				new Employee(101, "강감찬", 3000),
				new Employee(102, "김유신", 4000)
				);
		
		// 급여합계
		long sal = list.stream().mapToLong((Employee e) -> e.getSalary()).sum();
		System.out.println(sal);
	}
}
