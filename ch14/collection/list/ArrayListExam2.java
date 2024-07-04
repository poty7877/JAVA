package ch14.collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListExam2 {

	public static void main(String[] args) {
		// list 컬렉션은 Arraylist, Vector, LinkedList 3가지를 주로 사용.
		// list 컬렉션은 배열 대신 활용도가 높다. (길이가 자유롭다.)
		// list<String> 는 강한타입체크로 String만 들어간다.
		// List<String> list = new ArrayList<String>(); -> 10개가 만들어짐(기본값)

		List<String> listS = new LinkedList<String>(); // 다형성

		listS.add("Java"); 			// 0번 인덱스 -- Java 
		listS.add("Oracle"); 		// 1번 인덱스 -- Orcale : 데이터 베이스
		listS.add("JDBC"); 			// 2번 인덱스 -- JDBC : Java + DB 연동
		listS.add("HTML,CSS,JS"); 	// 3번 인덱스 -- 프론트
		listS.add("JSP"); 			// 4번 인덱스 -- java + db + 프론트
		listS.add("tomcat");		// 6번 인덱스 -- 서버 프로그래밍(servlet)
		listS.add("linux");			// 7번 인덱스 -- linux 배포서버
		listS.add(5, "servlet"); 	// 5번 인덱스 -- jsp + java
		listS.add("AWS");			// 8번 인덱스 -- 가상 배포 서버
		
		int size = listS.size();		
		System.out.println("총 객체수 : " + size);
		System.out.println("=========================");
		
		String skill = listS.get(2); // 2번 인덱스 값을 가져와 skill 변수에 넣음.
		System.out.println("2번 인덱스 값 : " + skill);
		System.out.println("=========================");
		System.out.println("==========전체출력==========");
		
		listS.remove(2);
		listS.remove(2);
		listS.remove("JSP");
		for(int i = 0; i < listS.size(); i++) {
			String str = listS.get(i);
			System.out.println(i + " 번째 값 : " + str);
		}
		
		
		
		System.out.println("=====for each로 전체출력====="); // index 사용 안함.
		for(String str : listS) {
			System.out.println(str);
			
		}

	}

}
