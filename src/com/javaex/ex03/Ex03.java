//배열을 사용 => split(",")
//person name hp compant리스트에 넣어 관리 : Arraylist=>List<Person>pList = new ArrayList<Person>
//add사용하여 본인 정보 기입 (총 4건의 정보 출력)

package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex03 {

	public static void main(String[] args) throws IOException {

		InputStream in = new FileInputStream("C:\\javaStudy\\file\\PhoneDB.txt");
		InputStreamReader db = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(db);
		ArrayList<Person> pList = new ArrayList<Person>();

		while (true) {
			String str = br.readLine();

			if (str == null) {
				break;

			} else {
				String[] str1 = str.split(",");
				pList.add(new Person(str1[0], str1[1], str1[2]));
			}
		}

		
		
		// 배열 추가
		Person sb = new Person("김수빈", "01012345678", "0310000000");
		pList.add(sb);

		for (Person per : pList) {
			per.showInfo();
		}

		br.close();
	}
}
