package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Ex01 {

	public static void main(String[] args) throws IOException {

		Writer fw = new FileWriter("C:\\javaStudy\\file\\song.txt"); // 글자니까 writer
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("학교종이 땡땡땡");
		bw.newLine(); // 줄바꿈
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");

		bw.close(); // 마찬가지로 밑에 있는 해를 포함하여 덮어줌
		// fw.close();
	}

}
