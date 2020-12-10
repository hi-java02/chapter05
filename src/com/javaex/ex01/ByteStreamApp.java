package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException {
		//InputStream  FileInputStream
		//OutputStream FileOutputStream
		
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\buffimg.jpg");
		
		byte[] buff = new byte[1024];
		
		System.out.println("복사시작(쟁반)");
		while(true) {
			int bData= in.read(buff);
			if(bData == -1) {
				System.out.println("복사끝(쟁반)");
				break;
			}
			out.write(buff);
			
		}
		
		out.close();
		in.close();

		/*
		InputStream in = new FileInputStream("C:\\javaStudy\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\javaStudy\\byteimg.jpg");
		
		System.out.println("복사시작");
		while(true) {
			int bData = in.read();
			if(bData == -1) {//데이터의 마지막인지 체크--> 마지막이면 -1 리턴
				System.out.println("복사끝");
				break;       //마직막이면 반복문 탈출
			}
	
			out.write(bData); //데이터가 있으면 쓴다.
		}
		
		out.close();  //스트림 닫는거 잊지 말것
		in.close();   //스트림 꼭 닫을것
		*/
	}

}
