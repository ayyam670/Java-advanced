package day2;

/**
 * @author Hwang
 * @since 1.4
 */

public class StringUtil {

	/**
	 * 주민번호로 출생년도 추출
	 * @param id 주민번호
	 * @return 년도 4자리
	 */
	public static String getYear(String id) {
		
		// id 가 없으면 빈값 리턴
		if(id == null) {
			return "";
		}		
		String result = id.substring(0, 4);
		return result;
	}
	
	// 년, 월, 일을 join해서 리턴
	public static String getDate(String ... date) {
//		return date[0] + "-" + date{1] + "-" + date[2];
		return String.join("-", date);
	}
	
	public static String getDate(String y, String m, String d) {
//		return y + "-" + m + "-" + d;
		return String.join("-", y, m, d);
	}
	
	// 년도 추출
	public static String getSplitYear(String date) {
		if(date == null) {
			return "";
		}
		String[] result =  date.split("-");
		return result[0];
	}
	
}
