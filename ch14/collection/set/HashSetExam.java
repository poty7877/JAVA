package ch14.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExam {

	public static void main(String[] args) {
		// Set 인터페이스에는 HashSet, LinkedHaseSet, TreeSet 등이 있다.
		// Set은 중복되지 않는, "인덱스가 없는 객체"를 담아놓은 구슬 주머니 임.

		Set<String> setHashSet = new HashSet<String>();
		Set<String> linkedSetHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		setHashSet.add("Java");
		setHashSet.add("Oracle");
		setHashSet.add("JDBC");
		setHashSet.add("HTML");
		setHashSet.add("CSS");
		setHashSet.add("JavaScript");
		setHashSet.add("JDBC");

		int size = setHashSet.size(); // 객체수 반환
		System.out.println("set 객체수 : " + size);

		System.out.println("=====인덱스가 없어서 for문으로 전체출력 안됨=====");
		Iterator<String> iterator = setHashSet.iterator(); // 공식. 반복자 타입에 set타입 연결.
		int i = 0;
		while (iterator.hasNext()) { // .hasNext : 다음에 가져올게 있으면 true, 가져올게 없으면 false..
										// 가져올게없으면 while문이 false로 종료된다.
			String element = iterator.next(); // next() : 가져온 값을 element에 넣음.

			System.out.println(++i + "번 " + "객체 : " + element); // 객체가 전부 반환되긴 하나, 순서가 일정하지않음.
		} // while 종료

		setHashSet.remove("CSS");

		int j = 0;
		System.out.println("=====인덱스가 없어서 for-each문으로 출력해보자=====");
		for (String entity : setHashSet) {
			System.out.println(++j + "번 객체 : " + entity);
		}

	}// main method 종료

}
