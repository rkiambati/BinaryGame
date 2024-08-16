import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class BtoHtest {
	public static void main(String args[]) throws Exception {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		int score = 0;
		
		for(int i = 0; i < 10; i++) {
			Bite bite = new Bite();
			int num = rand.nextInt(256);
			
			bite.setBite(num);
			String binary = bite.getStringBite();
			String hex =  Integer.toHexString(num);
			
			System.out.println("Convert these Binary numbers to Hexadecimal!");
			System.out.println(binary);
			String answer = reader.readLine();
			
			if(answer.equals(hex)) {
				System.out.println("Correct!");
				score += 1;
			}
			else {
				System.out.println("Wrong! The correct answer is " + hex);
			}
		}
		score *= 10;
		System.out.println("Game over! Your final score is " + score + "%");
	}
}
