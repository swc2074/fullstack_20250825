package com.company.java011_ex;



class Color{
	public String name;
	private int num;
	
	public String getName() { return name; } 
	public void setName(String name) { this.name = name; } 
	public int getNum() { return num; } 
	public void setNum(int num) { this.num = num; }
	
	
}


class Green extends Color{
	public void show() {
		System.out.println("GREEN");
		System.out.println("NAME:" + this.name);
		System.out.println("NUM :" + this.getNum());
	}
	
}




///////////////////////////////////////////////////////////
public class ExtendsEx001 {
    public static void main(String[] args){
        Green mygreen = new Green();
        mygreen.name = "LIGHT_GREEN";
        mygreen.setNum(5);//mygreen.num = 5;
        mygreen.show();
    }
}
///////////////////////////////////////////////////////////