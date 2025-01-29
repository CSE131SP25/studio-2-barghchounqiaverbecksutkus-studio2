package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int startAmount = 6;
		double winChance = 0.5;
		int winLimit = 10;
		int totalSimulations = 10;
		String result = "";
		
		for (int i = 0; i < totalSimulations; i++) {	
			while(startAmount < winLimit && startAmount > 0) {
				double x = Math.random();
				if(x <= winChance) {
					startAmount ++;
					result = "win";
					
				}else {
					startAmount --;
					result = "lose";
				}
			}
				
			System.out.println("simulation " + i + ": " + startAmount + " " + result);
			if (result == "win") {
				winLimit = startAmount + 10;
			}else {
				startAmount = 6;
				winLimit = 10;
			}
			}
		}
	}	

