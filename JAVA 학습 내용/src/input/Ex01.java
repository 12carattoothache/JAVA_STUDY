package input;

import java.io.IOException;

public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		System.out.println("키코드 입력하고 엔터 : ");
		int keyCode;
		
		keyCode = System.in.read();
		// 1바이트만 읽을 수 있음
		// 숫자, 영문, 특수문자 O / 한글 X
		System.out.println(keyCode);
		

	}

}
