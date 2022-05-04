//사진 복사
package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex01 {
	
	public static void main (String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\byteImg.jpg");		//새로 생성될 파일의 경로와 이름 
		
		while(true) {
			int data = in.read();
			
			if(data == -1) {
			System.out.println("복사끝"  +  data);
				break;		//데이터가 -1이 나오면 끝
			}
			
			out.write(data);
			
		}	
		
		out.close();
		in.close(); 		//스캐너처럼 미리 쓰기
	}
}
