package com.class15;

public class Computer {
String mouse,keyboard, screen,ram,os,brand;

	public static void main(String[] args) {
		Computer com1= new Computer();
		com1.mouse="ninja air";
		com1.keyboard="logitech";
		com1.screen="HP";
		com1.ram="8GB";
		com1.os="Windows";
		com1.brand="HP";
		
		com1.watchMovie();
		com1.doJavaCoding();
		com1.playGame();
		
		Computer comp2 = new Computer();
        comp2.mouse = "touch pad";
        comp2.keyboard = "garbage";
        comp2.screen = "Pro";
        comp2.ram = "6 GB";
        comp2.os = "Mac OS";
        comp2.brand="Apple";
        
        comp2.watchMovie();
		comp2.doJavaCoding();
		comp2.playGame();
	}
	void watchMovie() {
		System.out.println("we can watch movies on a computer "+brand);
	}
	void doJavaCoding() {
		System.out.println("We can do Java coding on computer "+brand);
	}
	void playGame() {
		System.out.println("We can play games on computer "+brand);
	}
}
