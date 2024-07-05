package ch16.io.write;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExam {

	public static void main(String[] args) throws Exception {
		// write메서드는 자바의 데이터를 파일로 저장하는 기능을 제공함.
		OutputStream outputStream = new FileOutputStream("c:\\Temp\\text.txt");
		byte[] data = "가나다".getBytes(); // "" 안의 글자를 byte 배열에 집어넣음.
		for (int i = 0; i < data.length; i++) {
			outputStream.write(data[i]);
		}
		System.out.println("메모장에서 확인해보세요");
		outputStream.flush(); // 남아있는 쓰레기값 처리
		outputStream.close(); // 종료
	}

}
