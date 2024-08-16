import java.io.*;
import java.util.*;
import java.util.Random;
import java.util.Scanner;
public class DtoBtest {

	public static void main(String args[]) throws Exception{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		int score = 0;
		
		for(int i=0; i < 10; i++ ) {
			int number = rand.nextInt(256);
			Bite bV = new Bite();
			//Getting binary value of the decimal number
			bV.setBite(number);
			
			System.out.println("Convert the following number to Binary:");
			System.out.println(number);
			String answer = reader.readLine();
			
			if(answer.equals(bV.getStringBite())) {
				System.out.println("Correct!");
				score +=1;
		}
			else {
				System.out.println("Wrong! The correct answer is " + bV.getStringBite());
			}
		}
		System.out.println("Your score was " + score + "/10");
		
	}
}
