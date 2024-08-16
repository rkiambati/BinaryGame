import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class BtoDtest {
	public static void main(String args[]) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		int score = 0;
		for(int i = 0; i < 10; i++) {
			Bite bite = new Bite();
			//Random Number code
			int num = rand.nextInt(256);
			System.out.println("Convert these binary numbers to decimal:");
			bite.setBite(num);
			System.out.println(bite.getStringBite());
			
			String sanswer = reader.readLine();
			int answer = Integer.parseInt(sanswer);
			if(answer == bite.getByteD()) {
				System.out.println("Correct!");
				score += 1;
			}
			else {
				System.out.println("Wrong! The Correct answer was " + bite.getByteD());
			}
		}
		score *=10;
		System.out.println("Game Over! Final score " + score + "%");
	}
}
