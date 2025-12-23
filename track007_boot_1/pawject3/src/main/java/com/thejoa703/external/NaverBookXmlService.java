package com.thejoa703.external;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Service
public class NaverBookXmlService {
	
	@Value("${naverbook.clientId}")
	String clientId;
	@Value("${naverbook.clientSecret}")
	String clientSecret;  //네이버북 
	
	@JsonIgnoreProperties(ignoreUnknown = true) // 정의 되지 않은 태그들은 무시
	static class Channel{
		@JacksonXmlProperty(localName="items")
		@JacksonXmlElementWrapper(useWrapping = false) // items들을 묶어서 wrapper 태그 없이 <item></item>   <item></item>	
		private List<BookDto> items;
		
		public List<BookDto> getItems() { return items; }
		public void setItems(List<BookDto> items) {this.items = items;}
	}
	
	@JsonIgnoreProperties(ignoreUnknown = true)
	static class Rss{
		@JacksonXmlProperty(localName="channel")
		private Channel channel;
		public Channel getChannel() { return channel; }
		public void setChannel(Channel channel) {this.channel = channel;}
	}
	
	
	//Dao 가져오기##
	public List<BookDto> getBooks(String query) throws UnsupportedEncodingException{
		RestTemplate restTemplate = new RestTemplate();
		XmlMapper xmlMapper = new XmlMapper();//####
		
//		String clientId="S";  
//		String clientSecret="4";
		String param = "?query=" + URLEncoder.encode(query,"UTF-8");
		String url = "https://openapi.naver.com/v1/search/book.xml" + param; //####
		
		HttpHeaders headers = new HttpHeaders();
		headers.set("X-Naver-Client-Id", clientId);
		headers.set("X-Naver-Client-Secret", clientSecret);
		headers.set("Accept", "application/xml"); //####
		
		HttpEntity<String> entity = new HttpEntity<>(null, headers);	
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity,String.class
				);
		//////////////////////////////////////////////////////////////////////	
		try {
		
		Rss rss = xmlMapper.readValue(response.getBody(), Rss.class);
		return rss.getChannel().getItems(); // List<BookDto> 켈렉션프레임워크  list 형식으로 받아서 -> db 처리
		}catch (Exception e) {
			throw new RuntimeException("xml 파싱오류", e);
		}
		/*List<BookDto> result = new ArrayList<>();
		try {
			JsonNode  root= objectMapper.readTree(response.getBody());
			System.out.println("............" + root);
			for(JsonNode item : root.path("items")) {
				BookDto book = new BookDto();
				book.setTitle(item.path("title").asText());
				book.setImage(item.path("image").asText());			
				book.setAuthor(item.path("auther").asText());
				result.add(book); // db - insert ##
				
			}
		}catch (Exception e) {e.printStackTrace();}		
		return  result;*/
	}

}
