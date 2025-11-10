package com.thejoa703.ioc3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component("iceCreamShop")
public class IceCreamShop {
    @Value("${name}") private String   name;
    //@Autowired @Qualifier("white") private IceCream iceCream;
    @Resource(name="${iceCream}") private IceCream iceCream;
    
    public void open() {
       System.out.print("아이스크림 가게 오픈! 오늘의 맛은: ");
       iceCream.taste();
    }
 }   
