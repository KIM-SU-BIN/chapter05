//배열을 사용 => split(",")
//person name hp compant리스트에 넣어 관리 : Arraylist=>List<Person>pList = new ArrayList<Person>
//add사용하여 본인 정보 기입 (총 4건의 정보 출력)
//
package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class PhonebookApp {

	public static void main(String[] args) throws IOException {

		
		Reader db = new FileReader("C:\\javaStudy\\file\\PhoneDB.txt");
		BufferedReader br = new BufferedReader(db);

		
		while (true) {
			String str = br.readLine();
			// System.out.println(str.toString()); 위의 String 주소가 없으면(즉, null이면) 결과 출력할 수 없음
			
		
			if (str == null) {
				break;
			}			

			
			/*
			 String[] personInfo =  str.split(",");
			 
			 String name = personInfo[0]; 
			 String hp = personInfo[1]; 
			 String company = personInfo[2];
			 
			 System.out.println("이름: " + name); 
			 System.out.println("핸드폰: " + hp);
			 System.out.println("회사: " + company); 
			 System.out.println("");
			 */


			System.out.println(str.toString());
		}
		
		br.close();
	}
}
