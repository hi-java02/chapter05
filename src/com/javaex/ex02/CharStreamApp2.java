package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class CharStreamApp2 {

	public static void main(String[] args) throws IOException {
		
		//Reader fr = new FileReader("C:\\javaStudy\\MS949.txt");
		Reader fr = new FileReader("C:\\javaStudy\\song.txt");
		BufferedReader br = new BufferedReader(fr);
	
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈기호는 제외
			if(str == null) {
				break;
			}
			System.out.println(str);
		
		}
			
		fr.close();

	}

}
