package com.thejoa703.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;  //##
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

@Service
public class KakaoPayService {

   @Value("${kakaopay.secret-key-dev}")
   private String secretKey;
   
   @Value("${kakaopay.approval-url}")
   private String approval;

   @Value("${kakaopay.fail-url}")
   private String fail;
   
   @Value("${kakaopay.cancel-url}")
   private String cancel;
   
   private String tid;  // 결제 준비시 받은 거래 id저장
   
   
   // 결제준비
   public Map<String, String>  kakaoPayReady(     ){
      String  url="https://open-api.kakaopay.com/online/v1/payment/ready"; 
      HttpHeaders headers = new HttpHeaders();  //org.springframework.http.HttpHeaders
      headers.add("Authorization","SECRET_KEY " + secretKey);
      headers.add("Content-Type" ,"application/json");
      
      Map<String, Object>  params = new HashMap<>();
      params.put("cid", "TC0ONETIME"); //발급받은 가맹점번호
      params.put("partner_order_id", "partner_order_id");  // 가맹점 주문번호, 최대 100자
      params.put("partner_user_id" , "partner_user_id");  // 가맹점 회원 id, 최대 100자 (실명, 휴대폰번호, 이메일주소, ID와 같은 개인정보 전송 불가)
      params.put("item_name", "초코파이");  // 상품이름-상품번호
      params.put("quantity", 1);  //상품 수량
      params.put("total_amount", 2200);    // 상품 총액
      params.put("vat_amount"  , 200);     // 상품 부가세 금액
      params.put("tax_free_amount"  , 0);  //   상품 비과세 금액
      params.put("approval_url", approval);    // 결제 성공 시 redirect url, 최대 255자
      params.put("fail_url"    , fail);        // 결제 실패 시 redirect url, 최대 255자
      params.put("cancel_url"  , cancel);      //   결제 취소 시 redirect url, 최대 255자
       
      HttpEntity<Map<String, Object>>  request = new HttpEntity<>(params, headers); //org.springframework.http.HttpEntity
      RestTemplate   restTemplate   = new RestTemplate();
      ResponseEntity<String>  response = restTemplate.postForEntity(url, request, String.class);
      
      JsonObject jsonObject=  JsonParser.parseString(response.getBody()).getAsJsonObject();
      tid = jsonObject.get("tid").getAsString(); // 거래id저장
      String redirectUrl = jsonObject.get("next_redirect_pc_url").getAsString();
      
      Map<String, String> result = new HashMap<>();
      result.put("redirectUrl", redirectUrl);
      return result;
   } 
   
   
   // 결제승인
   public Map<String, Object>  kakaoPayApprove(String pgToken){
      String  url="https://open-api.kakaopay.com/online/v1/payment/approve"; 
      HttpHeaders headers = new HttpHeaders();  //org.springframework.http.HttpHeaders
      headers.add("Authorization","SECRET_KEY " + secretKey);
      headers.add("Content-Type" ,"application/json");
      
      Map<String, Object>  params = new HashMap<>();
      params.put("cid", "TC0ONETIME"); //발급받은 가맹점번호
      params.put("partner_order_id", "partner_order_id");  // 가맹점 주문번호, 최대 100자
      params.put("partner_user_id" , "partner_user_id");  // 가맹점 회원 id, 최대 100자 (실명, 휴대폰번호, 이메일주소, ID와 같은 개인정보 전송 불가)
      params.put("tid", tid);  
      params.put("pg_token", pgToken);  
        
      HttpEntity<Map<String, Object>>  request = new HttpEntity<>(params, headers); //org.springframework.http.HttpEntity
      RestTemplate   restTemplate   = new RestTemplate();
      ResponseEntity<String>  response = restTemplate.postForEntity(url, request, String.class);
      
      JsonObject jsonObject=  JsonParser.parseString(response.getBody()).getAsJsonObject();
      Map<String, Object> result = new HashMap<>(); 
      
      if(jsonObject.has("aid")) {
         result.put("aid", jsonObject.get("aid").getAsString()   );
      }
      if(jsonObject.has("amount")) {
         JsonObject  amountObject = jsonObject.getAsJsonObject("amount");
         result.put("total", amountObject.get("total").getAsInt());
         result.put("vat"  , amountObject.get("vat").getAsInt());
      }
      result.put("status","success"); 
      return result;
   }
   
   ////////////////////////////// KakaoController
  
   
   
   
   
}
