package ch14.collection.properties;

import java.io.FileReader;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Properties;

public class JdbcExam {

	public static void main(String[] args) throws Exception {
		// properties는 텍스트 문서를 java코드의 <k, v> 형태로 불러온다.

		Properties properties = new Properties(); // 빈 객체 생성

		String path = JdbcExam.class.getResource("jdbc.properties").getPath();
		// 파일의 위치 정보를 path에 넣음,

		System.out.println(path);
		path = URLDecoder.decode(path, "utf-8");
		// 한국어가 있읈 있으니 utf-8로 처리
		properties.load(new FileReader(path));
		// properties로 불러옴.
		
		String driver = properties.getProperty("driver");
		System.out.println("오라클 드라이버 : " + driver);
	}

}
