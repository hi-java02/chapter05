package com.javaex.ex04;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		//리스트 준비
		List<Person> list = new ArrayList<Person>();

		//스캐너 준비
		Scanner sc = new Scanner(System.in);
		
		//파일 읽어서 리스트에 입력
		Reader fr = new FileReader("C:\\javaStudy\\phoneDB.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String line ="";
		
		while(true) {
			line = br.readLine();
			if(line == null) {
				break;
			}
			String[] personInfo = line.split(",");
			
			Person person = new Person(personInfo[0], personInfo[1], personInfo[2]);
			list.add(person);
		}
		
		//출력
		System.out.println(list.toString());
		br.close();
		
		System.out.println("추가할 친구 정보를 입력하세요");
		line = sc.nextLine();
		String[] personInfo = line.split(",");
		
		Person person = new Person(personInfo[0], personInfo[1], personInfo[2]);		
		list.add(person);
		
		//리스트 출력해보기(리스트에는 인원이 추가되어 있다)
		System.out.println(list.toString());
		

		//리스트의 내용을 파일에 쓴다.
		//기존파일의 데이터는 모두 지워지고 모든 정보를 새로쓴다.-->리스트의 정보를 모두 파일로 쓴다.
		//추가된 인원만 쓰는게 아님
		Writer fw = new FileWriter("C:\\javaStudy\\phoneDB.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		for(Person p : list) {
			String str = p.getName() + "," + p.getHp() + "," + p.getCompany();
			bw.write(str);
			bw.newLine();
		}
		
		bw.close();
		sc.close();
	}

}
