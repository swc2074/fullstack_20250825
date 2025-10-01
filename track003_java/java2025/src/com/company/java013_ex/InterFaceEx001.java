package com.company.java013_ex;

interface Board { void exec(); }

class BoardInsert implements Board {  @Override public void exec() {  System.out.println("글쓰기"); } }

class BoardSelect implements Board {  @Override public void exec() { System.out.println("글읽기");} }

class BoardUpdate implements Board {  @Override public void exec() {  System.out.println("글읽기");} }

class BoardDelete implements Board {  @Override public void exec() {  System.out.println("글삭제");} }

//////////////////////////////////////
public class InterFaceEx001 {
	public static void main(String[] args) {
		Board controller = null;
		controller = new BoardInsert();
		controller.exec();
		controller = new BoardSelect();
		controller.exec();
		controller = new BoardUpdate();
		controller.exec();
		controller = new BoardDelete();
		controller.exec();
	}
}
//////////////////////////////////////