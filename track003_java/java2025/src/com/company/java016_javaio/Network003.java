package com.company.java016_javaio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class Network003 {

	public static void main(String[] args) {
		//#1. URL
		try {
			String apiurl="https://openapi.naver.com/v1/search/news.json?query="
					  + URLEncoder.encode("캄보디아" , "UTF-8");
		
			URL url = new URL(apiurl);
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			
			conn.setRequestMethod("GET");
			conn.setRequestProperty("X-Naver-Client-Id",     "Sv6Np2aSN0pSFPYWG8tR");
			conn.setRequestProperty("X-Naver-Client-Secret",   "44Kh9cfVhj");
		
			BufferedReader br;
			if(conn.getResponseCode() == 200) {
				br = new BufferedReader (new InputStreamReader(conn.getInputStream()));
			} else {
				br = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
			}
	
			String line ="";
			StringBuffer sb = new StringBuffer();
			while ( (line = br.readLine()) != null) {sb.append(line + "\n");}
			
			System.out.println(sb.toString());
			br.close();
			conn.disconnect();
		} catch (MalformedURLException e) {  e.printStackTrace();
		} catch (UnsupportedEncodingException e) { e.printStackTrace();
		} catch (IOException e) { e.printStackTrace();
		}
		

	}

}

