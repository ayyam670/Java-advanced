package day2;

public class StringUtilTest {

	public static void main(String[] args) {
		
		String year = StringUtil.getYear("19900801");
		
		System.out.println(year);
		
		String date = StringUtil.getDate("1994", "05", "04");
		System.out.println(date); // "2025-10-20"
		
		String regDate = "2025-10-10";
		String[] resultDate = regDate.split("-");
		
		for(String result : resultDate) {
			System.out.println(result);
		}
		
		System.out.println(resultDate[0]);
		
		String splitYear = StringUtil.getSplitYear(regDate);
		System.out.println(splitYear);

		
	}
}
