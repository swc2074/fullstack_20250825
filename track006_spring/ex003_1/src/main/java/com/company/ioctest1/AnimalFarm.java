package com.company.ioctest1;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class AnimalFarm {
    @Value("${name}")  private String name;
    //@Autowired @Qualifier(name="${ani}") private Animal ani;
    @Resource(name = "${ani}") private Animal ani;
 
    public String aniSleep() { return name + ">" + ani.sleep(); }
    public String aniEat()   { return name + ">" + ani.eat(); }
    public String aniPoo()   { return name + ">" + ani.poo(); }
 
    public void print() { 
       System.out.println(  aniSleep()); 
       System.out.println(  aniEat()); 
       System.out.println(  aniPoo()); 
    }

 }