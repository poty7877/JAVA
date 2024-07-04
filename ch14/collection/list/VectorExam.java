package ch14.collection.list;

import java.util.List;
import java.util.Scanner;
import java.util.Vector;

public class VectorExam {

	public static void main(String[] args) {
		// Vector는 List 컬렉션의 자식객체로 메서드가 같다.
		// 단, 동기화된 메서드로 구성되어 있어서 멀티쓰레드가 동시에 이 메서드를 실행 할 수 없다.
		// 하나의 쓰레드가 실행을 완료해야 다른 쓰레드를 실행 할 수 있다.
		// 멀티 쓰레드 환경에서 안전하게 객체를 추가, 삭제(좌석 예약, 상품 재고)

		List<BoardDTO> listB = new Vector<BoardDTO>();

		listB.add(new BoardDTO("제목1", "내용1", "작성자1"));
		listB.add(new BoardDTO("제목2", "내용2", "작성자2"));
		listB.add(new BoardDTO("제목3", "내용3", "작성자3"));
		listB.add(new BoardDTO("제목4", "내용4", "작성자4"));
		listB.add(new BoardDTO("제목5", "내용5", "작성자5"));
		listB.add(new BoardDTO("제목6", "내용6", "작성자6"));

		BoardDTO boardDTO = listB.get(1);
		System.out.println("==== 벡터 객체의 1번 인덱스 정보 ====");
		System.out.println(boardDTO.getSubject() + " 제목 ");
		System.out.println(boardDTO.getContent() + " 내용 ");
		System.out.println(boardDTO.getWriter() + " 작성자 ");

		BoardDTO newBoardDTO = new BoardDTO();
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("제목을 입력 하세요 : ");
		newBoardDTO.setSubject(scanner.next());
		System.out.print("내용을 입력 하세요 : ");
		newBoardDTO.setContent(scanner.next());
		System.out.print("작성자를 입력 하세요 : ");
		newBoardDTO.setWriter(scanner.next());
		//BoardDTO newBoardDTO = new BoardDTO(subject, content, writer);
		listB.add(newBoardDTO);
		System.out.println(newBoardDTO.toString());
		
		listB.remove(2);
		System.out.println("---- 전체 리스트 ----");
		for(BoardDTO list : listB) {
			System.out.println(list.getSubject() + " : " + list.getContent() + " : " + list.getWriter());
		}

	}

}
