package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Network001 {

	public static void main(String[] args) {
		// 1. Url
		try {
			URL url = new  URL("https://www.google.com/");
			// 2. 연결객체
			
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			
			// 3. 요청설정
			conn.setRequestMethod("GET");
			conn.setDoInput(true);
			conn.setDoOutput(true);
			conn.setReadTimeout(1000);
			
			// 4. 응답코드
			int code = conn.getResponseCode(); // 구글에서 응답
			System.out.println(code); // 200 응답성공!
					
			
			// 5. 응답데이터
			BufferedReader  br;
			if(code == 200) { // 한줄씩읽을 수 있계 속도향상 - 바이트스트림을 문자 스트림 - 응답 데이터 스트림
				br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			}else {
				br = new BufferedReader ( new InputStreamReader(  conn.getErrorStream()));
			}
			String line = "" ;
			StringBuffer sb = new StringBuffer();
			while ( ( line = br.readLine()) != null) { sb.append(line+"\n");}
			
			System.out.println((sb.toString()));
			 br.close();
			 conn.disconnect();
		} catch (MalformedURLException e) {  e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		

	}

}

/*
1. id/secret
Client ID      AqGs1swmWieSswFk8doU
Client Secret   4B8igOnoSi

2. 요청 URL  
https://openapi.naver.com/v1/search/book.xml   XML
https://openapi.naver.com/v1/search/book.json   JSON

3. HTTP 메서드  : GET

4. 파라미터  - 요청내용을 주소표시창줄에 데이터 넣어서 줄께-    파라미터를 쿼리 스트링 형식으로 전달합니다.
파라미터   타입   필수여부   설명
query   String   Y   검색어. UTF-8로 인코딩되어야 합니다.

https://openapi.naver.com/v1/search/book.xml?query=사용자가요청한값    (쿼리 스트링 형식)
https://openapi.naver.com/v1/search/book.json?query=사용자가요청한값    (쿼리 스트링 형식)
*/