package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex02 {
	
	public static void main (String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteImg.jpg");		//새로 생성될 파일의 경로와 이름 
		
		
		byte[] buff = new byte[1024];
		

		while(true) {			//무한대로 돌리다가 -1이 나와야하기 떄문에 while사용
			
			int data = in.read(buff);		//Ex01은 순수하게 한 모금 씸 빨아들이고 Ex02는 쟁반을 주고 빨아들임  buff의 차이 (속도가 빨라짐~!!)
			if(data == -1) {
				System.out.println("복사끝" + data);
				break;
			}
			out.write(buff);
			
		}
			
		out.close();
		in.close(); 		//스캐너처럼 미리 쓰기
	}
}
