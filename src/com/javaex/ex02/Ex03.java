package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\MS949.txt"); // 101010으로 읽고 다음단계에서 어떤 언어로 읽을지 설정해줘야함
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);

		OutputStream out = new FileOutputStream("C:\\javaStudy\\file\\MS949.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out, "MS949");
		BufferedWriter bw = new BufferedWriter(osw);

		while (true) {
			String str = br.readLine();
			System.out.println(str); // 한줄 읽고 출력 또 한 줄읽고 출력

			if (str == null) {
				break;
			}
			System.out.println(str); // 화면 출력
			bw.write(str); // 쓰기 끝
			bw.newLine(); // 줄바꿈

		}

		bw.close();
		br.close();

	}
}
