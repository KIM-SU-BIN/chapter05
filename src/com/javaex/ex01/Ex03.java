package com.javaex.ex01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\img.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out); // out을 buffered한테 준다~
		// bout은 이름 지은 것

		System.out.println("복사시작");
		while (true) {
			int data = bin.read();

			if (data == -1) {
				System.out.println("복사끝" + data);
				break;
			}

			bout.write(data);
		}

		bout.close();
		bin.close(); // 이게 in.close(); 컨트롤함
		// in.close();
	}
}