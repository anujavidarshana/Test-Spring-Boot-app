package testGame;

import java.util.Random;
import java.util.Scanner;

public class EasyMode {

	public void getEasyMode() {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random ranNum = new Random();
		
		for(int i = 0; i < 5; i++) {
			
			Integer num1 = ranNum.nextInt(10);
			Integer num2 = ranNum.nextInt(10);
			
			System.out.println(num1 + "+" + num2 + " = ?");
			
			int ans = scan.nextInt();
			
			if(num1+num2 == ans) {
				System.out.println("Your answer is correct");
				System.out.println("\n");
			}else {
				System.out.println("you are wrong");
				System.out.println("\n");
			}
		}
		
	}
}
