package com.class15;

public class Phone {
	String os, GB, model, chargerPort, Brand;

	public static void main(String[] args) {
		Phone pho1 = new Phone();
		System.out.println("------phone1------");
		pho1.os="IOS";
		pho1.Brand="IPHONE";
		pho1.GB="510GB";
		pho1.model="Xs Max ";
		pho1.chargerPort="Lighting cable";
	
		pho1.watchMovie();
		pho1.listenMusic();
		pho1.playGame();
		
		Phone pho2 = new Phone();
		System.out.println("------phone2------");

		pho2.os="Android";
		pho2.Brand="Samsung";
		pho2.GB="250GB";
		pho2.model="S10";
		pho2.chargerPort="Type C";
		
		pho2.watchMovie();
		pho2.listenMusic();
		pho2.playGame();
		
		Phone pho3 = new Phone();
		System.out.println("------phone3------");

		 pho3.model = "Nokia Lumia";
	        pho3.chargerPort = "Proprietary Charger";
	        pho3.GB = "16GB";
	        pho3.watchMovie();
			pho3.listenMusic();
			pho3.playGame();
		
	}void watchMovie() {
		System.out.println("we can watch movies on a "+Brand);
	}
	void listenMusic() {
		System.out.println("We can listen to music on "+Brand);
	}
	void playGame() {
		System.out.println("We can play games on "+Brand);
		
	}

}
